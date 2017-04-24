<%--
  Created by IntelliJ IDEA.
  User: Angel
  Date: 2017/4/15
  Time: 18:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户个人信息</title>
</head>
<body>
<div class="page-content-col">
    <!-- BEGIN PAGE BASE CONTENT -->
    <div class="row">
        <div class="col-md-12">
            <!-- BEGIN PROFILE SIDEBAR -->
            <div class="profile-sidebar">
                <!-- PORTLET MAIN -->
                <div class="portlet light profile-sidebar-portlet bordered">
                    <!-- SIDEBAR USERPIC -->
                    <div class="profile-userpic">
                        <img src="assets/img/profile/profile_user.jpg" class="img-responsive" alt=""> </div>
                    <!-- END SIDEBAR USERPIC -->
                    <!-- SIDEBAR USER TITLE -->
                    <div class="profile-usertitle">
                        <div class="profile-usertitle-name"> 任其 </div>
                        <div class="profile-usertitle-job"> 开发者 </div>
                    </div>
                    <!-- END SIDEBAR USER TITLE -->
                    <!-- SIDEBAR BUTTONS -->
                    <div class="profile-userbuttons">
                        <button type="button" class="btn btn-circle green btn-sm">Follow</button>
                        <button type="button" class="btn btn-circle red btn-sm">Message</button>
                    </div>
                    <!-- END SIDEBAR BUTTONS -->
                    <!-- SIDEBAR MENU -->
                    <div class="profile-usermenu">
                        <ul class="nav">

                            <li class="active">
                                <a href="page_user_profile_1_account.html">
                                    <i class="icon-settings"></i> 账号信息 </a>
                            </li>
                            <li>
                                <a href="page_user_profile_1_help.html">
                                    <i class="icon-info"></i> 帮助 </a>
                            </li>
                        </ul>
                    </div>
                    <!-- END MENU -->
                </div>
                <!-- END PORTLET MAIN -->
                <!-- PORTLET MAIN -->
                <!-- END PORTLET MAIN -->
            </div>
            <!-- END BEGIN PROFILE SIDEBAR -->
            <!-- BEGIN PROFILE CONTENT -->
            <div class="profile-content">
                <div class="row">
                    <div class="col-md-12">
                        <div class="portlet light bordered">
                            <div class="portlet-title tabbable-line">
                                <div class="caption caption-md">
                                    <i class="icon-globe theme-font hide"></i>
                                    <span class="caption-subject font-blue-madison bold uppercase">账号信息</span>
                                </div>
                                <ul class="nav nav-tabs">
                                    <li class="active">
                                        <a href="#tab_1_1" data-toggle="tab">个人信息</a>
                                    </li>


                                </ul>
                            </div>
                            <div class="portlet-body">
                                <div class="tab-content">
                                    <!-- PERSONAL INFO TAB -->
                                    <div class="tab-pane active" id="tab_1_1">
                                        <form role="form" action="#">
                                            <div class="form-group">
                                                <label class="control-label">您的头像</label>
                                                <div class="fileinput-new thumbnail" style="width: 180px; height: 180px;">
                                                    <img src="assets/img/profile/profile_user.jpg" class="img-responsive" alt="" /> </div> </div>
                                            <div class="form-group">
                                                <label class="control-label">用户ID</label>
                                                <input type="text" placeholder="123" class="form-control" readonly/> </div>
                                            <div class="form-group">
                                                <label class="control-label">用户姓名</label>
                                                <input type="text" placeholder="张三" class="form-control" readonly/> </div>
                                            <div class="form-group">
                                                <label class="control-label">性别</label>
                                                <input type="text" placeholder="男" class="form-control" readonly/> </div>
                                            <div class="form-group">
                                                <label class="control-label">生日</label>
                                                <input type="text" placeholder="1994-12-01" class="form-control" readonly/> </div>
                                            <div class="form-group">
                                                <label class="control-label">手机号</label>
                                                <input type="text" placeholder="+1 646 580 DEMO (6284)" class="form-control" readonly/> </div>
                                            <div class="form-group">
                                                <label class="control-label">状态</label>
                                                <input type="text" placeholder="Design, Web etc." class="form-control" readonly/> </div>

                                        </form>
                                    </div>
                                    <!-- END PERSONAL INFO TAB -->
                                    <!-- CHANGE AVATAR TAB -->

                                    <!-- END CHANGE AVATAR TAB -->
                                    <!-- CHANGE PASSWORD TAB -->
                                    <!-- END CHANGE PASSWORD TAB -->
                                    <!-- PRIVACY SETTINGS TAB -->
                                    <!-- END PRIVACY SETTINGS TAB -->
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- END PROFILE CONTENT -->
        </div>
    </div>
    <!-- END PAGE BASE CONTENT -->
</div>
</body>
</html>
