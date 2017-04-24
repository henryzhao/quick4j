package com.eliteams.quick4j.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 视图控制器,返回jsp视图给前端
 * 
 * @author StarZou
 * @since 2014年5月28日 下午4:00:49
 **/
@Controller
@RequestMapping("/page")
public class PageController {

    /**
     * 登录页
     */
    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    /**
     * dashboard页
     */
    @RequestMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }

    /**
     *
     */
    @RequestMapping("/index")
    public String index(){ return "index"; }

    /**
     *
     */
    @RequestMapping("/chart")
    public String chart(){ return "chart"; }

    /**
     *收款页面
     *
     */
    @RequestMapping("/gathering")
    public String gathering(){ return "gathering"; }
    /**
     *放回订单页面
     *
     */
    @RequestMapping("/order")
    public String order(){ return "order/order"; }

    /**
     *退款页面
     *
     */
    @RequestMapping("/refund")
    public String refund(){ return "refund"; }

    /**
     *月报表页面
     *
     */
    @RequestMapping("/month_report")
    public String month(){ return "month_report"; }

    /**
     *年报表页面
     *
     */
    @RequestMapping("/year_report")
    public String year(){ return "year_report"; }

    /**
     *项目列表页面
     *
     */
    @RequestMapping("/service")
    public String service(){ return "service/service"; }

    /**
     *报表统计页面
     *
     */
    @RequestMapping("/report")
    public String report(){ return "report/day_report"; }

    /**
     *个人信息页面
     *
     */
    @RequestMapping("/user")
    public String user(){ return "user/userinfo"; }

    /**
     *个人信息页面
     *
     */
    @RequestMapping("/manage")
    public String manage(){ return "manage/manage"; }

    /**
     *账号配置页面
     *
     */
    @RequestMapping("/setting")
    public String setting(){ return "setting"; }

    /**
     * 404页
     */
    @RequestMapping("/404")
    public String error404() {
        return "404";
    }

    /**
     * 401页
     */
    @RequestMapping("/401")
    public String error401() {
        return "401";
    }

    /**
     * 500页
     */
    @RequestMapping("/500")
    public String error500() {
        return "500";
    }

}