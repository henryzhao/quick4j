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
<div class="page-content-col" id="refund_table" style="text-align:center;">
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
                    <div class="number">新增549本</div>
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
                    <div class="number">借出89本</div>
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
                    <div class="number">超期12本</div>
                </div>
                <a class="more" href="#"> View more <i class="m-icon-swapright m-icon-white"></i>
                </a>
            </div>
        </div>
    </div>


    <div class="row">
        <div class="col-md-12">

            <!-- Begin: life time stats -->
            <div class="portlet light portlet-fit portlet-datatable bordered">

                <div class="portlet-body">
                    <div class="table-container">

                        <table class="table table-striped table-bordered table-hover table-checkable" id="datatable_orders">
                            <thead>
                            <tr role="row" class="heading">

                                <th > 手机号&nbsp; </th>
                                <th > 操作 </th>
                            </tr>
                            <tr role="row" class="filter">
                                <td>
                                    <input type="text" class="form-control form-filter input-sm" name="order_phone"> </td>
                                <td>
                                    <div class="margin-bottom-5">
                                        <button class="btn btn-sm btn-success filter-submit margin-bottom" v-on:click="search">
                                            <i class="fa fa-search" ></i> 查询</button>
                                    </div>
                                </td>
                            </tr>
                            </thead>
                            <tbody> </tbody>
                        </table>
                    </div>
                </div>
            </div>
            <!-- End: life time stats -->
        </div>
    </div>


    <div class="row">
        <div class="col-md-12">

            <!-- BEGIN SAMPLE TABLE PORTLET-->
            <div class="portlet box blue">
                <div class="portlet-title">
                    <div class="caption">
                        <i class="fa fa-cogs"></i>退款列表</div>
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
                            <th class="numeric"> 订单号 </th>
                            <th class="numeric"> 游客姓名 </th>
                            <th class="numeric"> 联系方式 </th>
                            <th class="numeric"> 游乐项目 </th>
                            <th class="numeric"> 价格 </th>
                            <th class="numeric"> 购买日期 </th>
                            <th class="numeric"> 订单状态 </th>
                            <th class="numeric"> 是否有效 </th>
                            <th class="numeric"> 验票人 </th>
                            <th class="numeric"> 操作 </th>

                        </tr>
                        </thead>
                        <tbody>
                        <%--<tr v-for="order in orders">--%>
                        <tr v-for="order in orders" v-if="order.ordertype==3||order.ordertype!=3&&order.orderstatus!=5&&order.orderstatus!=6&&order.orderstatus!=7">
                            <td> {{ order.orderid}} </td>
                            <td> {{ order.username}} </td>
                            <td class="numeric"> {{ order.tel }} </td>
                            <td class="numeric"> {{ order.serviceid }} </td>
                            <td class="numeric"> {{ order.transamt }}.00元 </td>
                            <td class="numeric"> {{ order.transdate }} {{ order.transtime  }} </td>
                            <td class="numeric">
                                <span v-if="order.orderstatus==0">待支付</span>
                                <span v-if="order.orderstatus==1">扫码成功</span>
                                <span v-if="order.orderstatus==2">处理中</span>
                                <span v-if="order.orderstatus==3">失败</span>
                                <span v-if="order.orderstatus==4">超时</span>
                                <span v-if="order.orderstatus==5">退票中</span>
                                <span v-if="order.orderstatus==6">退票等待审核</span>
                                <span v-if="order.orderstatus==7">退票成功</span>
                            </td>
                            <td class="numeric"> 是 </td>
                            <td class="numeric"> {{ order.serviceid }} </td>
                            <td class="numeric">
                                <div class="margin-bottom-5" v-if="order.orderstatus==1">
                                    <button class="btn btn-sm btn-danger filter-submit margin-bottom"  v-on:click="refund(order.orderid)">
                                        <i class="fa fa-edit"></i> 申请退票</button>
                                </div>
                                <div class="margin-bottom-5" v-if="order.orderstatus==5">
                                    <button class="btn btn-sm btn-default filter-submit margin-bottom" disabled="disabled">
                                        <i class="fa fa-ambulance"></i> 退票中</button>
                                </div>
                                <div class="margin-bottom-5" v-if="order.orderstatus==7">
                                    <button class="btn btn-sm btn-success filter-submit margin-bottom" disabled="disabled">
                                        <i class="fa fa-anchor"></i> 退票成功</button>
                                </div>
                            </td>
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
