package com.eliteams.quick4j.web.controller;

import com.eliteams.quick4j.web.model.User;
import com.eliteams.quick4j.web.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by Angel on 2017/4/16.
 */
@Controller
@RequestMapping("/hello")
public class HelloMvcController {

    private static Logger log = LoggerFactory.getLogger(HelloMvcController.class);

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService){
        this.userService = userService;
    }

    @RequestMapping("/viewAllUsers")
    public String HelloMvc(){
        return "chart";
    }

    //本方法将处理/rest/hello/viewUsers?userId=1
    @RequestMapping(value = "/viewUsers", method = RequestMethod.GET)
    public String viewUser(@RequestParam("userId") Long userId, Model model){
        log.debug("In viewUser, userId = {}", userId);
        User user = userService.selectById(userId);
        model.addAttribute(user);
        return "chart";
    }

    //本方法将处理/rest/hello/viewUsers2/{userId}
    @RequestMapping(value = "/viewUsers2/{userId}", method = RequestMethod.GET)
    public String viewUser2(@PathVariable("userId") Long userId, Map<String, Object> model){
        log.debug("In viewUser2, userId = {}", userId);
        User user = userService.selectById(userId);
        model.put("user",user);
        return "chart";
    }
}
