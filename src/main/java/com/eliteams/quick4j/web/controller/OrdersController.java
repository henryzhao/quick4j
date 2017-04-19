package com.eliteams.quick4j.web.controller;


import com.eliteams.quick4j.core.util.RandomUtil;
import com.eliteams.quick4j.web.model.Orders;
import com.eliteams.quick4j.web.model.TransSerial;
import com.eliteams.quick4j.web.model.User;
import com.eliteams.quick4j.web.model.UserServiceRel;
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

/**
 * Created by dell on 2017/4/18.
 */
@Controller
@RequestMapping("/orders")
public class OrdersController {

    private static Logger log = LoggerFactory.getLogger(OrdersController.class);


    private OrdersService ordersService;
    private UserService userService;
    private UserServiceRelService userServiceRelService;
    private ServiceService serviceService;
    private TransSerialService transSerialService;


    @RequestMapping(value = "/dealOrder", method = {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    public String dealOrder(@RequestParam String orderId, String userId) throws Exception{
        Orders orders = ordersService.selectById(Long.parseLong(orderId));
        Subject subject = SecurityUtils.getSubject();
        String username = null;
        // 1已登陆则 获取当前登陆者的用户名
        if (subject.isAuthenticated()) {
            username = subject.getSession().getAttribute("username").toString();
        }
        //2根据当前登陆者的用户名去得到当前用户负责的游乐项目
        User user_teller = userService.selectByUsername(username);
        //3设置当前订单的游乐项目和交易金额
        String serviceId = userServiceRelService.selectById(user_teller.getUserid()).getServiceid();
        Integer transAmt = serviceService.selectById(user_teller.getUserid()).getAmount();
        orders.setServiceid(serviceId);
        orders.setTransamt(new BigDecimal(transAmt));
        //4改变订单的状态
        orders.setTransdate("1");
        ordersService.update(orders);
        //5发起两笔流水
        //5.1向微信用户扣款
        //获取订单号
        TransSerial transSerial_wechat = new TransSerial();
        String serial_wechat_id = RandomUtil.getRandomTranSName();
        transSerial_wechat.setSerialid(serial_wechat_id);
        //获取订单时间
        SimpleDateFormat simpleDateFormat;
        simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        Date date = new Date();
        String str = simpleDateFormat.format(date);
        transSerial_wechat.setTransdate(str);
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
        if ( user_wechat.getBalance().compareTo(BigDecimal.valueOf(transAmt))>=0) {
            user_wechat.setBalance(user_wechat.getBalance().subtract(new BigDecimal(transAmt)));
        } else {
            return "余额不足请充值";
        }
        userService.update(user_wechat);
        //5.2向操作人员加钱
        TransSerial transSerial_teller = new TransSerial();
        String serial_teller_id = RandomUtil.getRandomTranSName();
        transSerial_teller.setSerialid(serial_teller_id);
        transSerial_teller.setTransdate(str);
        transSerial_teller.setTranstype(String.valueOf('1'));
        transSerial_teller.setTransstatus(String.valueOf('1'));
        transSerial_teller.setAccountno(user_teller.getUserid().toString());
        transSerial_teller.setSerivceid(serviceId);
        transSerial_teller.setOrderno(String.valueOf(orderId));
        transSerialService.insert(transSerial_teller);
        user_teller.setBalance(user_teller.getBalance().add(new BigDecimal(transAmt)));

        userService.update(user_teller);


        return "ok";
    }


}
