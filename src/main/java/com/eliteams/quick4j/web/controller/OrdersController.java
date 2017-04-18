package com.eliteams.quick4j.web.controller;


import com.eliteams.quick4j.web.service.OrdersService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by dell on 2017/4/18.
 */
@Controller
@RequestMapping("/orders")
public class OrdersController {

    private static Logger log = LoggerFactory.getLogger(OrdersController.class);

    @Resource
    private OrdersService ordersService;

    @RequestMapping(value = "dealOrder", method = RequestMethod.POST)
    @ResponseBody
    public String dealOrder(@RequestParam String orderId, String userId){
        return "";
    }


}
