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
</head>
<body>
<div class="page-content-col">
    <!-- BEGIN PAGE BASE CONTENT -->


    <div class="row">
        <div class="col-md-12">

            <!-- Begin: life time stats -->
            <div class="portlet light portlet-fit portlet-datatable bordered" style="width: 50%">

                <div class="portlet-body">
                    <div class="table-container">

                        <table class="table table-striped table-bordered table-hover table-checkable" id="datatable_orders" width="50%">
                            <thead>
                            <tr role="row" class="heading" >
                                <th width="1%">
                                    <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                        <input type="checkbox" class="group-checkable" data-set="#sample_2 .checkboxes" />
                                        <span></span>
                                    </label>
                                </th>
                                <th width="2%"> 用户编号&nbsp; </th>
                                <th width="3%"> 用户姓名&nbsp; </th>

                                <th width="2%"> 操作 </th>
                            </tr>
                            <tr role="row" class="filter">
                                <td> </td>
                                <td>
                                    <input type="text" class="form-control form-filter input-sm" name="order_id"> </td>
                                <td>
                                    <input type="text" class="form-control form-filter input-sm" name="order_name">
                                </td>

                                <td>
                                    <div class="margin-bottom-5">
                                        <button class="btn btn-sm btn-success filter-submit margin-bottom">
                                            <i class="fa fa-search"></i> Search</button>

                                    <button class="btn btn-sm btn-default filter-cancel">
                                        <i class="fa fa-times"></i> Reset</button>
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
            <div class="portlet box green">
                <div class="portlet-title">
                    <div class="caption">
                        <i class="fa fa-cogs"></i>用户列表</div>
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
                        <tr>
                            <th width="2%">
                                <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                    <input type="checkbox" class="group-checkable" data-set="#sample_2 .checkboxes" />
                                    <span></span>
                                </label>
                            </th>
                            <th width="20%"> 用户编号 </th>
                            <th> 用户姓名 </th>
                            <th class="numeric"> openID </th>
                            <th class="numeric"> 电话 </th>
                            <th class="numeric"> 性别 </th>
                            <th class="numeric"> 生日 </th>
                            <th class="numeric"> 密码 </th>
                            <th class="numeric"> regtime </th>
                            <th class="numeric"> 状态 </th>
                            <th class="numeric"> 操作 </th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td>
                                <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                    <input type="checkbox" class="group-checkable" data-set="#sample_2 .checkboxes" />
                                    <span></span>
                                </label>
                            </td>
                            <td> AAC </td>
                            <td> AUSTRALIAN AGRICULTURAL COMPANY LIMITED. </td>
                            <td class="numeric"> &nbsp; </td>
                            <td class="numeric"> -0.01 </td>
                            <td class="numeric"> -0.36% </td>
                            <td class="numeric"> $1.39 </td>
                            <td class="numeric"> $1.39 </td>
                            <td class="numeric"> &nbsp; </td>
                            <td class="numeric"> 9,395 </td>
                            <td class="numeric"> <button class="btn btn-sm btn-success filter-submit margin-bottom">
                                编辑</button> </td>
                        </tr>
                        <tr>
                            <td>
                                <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                    <input type="checkbox" class="group-checkable" data-set="#sample_2 .checkboxes" />
                                    <span></span>
                                </label>
                            </td>
                            <td> AAD </td>
                            <td> ARDENT LEISURE GROUP </td>
                            <td class="numeric"> $1.15 </td>
                            <td class="numeric"> +0.02 </td>
                            <td class="numeric"> 1.32% </td>
                            <td class="numeric"> $1.14 </td>
                            <td class="numeric"> $1.15 </td>
                            <td class="numeric"> $1.13 </td>
                            <td class="numeric"> 56,431 </td>
                            <td class="numeric"> <button class="btn btn-sm btn-success filter-submit margin-bottom">
                                编辑</button> </td>
                        </tr>
                        <tr>
                            <td>
                                <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                    <input type="checkbox" class="group-checkable" data-set="#sample_2 .checkboxes" />
                                    <span></span>
                                </label>
                            </td>
                            <td> AAX </td>
                            <td> AUSENCO LIMITED </td>
                            <td class="numeric"> $4.00 </td>
                            <td class="numeric"> -0.04 </td>
                            <td class="numeric"> -0.99% </td>
                            <td class="numeric"> $4.01 </td>
                            <td class="numeric"> $4.05 </td>
                            <td class="numeric"> $4.00 </td>
                            <td class="numeric"> 90,641 </td>
                            <td class="numeric"> <button class="btn btn-sm btn-success filter-submit margin-bottom">
                                编辑</button> </td>
                        </tr>
                        <tr>
                            <td>
                                <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                    <input type="checkbox" class="group-checkable" data-set="#sample_2 .checkboxes" />
                                    <span></span>
                                </label>
                            </td>
                            <td> ABC </td>
                            <td> ADELAIDE BRIGHTON LIMITED </td>
                            <td class="numeric"> $3.00 </td>
                            <td class="numeric"> +0.06 </td>
                            <td class="numeric"> 2.04% </td>
                            <td class="numeric"> $2.98 </td>
                            <td class="numeric"> $3.00 </td>
                            <td class="numeric"> $2.96 </td>
                            <td class="numeric"> 862,518 </td>
                            <td class="numeric"> <button class="btn btn-sm btn-success filter-submit margin-bottom">
                                编辑</button> </td>
                        </tr>
                        <tr>
                            <td>
                                <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                    <input type="checkbox" class="group-checkable" data-set="#sample_2 .checkboxes" />
                                    <span></span>
                                </label>
                            </td>
                            <td> ABP </td>
                            <td> ABACUS PROPERTY GROUP </td>
                            <td class="numeric"> $1.91 </td>
                            <td class="numeric"> 0.00 </td>
                            <td class="numeric"> 0.00% </td>
                            <td class="numeric"> $1.92 </td>
                            <td class="numeric"> $1.93 </td>
                            <td class="numeric"> $1.90 </td>
                            <td class="numeric"> 595,701 </td>
                            <td class="numeric"> <button class="btn btn-sm btn-success filter-submit margin-bottom">
                                编辑</button> </td>
                        </tr>
                        <tr>
                            <td>
                                <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                    <input type="checkbox" class="group-checkable" data-set="#sample_2 .checkboxes" />
                                    <span></span>
                                </label>
                            </td>
                            <td> ABY </td>
                            <td> ADITYA BIRLA MINERALS LIMITED </td>
                            <td class="numeric"> $0.77 </td>
                            <td class="numeric"> +0.02 </td>
                            <td class="numeric"> 2.00% </td>
                            <td class="numeric"> $0.76 </td>
                            <td class="numeric"> $0.77 </td>
                            <td class="numeric"> $0.76 </td>
                            <td class="numeric"> 54,567 </td>
                            <td class="numeric"> <button class="btn btn-sm btn-success filter-submit margin-bottom">
                                编辑</button> </td>
                        </tr>
                        <tr>
                            <td>
                                <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                    <input type="checkbox" class="group-checkable" data-set="#sample_2 .checkboxes" />
                                    <span></span>
                                </label>
                            </td>
                            <td> ACR </td>
                            <td> ACRUX LIMITED </td>
                            <td class="numeric"> $3.71 </td>
                            <td class="numeric"> +0.01 </td>
                            <td class="numeric"> 0.14% </td>
                            <td class="numeric"> $3.70 </td>
                            <td class="numeric"> $3.72 </td>
                            <td class="numeric"> $3.68 </td>
                            <td class="numeric"> 191,373 </td>
                            <td class="numeric"> <button class="btn btn-sm btn-success filter-submit margin-bottom">
                                编辑</button> </td>
                        </tr>
                        <tr>
                            <td>
                                <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                    <input type="checkbox" class="group-checkable" data-set="#sample_2 .checkboxes" />
                                    <span></span>
                                </label>
                            </td>
                            <td> ADU </td>
                            <td> ADAMUS RESOURCES LIMITED </td>
                            <td class="numeric"> $0.72 </td>
                            <td class="numeric"> 0.00 </td>
                            <td class="numeric"> 0.00% </td>
                            <td class="numeric"> $0.73 </td>
                            <td class="numeric"> $0.74 </td>
                            <td class="numeric"> $0.72 </td>
                            <td class="numeric"> 8,602,291 </td>
                            <td class="numeric"> <button class="btn btn-sm btn-success filter-submit margin-bottom">
                                编辑</button> </td>
                        </tr>
                        <tr>
                            <td>
                                <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                    <input type="checkbox" class="group-checkable" data-set="#sample_2 .checkboxes" />
                                    <span></span>
                                </label>
                            </td>
                            <td> AGG </td>
                            <td> ANGLOGOLD ASHANTI LIMITED </td>
                            <td class="numeric"> $7.81 </td>
                            <td class="numeric"> -0.22 </td>
                            <td class="numeric"> -2.74% </td>
                            <td class="numeric"> $7.82 </td>
                            <td class="numeric"> $7.82 </td>
                            <td class="numeric"> $7.81 </td>
                            <td class="numeric"> 148 </td>
                            <td class="numeric"> <button class="btn btn-sm btn-success filter-submit margin-bottom">
                                编辑</button> </td>
                        </tr>
                        <tr>
                            <td>
                                <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                    <input type="checkbox" class="group-checkable" data-set="#sample_2 .checkboxes" />
                                    <span></span>
                                </label>
                            </td>
                            <td> AGK </td>
                            <td> AGL ENERGY LIMITED </td>
                            <td class="numeric"> $13.82 </td>
                            <td class="numeric"> +0.02 </td>
                            <td class="numeric"> 0.14% </td>
                            <td class="numeric"> $13.83 </td>
                            <td class="numeric"> $13.83 </td>
                            <td class="numeric"> $13.67 </td>
                            <td class="numeric"> 846,403 </td>
                            <td class="numeric"> <button class="btn btn-sm btn-success filter-submit margin-bottom">
                                编辑</button> </td>
                        </tr>
                        <tr>
                            <td>
                                <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                    <input type="checkbox" class="group-checkable" data-set="#sample_2 .checkboxes" />
                                    <span></span>
                                </label>
                            </td>
                            <td> AGO </td>
                            <td> ATLAS IRON LIMITED </td>
                            <td class="numeric"> $3.17 </td>
                            <td class="numeric"> -0.02 </td>
                            <td class="numeric"> -0.47% </td>
                            <td class="numeric"> $3.11 </td>
                            <td class="numeric"> $3.22 </td>
                            <td class="numeric"> $3.10 </td>
                            <td class="numeric"> 5,416,303 </td>
                            <td class="numeric"> <button class="btn btn-sm btn-success filter-submit margin-bottom">
                                编辑</button> </td>
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
