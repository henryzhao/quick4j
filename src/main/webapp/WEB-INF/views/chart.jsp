<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2017/4/12
  Time: 22:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="page-content">
    <div class="content container">
        <div class="row">
            <!-- BEGIN Portlet PORTLET-->
            <div class="portlet light bordered">
                <div class="portlet-title">
                    <div class="caption font-dark">
                        <span class="caption-subject bold uppercase">Distance</span>
                        <span class="caption-helper">distance stats...</span>
                    </div>
                    <div class="actions">
                        <a href="#" class="btn btn-circle btn-default btn-sm">
                            <i class="fa fa-pencil"></i> Edit </a>
                        <a href="#" class="btn btn-circle btn-default btn-sm">
                            <i class="fa fa-plus"></i> Add </a>
                        <a class="btn btn-circle btn-icon-only btn-default fullscreen" href="#">
                        </a>
                    </div>
                </div>
                <div class="portlet-body">
                    <div id="CSSAnimationChart" class="CSSAnimationChart"></div>
                </div>
            </div>
            <!-- END PORTLET-->
        </div>
    </div>
</div>
<div>
    <p>${user.userid}</p>
    <p>${user.username}</p>
    <p>${user.openid}</p>
    <p>${user.password}</p>
    <p>${user.regtime}</p>
    <p>${user.birthday}</p>
</div>
