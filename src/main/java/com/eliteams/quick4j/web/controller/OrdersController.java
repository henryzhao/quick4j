package com.eliteams.quick4j.web.controller;


import com.eliteams.quick4j.core.entity.JSONResult;
import com.eliteams.quick4j.core.entity.Result;
import com.eliteams.quick4j.core.entity.resp.LoginResp;
import com.eliteams.quick4j.core.util.RandomUtil;
import com.eliteams.quick4j.web.model.Orders;
import com.eliteams.quick4j.web.model.Service;
import com.eliteams.quick4j.web.model.TransSerial;
import com.eliteams.quick4j.web.model.User;
import com.eliteams.quick4j.web.model.UserServiceRel;
import com.eliteams.quick4j.web.model.UserServiceRelExample;
import com.eliteams.quick4j.web.service.*;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by dell on 2017/4/18.
 */
@Controller
@RequestMapping("/orders")
public class OrdersController {

    private static Logger log = LoggerFactory.getLogger(OrdersController.class);


    @Autowired
    private OrdersService ordersService;
    @Autowired
    private UserService userService;
    @Autowired
    private UserServiceRelService userServiceRelService;
    @Autowired
    private ServiceService serviceService;
    @Autowired
    private TransSerialService transSerialService;


    @RequestMapping(value = "/dealOrder", method = {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    public JSONResult<Result> dealOrder(@RequestParam String orderId, String userId) throws Exception{
        JSONResult<Result> resp =new JSONResult<Result>();
        Result data =new Result ();
        resp.setData(data);
        resp.setStatusCode(200);
        resp.setMessage("处理成功");
        resp.setSuccess(true);

        Orders orders = ordersService.selectByOrderId(orderId);
        Subject subject = SecurityUtils.getSubject();
        String username = null;
        // 1已登陆则 获取当前登陆者的用户名
        if (subject.isAuthenticated()) {
            User user = (User)subject.getSession().getAttribute("userInfo");
            username = user.getUsername();
        }
        //2根据当前登陆者的用户名去得到当前用户负责的游乐项目
        User user_teller = userService.selectByUsername(username);
        //3设置当前订单的游乐项目和交易金额
        UserServiceRelExample example = new UserServiceRelExample();
        example.or().andUseridEqualTo(String.valueOf(user_teller.getUserid()));
        List<UserServiceRel> userServiceRels =  userServiceRelService.selectByExample(example);
        if(userServiceRels == null){
            resp.setMessage("暂无权限");
        	resp.setSuccess(false);
        	return resp;
        }else if(userServiceRels.size() >1){
            resp.setMessage("不允许该工作人员拥有多个售票权限");
            resp.setSuccess(false);
        	return resp;
        }
        String serviceId = userServiceRels.get(0).getServiceid();
        BigDecimal transAmt = serviceService.selectById(serviceId).getPrice();
        orders.setServiceid(serviceId);
        orders.setTransamt(transAmt);
        //4改变订单的状态
        orders.setOrderstatus("1");
        ordersService.update(orders);
        //5发起两笔流水
        //5.1向微信用户扣款
        //获取订单号
        TransSerial transSerial_wechat = new TransSerial();
        String serial_wechat_id = RandomUtil.getRandomTranSName();
        transSerial_wechat.setSerialid(serial_wechat_id);
        //获取订单时间
        SimpleDateFormat simpleDateFormatDate;
        simpleDateFormatDate = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat simpleDateFormatTime = new SimpleDateFormat("hh:mm:ss");
        Date date = new Date();
        String strDate = simpleDateFormatDate.format(date);
        String strTime = simpleDateFormatTime.format(date);
        
        transSerial_wechat.setTransdate(strDate);
        transSerial_wechat.setTranstime(strTime);
        //订单类型
        transSerial_wechat.setTranstype(String.valueOf('1'));//0-充值，1-扣款，2-上账
        //订单状态
        transSerial_wechat.setTransstatus(String.valueOf('1'));
        transSerial_wechat.setOpenid(userService.selectById(Long.parseLong(userId)).getOpenid());
        transSerial_wechat.setSerivceid(serviceId);
        transSerial_wechat.setOrderno(String.valueOf(orderId));
        transSerialService.insert(transSerial_wechat);
        User user_wechat = userService.selectById(Long.parseLong(userId));
        //判断余额是否够扣
        if ( user_wechat.getBalance().compareTo(transAmt)>=0) {
            user_wechat.setBalance(user_wechat.getBalance().subtract(transAmt));
        } else {
            resp.setMessage("余额不足");
            resp.setSuccess(false);
            return resp;
        }
        userService.update(user_wechat);
        //5.2向操作人员加钱
        TransSerial transSerial_teller = new TransSerial();
        String serial_teller_id = RandomUtil.getRandomTranSName();
        transSerial_teller.setSerialid(serial_teller_id);
        transSerial_teller.setTransdate(strDate);
        transSerial_teller.setTranstime(strTime);
        transSerial_teller.setTranstype(String.valueOf('1'));
        transSerial_teller.setTransstatus(String.valueOf('1'));
        transSerial_teller.setAccountno(user_teller.getUserid().toString());
        transSerial_teller.setSerivceid(serviceId);
        transSerial_teller.setOrderno(String.valueOf(orderId));
        transSerialService.insert(transSerial_teller);
        user_teller.setBalance(user_teller.getBalance().add(transAmt));
        userService.update(user_teller);

        return resp;
    }


}
