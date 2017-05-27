<%@ page language="java" pageEncoding="utf-8"%>

<%--
  Created by IntelliJ IDEA.
  User: Angel
  Date: 2017/4/15
  Time: 18:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>订单表</title>
    <script src="app/js/dashboard.js" type="text/javascript"></script>
</head>
<body>
<div class="page-content-col" id="books_table" style="text-align:center;">
    <!-- BEGIN PAGE BASE CONTENT -->
    <div class="row">
        <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
            <div class="dashboard-stat blue">
                <div class="visual">
                    <i class="fa fa-comments"></i>
                </div>
                <div class="details">
                    <div class="number">总数4549本</div>
                </div>
                <a class="more" href="#"> View more <i class="m-icon-swapright m-icon-white"></i>
                </a>
            </div>
        </div>
        <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
            <div class="dashboard-stat green">
                <div class="visual">
                    <i class="fa fa-shopping-cart"></i>
                </div>
                <div class="details">
                    <div class="number">新增0本</div>
                </div>
                <a class="more" href="#"> View more <i class="m-icon-swapright m-icon-white"></i>
                </a>
            </div>
        </div>
        <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
            <div class="dashboard-stat purple">
                <div class="visual">
                    <i class="fa fa-globe"></i>
                </div>
                <div class="details">
                    <div class="number">借出0本</div>
                </div>
                <a class="more" href="#"> View more <i class="m-icon-swapright m-icon-white"></i>
                </a>
            </div>
        </div>
        <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
            <div class="dashboard-stat yellow">
                <div class="visual">
                    <i class="fa fa-bar-chart-o"></i>
                </div>
                <div class="details">
                    <div class="number">超期0本</div>
                </div>
                <a class="more" href="#"> View more <i class="m-icon-swapright m-icon-white"></i>
                </a>
            </div>
        </div>
    </div>


    <%--<div class="row">--%>
        <%--<div class="col-md-12">--%>

            <%--<!-- Begin: life time stats -->--%>
            <%--<div class="portlet light portlet-fit portlet-datatable bordered">--%>

                <%--<div class="portlet-body">--%>
                    <%--<div class="table-container">--%>

                        <%--<table class="table table-striped table-bordered table-hover table-checkable" id="datatable_orders">--%>
                            <%--<thead>--%>
                            <%--<tr role="row" class="heading">--%>

                                <%--<th > 手机号&nbsp; </th>--%>
                                <%--<th > 操作 </th>--%>
                            <%--</tr>--%>
                            <%--<tr role="row" class="filter">--%>
                                <%--<td>--%>
                                    <%--<input type="text" class="form-control form-filter input-sm" name="order_phone"> </td>--%>
                                <%--<td>--%>
                                    <%--<div class="margin-bottom-5">--%>
                                        <%--<button class="btn btn-sm btn-success filter-submit margin-bottom" v-on:click="search">--%>
                                            <%--<i class="fa fa-search" ></i> 查询</button>--%>
                                    <%--</div>--%>
                                <%--</td>--%>
                            <%--</tr>--%>
                            <%--</thead>--%>
                            <%--<tbody> </tbody>--%>
                        <%--</table>--%>
                    <%--</div>--%>
                <%--</div>--%>
            <%--</div>--%>
            <%--<!-- End: life time stats -->--%>
        <%--</div>--%>
    <%--</div>--%>

<div class="row">
    <div class="col-md-12">
        <form method="post" action="rest/books/books">
            <div class="form-group">
                <!--ie8, ie9 does not support html5 placeholder, so we just show field title for that-->
                <label class="control-label visible-ie8 visible-ie9">用户名</label>
                <div class="input-icon">
                    <i class="fa fa-user"></i>
                    <input name="username" id="username" size="25" value="starzou" class="form-control placeholder-no-fix" type="text" autocomplete="off" placeholder="用户名" />
                </div>
            </div>
        </form>
    </div>
</div>
    <div class="row">
        <div class="col-md-12">

            <!-- BEGIN SAMPLE TABLE PORTLET-->
            <div class="portlet box blue">
                <div class="portlet-title">
                    <div class="caption">
                        <i class="fa fa-cogs"></i>图书列表</div>
                    <div class="tools">
                        <a href="javascript:;" class="collapse"> </a>
                        <a href="#portlet-config" data-toggle="modal" class="config"> </a>
                        <a href="javascript:;" class="reload"> </a>
                        <a href="javascript:;" class="remove"> </a>
                    </div>
                </div>
                <div class="portlet-body flip-scroll">
                    <table class="table table-bordered table-striped table-condensed flip-content">
                        <thead class="flip-content">
                        <tr >
                            <th class="numeric"> 编号 </th>
                            <th class="numeric"> 书名 </th>
                            <th class="numeric"> 出版年份 </th>
                            <th class="numeric"> 价格(码洋) </th>
                            <th class="numeric"> 价格(实洋) </th>
                            <th class="numeric"> 来源(订购/赠送) </th>

                        </tr>
                        </thead>
                        <tbody>
                        <%--<tr v-for="order in orders">--%>
                        <tr v-for="book in books">
                            <td class="numeric"> {{ book.id }} </td>
                            <td class="numeric"> {{ book.name }} </td>
                            <td class="numeric"> {{ book.year }} </td>
                            <td class="numeric"> {{ book.price }} </td>
                            <td class="numeric"> {{ book.pricereal }} </td>
                            <td class="numeric"> {{ book.source }} </td>

                        </tr>

                        </tbody>
                    </table>
                </div>
            </div>

        </div>
    </div>
    <!-- END PAGE BASE CONTENT -->
</div>
</body>
</html>
