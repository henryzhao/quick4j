<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en" class="no-js">
    <!--<![endif]-->
    <!-- BEGIN HEAD -->
    <head>
        <base href="<%=basePath%>">
        <meta charset="utf-8" />
        <title>中山公园后台管理系统</title>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta content="width=device-width, initial-scale=1.0" name="viewport" />
        <meta content="" name="description" />
        <meta content="" name="author" />
        <meta name="MobileOptimized" content="320">

        <!-- BEGIN GLOBAL MANDATORY STYLES -->
        <link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700&subset=all" rel="stylesheet" type="text/css" />
        <link href="assets/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
        <link href="assets/plugins/simple-line-icons/simple-line-icons.min.css" rel="stylesheet" type="text/css"/>
        <link href="assets/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <link href="assets/plugins/uniform/css/uniform.default.css" rel="stylesheet" type="text/css" />
        <link href="assets/plugins/bootstrap-switch/css/bootstrap-switch.min.css" rel="stylesheet" type="text/css"/>
        <!-- END GLOBAL MANDATORY STYLES -->

        <!-- BEGIN PAGE LEVEL PLUGIN STYLES -->
        <link href="assets/plugins/morris/morris.css" rel="stylesheet" type="text/css">
        <link href="assets/plugins/bootstrap-daterangepicker/daterangepicker.min.css" rel="stylesheet" type="text/css">
        <link href="assets/plugins/bootstrap-datetimepicker/css/bootstrap-datetimepicker.css" rel="stylesheet" type="text/css">
        <link href="assets/plugins/clockface/css/clockface.css" rel="stylesheet" type="text/css">
        <link href="assets/plugins/datatables/datatables.min.css" rel="stylesheet" type="text/css" />
        <link href="assets/plugins/datatables/plugins/bootstrap/datatables.bootstrap.css" rel="stylesheet" type="text/css" />
        <!-- END PAGE LEVEL PLUGIN STYLES -->
        <!-- BEGIN PAGE STYLES -->
        <link href="assets/admin/pages/css/tasks.css" rel="stylesheet" type="text/css"/>
        <!-- END PAGE STYLES -->

        <!-- BEGIN THEME STYLES -->
        <link href="assets/css/style-metronic.css" rel="stylesheet" type="text/css" />
        <link href="assets/css/style.css" rel="stylesheet" type="text/css" />
        <link href="assets/css/style-responsive.css" rel="stylesheet" type="text/css" />
        <link href="assets/css/plugins.css" rel="stylesheet" type="text/css" />
        <link href="assets/css/pages/tasks.css" rel="stylesheet" type="text/css" />
        <link href="assets/css/themes/default.css" rel="stylesheet" type="text/css" id="style_color" />
        <link href="assets/css/custom.css" rel="stylesheet" type="text/css" />
        <link href="assets/css/profile.min.css" rel="stylesheet" type="text/css" />
        <link href="assets/css/components.min.css" rel="stylesheet" type="text/css" />
        <!-- END THEME STYLES -->

        <link rel="shortcut icon" href="app/img/favicon.ico" />
    </head>
    <!-- END HEAD -->

    <!-- BEGIN BODY -->
    <body class="page-header-fixed">
        <!-- BEGIN HEADER -->
        <div class="header navbar navbar-inverse navbar-fixed-top">
            <!-- BEGIN TOP NAVIGATION BAR -->
            <div class="header-inner">
                <!-- BEGIN LOGO -->
                <a class="navbar-brand" href="javascript:;">
                    <img src="assets/img/logo.png" alt="logo" class="img-responsive" />
                </a>
                <!-- END LOGO -->
                <!-- BEGIN RESPONSIVE MENU TOGGLER -->
                <a href="javascript:;" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <img
                    src="assets/img/menu-toggler.png" alt="" />
                </a>
                <!-- END RESPONSIVE MENU TOGGLER -->
                <!-- BEGIN TOP NAVIGATION MENU -->
                <ul class="nav navbar-nav pull-right">
                    <li class="dropdown user">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
                            <img alt="" src="assets/img/avatar1_small.jpg"/>
                            <span class="username"> ${userInfo.username } </span>
                            <i class="fa fa-angle-down"></i>
                        </a>
                        <ul class="dropdown-menu">
                            <li>
                                <a href="javascript:;" id="trigger_fullscreen">
                                    <i class="fa fa-move"></i> 全屏
                                </a>
                            </li>
                            <li>
                                <a href="extra_lock.html">
                                    <i class="fa fa-lock"></i> 锁屏
                                </a>
                            </li>
                            <li>
                                <a href="rest/user/logout">
                                    <i class="fa fa-key"></i> 退出
                                </a>
                            </li>
                        </ul>
                    </li>
                    <!-- END USER LOGIN DROPDOWN -->
                </ul>
                <!-- END TOP NAVIGATION MENU -->
            </div>
            <!-- END TOP NAVIGATION BAR -->
        </div>
        <!-- END HEADER -->
        <div class="clearfix"></div>
        <!-- BEGIN CONTAINER -->
        <div class="page-container">
            <!-- BEGIN SIDEBAR -->
            <div class="page-sidebar-wrapper">
                <div class="page-sidebar navbar-collapse collapse">
                    <!-- BEGIN SIDEBAR MENU -->
                    <ul class="page-sidebar-menu" id="page-sidebar-menu">
                        <li class="sidebar-toggler-wrapper">
                            <!-- BEGIN SIDEBAR TOGGLER BUTTON -->
                            <div class="sidebar-toggler hidden-phone"></div>
                            <!-- BEGIN SIDEBAR TOGGLER BUTTON -->
                        </li>

                        <li class="start active">
                            <a href="rest/page/dashboard" id="btn-dashboard">
                                <i class="fa fa-home"></i><span class="title"> 首页 </span><span
                                class="selected"> </span>
                            </a>
                        </li>



                        <li class="">
                            <a href="javascript:;">
                                <i class="fa fa-anchor"></i><span class="title"> 订单管理 </span><span
                                    class="arrow "> </span>
                            </a>
                            <ul class="sub-menu">
                                <li>
                                    <a href="rest/page/order" id="btn-order">
                                        订单列表
                                    </a>
                                </li>
                                <li>
                                    <a href="rest/page/gathering" id="btn-gathering">
                                        收款管理
                                    </a>
                                </li>
                                <li>
                                    <a href="rest/page/refund" id="btn-refund">
                                        退款管理
                                    </a>
                                </li>

                            </ul>
                        </li>
                        <li class="">
                            <a href="javascript:;">
                                <i class="fa fa-book"></i><span class="title"> 产品管理 </span><span
                                    class="arrow "> </span>
                            </a>
                            <ul class="sub-menu">
                                <li>
                                    <a href="rest/page/service" id="btn-service">
                                        产品列表
                                    </a>
                                </li>
                            </ul>
                        </li>

                        <li class="">
                            <a href="javascript:;">
                                <i class="fa fa-desktop"></i><span class="title"> 统计报表 </span><span
                                    class="arrow "> </span>
                            </a>
                            <ul class="sub-menu">
                                <li>
                                    <a href="/rest/page/report" id="btn-report">
                                        按日统计
                                    </a>
                                </li>
                                <li>
                                    <a href="/rest/page/month_report" id="btn-month">
                                        按月统计
                                    </a>
                                </li>
                                <li>
                                    <a href="/rest/page/year_report" id="btn-year">
                                        按年统计
                                    </a>
                                </li>
                                <li>
                                    <a href="javascript:;">
                                        退款统计
                                    </a>
                                </li>
                            </ul>
                        </li>
                        <li class="">
                            <a href="javascript:;">
                                <i class="fa fa-gears"></i><span class="title"> 系统管理 </span><span
                                    class="arrow "> </span>
                            </a>
                            <ul class="sub-menu">
                                <li>
                                    <a href="/rest/page/manage" id="btn-manage">
                                        用户管理
                                    </a>
                                </li>
                                <li>
                                    <a href="javascript:;">
                                        角色管理
                                    </a>
                                </li>
                                <li>
                                    <a href="javascript:;">
                                        权限管理
                                    </a>
                                </li>
                            </ul>
                        </li>

                        <li class="">
                            <a href="javascript:;">
                                <i class="fa fa-user"></i><span class="title"> 个人中心 </span><span
                                    class="arrow "> </span>
                            </a>
                            <ul class="sub-menu">
                                <li>
                                    <a href="/rest/page/user" id="btn-user">
                                        个人信息
                                    </a>
                                </li>
                                <li>
                                    <a href="/rest/page/setting" id="btn-setting">
                                        账户设置
                                    </a>
                                </li>


                                <!-- 测试权限控制 -->
                                <shiro:hasAnyRoles name="super_admin">
                                    <li>
                                        <a href="javascript:;">super_admin 拥有此角色</a>
                                    </li>
                                </shiro:hasAnyRoles>

                                <shiro:hasPermission name="user:create">
                                    <li>
                                        <a href="javascript:;">user:create 拥有此权限</a>
                                    </li>
                                </shiro:hasPermission>

                                <shiro:hasPermission name="user:update">
                                    <li>
                                        <a href="javascript:;">user:update 拥有此权限</a>
                                    </li>
                                </shiro:hasPermission>

                            </ul>
                        </li>
                    </ul>
                    <!-- END SIDEBAR MENU -->
                </div>
            </div>
            <!-- END SIDEBAR -->
            <!-- BEGIN CONTENT -->
            <div class="page-content-wrapper">
                <div class="page-content">
                    <!-- BEGIN SAMPLE PORTLET CONFIGURATION MODAL FORM-->
                    <div class="modal fade" id="portlet-config" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                                    <h4 class="modal-title">Modal title</h4>
                                </div>
                                <div class="modal-body">
                                    Widget settings form goes here
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn blue">
                                        Save changes
                                    </button>
                                    <button type="button" class="btn default" data-dismiss="modal">
                                        Close
                                    </button>
                                </div>
                            </div>
                            <!-- /.modal-content -->
                        </div>
                        <!-- /.modal-dialog -->
                    </div>
                    <!-- /.modal -->
                    <!-- END SAMPLE PORTLET CONFIGURATION MODAL FORM-->
                    <!-- BEGIN STYLE CUSTOMIZER -->
                    <div class="theme-panel hidden-xs hidden-sm">
                        <div class="toggler"></div>
                        <div class="toggler-close"></div>
                        <div class="theme-options">
                            <div class="theme-option theme-colors clearfix">
                                <span> 主题颜色 </span>
                                <ul>
                                    <li class="color-black current color-default" data-style="default"></li>
                                    <li class="color-blue" data-style="blue"></li>
                                    <li class="color-brown" data-style="brown"></li>
                                    <li class="color-purple" data-style="purple"></li>
                                    <li class="color-grey" data-style="grey"></li>
                                    <li class="color-white color-light" data-style="light"></li>
                                </ul>
                            </div>
                            <div class="theme-option">
                                <span> 布局 </span>
                                <select class="layout-option form-control input-small">
                                    <option value="fluid">顺序</option>
                                    <option value="boxed">盒状</option>
                                </select>
                            </div>
                            <div class="theme-option">
                                <span> 标题 </span>
                                <select class="header-option form-control input-small">
                                    <option value="fixed">固定</option>
                                    <option value="default">默认</option>
                                </select>
                            </div>
                            <div class="theme-option">
                                <span> 工具栏 </span>
                                <select class="sidebar-option form-control input-small">
                                    <option value="fixed">固定</option>
                                    <option value="default">默认</option>
                                </select>
                            </div>
                            <div class="theme-option">
                                <span> 工具栏位置 </span>
                                <select class="sidebar-pos-option form-control input-small">
                                    <option value="left">左边</option>
                                    <option value="right">右边</option>
                                </select>
                            </div>
                            <div class="theme-option">
                                <span> 页脚 </span>
                                <select class="footer-option form-control input-small">
                                    <option value="fixed">固定</option>
                                    <option value="default">默认</option>
                                </select>
                            </div>
                        </div>
                    </div>
                    <!-- END STYLE CUSTOMIZER -->

                    <!-- BEGIN PAGE HEADER-->
                    <div class="row">
                        <div class="col-md-12">
                            <!-- BEGIN PAGE TITLE & BREADCRUMB-->
                            <h3 class="page-title" id="index-page-title">中山公园后台管理系统</h3>
                            <ul class="page-breadcrumb breadcrumb">
                                <li>
                                    <i class="fa fa-home"></i>
                                    <a href="javascript:;">
                                        首页
                                    </a>
                                    <i class="fa fa-angle-right"></i>
                                </li>
                                <li>
                                    <a href="javascript:;">
                                        概览
                                    </a>
                                </li>
                            </ul>
                            <!-- END PAGE TITLE & BREADCRUMB-->
                        </div>
                    </div>
                    <!-- END PAGE HEADER-->

                    <!-- BEGIN DASHBOARD STATS -->
                    <div id="main-content"></div>

                    <!-- END PORTLET-->
                </div>
            </div>
            <!-- END CONTENT -->
        </div>
        <!-- END CONTAINER -->
        <!-- BEGIN FOOTER -->
        <div class="footer">
            <div class="footer-inner">
                2017 &copy;  - Quick4j
            </div>
            <div class="footer-tools">
                <span class="go-top"><i class="fa fa-angle-up"></i></span>
            </div>
        </div>
        <!--[if lt IE 9]>
        <script src="assets/plugins/respond.min.js"></script>
        <script src="assets/plugins/excanvas.min.js"></script>
        <![endif]-->
        <script src="assets/plugins/jquery-1.10.2.min.js" type="text/javascript"></script>
        <script src="assets/plugins/jquery-migrate-1.2.1.min.js" type="text/javascript"></script>
        <script src="assets/plugins/jquery-ui/jquery-ui-1.10.3.custom.min.js" type="text/javascript"></script>
        <script src="assets/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="assets/plugins/bootstrap-hover-dropdown/twitter-bootstrap-hover-dropdown.min.js" type="text/javascript"></script>
        <script src="assets/plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
        <script src="assets/plugins/jquery.blockui.min.js" type="text/javascript"></script>
        <script src="assets/plugins/jquery.cokie.min.js" type="text/javascript"></script>
        <script src="assets/plugins/uniform/jquery.uniform.min.js" type="text/javascript"></script>

        <script src="assets/plugins/jquery-validation/dist/jquery.validate.min.js" type="text/javascript"></script>
        <script type="text/javascript" src="assets/plugins/select2/select2.min.js"></script>

        <!-- BEGIN PAGE LEVEL PLUGINS -->
        <script src="assets/plugins/amcharts/amcharts/amcharts.js" type="text/javascript" ></script>
        <script src="assets/plugins/amcharts/amcharts/serial.js" type="text/javascript" ></script>
        <script src="assets/plugins/amcharts/amcharts/themes/light.js" type="text/javascript" ></script>
        <script src="assets/plugins/amcharts/ammap/ammap.js" type="text/javascript"></script>
        <script src="assets/plugins/amcharts/ammap/maps/js/worldLow.js" type="text/javascript"></script>
        <script src="assets/plugins/morris/morris.min.js" type="text/javascript"></script>
        <script src="assets/plugins/morris/raphael-min.js" type="text/javascript"></script>
        <script src="assets/plugins/jquery.sparkline.min.js" type="text/javascript"></script>

        <script src="assets/plugins/moment.min.js" type="text/javascript"></script>
        <script src="assets/plugins/bootstrap-daterangepicker/daterangepicker.min.js" type="text/javascript"></script>
        <script src="assets/plugins/bootstrap-datepicker/js/bootstrap-datepicker.js" type="text/javascript"></script>
        <script src="assets/plugins/bootstrap-timepicker/js/bootstrap-timepicker.js" type="text/javascript"></script>
        <script src="assets/plugins/bootstrap-datetimepicker/js/bootstrap-datetimepicker.js" type="text/javascript"></script>
        <script src="assets/plugins/clockface/js/clockface.js" type="text/javascript"></script>
        <!-- END PAGE LEVEL PLUGINS -->




        <!-- renqi -->

        <%--<script src="assets/scripts/datatable.js" type="text/javascript"></script>--%>
        <%--<script src="assets/plugins/datatables/datatables.min.js" type="text/javascript"></script>--%>
        <%--<script src="assets/plugins/datatables/plugins/bootstrap/datatables.bootstrap.js" type="text/javascript"></script>--%>


        <script src="assets/scripts/table-datatables-buttons.min.js" type="text/javascript"></script>
        <script src="assets/scripts/table-datatables-scroller.min.js" type="text/javascript"></script>


        <!-- BEGIN PAGE LEVEL SCRIPTS -->
        <script src="assets/scripts/metronic.js" type="text/javascript"></script>
        <script src="assets/admin/layout5/scripts/layout.js" type="text/javascript"></script>
        <script src="assets/admin/layout5/scripts/quick-sidebar.js" type="text/javascript"></script>
        <script src="assets/admin/pages/scripts/tasks.js" type="text/javascript"></script>


        <!-- END PAGE LEVEL SCRIPTS -->
        <!-- <script data-main="app/js/main" src="app/lib/requirejs/require.js"></script> -->
        <script src="assets/scripts/app.js" type="text/javascript"></script>
        
        <script type="text/javascript">
        	var url = "app/js/index.js";
       		$.ajax({
       			  url: url,
       			  dataType: "script"
       			});
        </script>
        <!-- BEGIN PAGE LEVEL SCRIPTS -->
        <script src="app/js/components-date-time-pickers.js" type="text/javascript"></script>
        <!-- END PAGE LEVEL SCRIPTS -->
        <script type="text/javascript">
            $(".form_datetime").datetimepicker({
                format: 'MM/dd/yyyy hh:mm',
                language: 'cn',
                pickDate: true,
                pickTime: true,
                hourStep: 1,
                minuteStep: 15,
                secondStep: 30,
                inputMask: true
            });
            $(".form_meridian_datetime").datetimepicker({
                format: "dd MM yyyy - HH:ii P",
                showMeridian: true,
                autoclose: true,
                todayBtn: true
            });
        </script>
    </body>
</html>