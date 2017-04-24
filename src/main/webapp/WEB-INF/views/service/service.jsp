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
    <title>游乐园项目列表</title>
</head>
<body>
<div class="page-content-col">
    <!-- BEGIN PAGE BASE CONTENT -->


    <div class="row">
        <div class="col-md-12">

            <!-- Begin: life time stats -->
            <div class="portlet light portlet-fit portlet-datatable bordered" style="width: 60%">

                <div class="portlet-body">
                    <div class="table-container">

                        <table class="table table-striped table-bordered table-hover table-checkable" id="datatable_orders">
                            <thead>
                            <tr role="row" class="heading">
                                <th width="2%">
                                    <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                        <input type="checkbox" class="group-checkable" data-set="#sample_2 .checkboxes" />
                                        <span></span>
                                    </label>
                                </th>
                                <th width="5%"> 项目ID&nbsp; </th>
                                <th width="15%"> 项目名称&nbsp; </th>
                                <th width="10%"> 单价&nbsp; </th>
                                <th width="10%"> 是否禁用 </th>
                                <th width="10%"> 操作 </th>
                            </tr>
                            <tr role="row" class="filter">
                                <td> </td>
                                <td>
                                    <input type="text" class="form-control form-filter input-sm" name="order_id"> </td>

                                <td>
                                    <input type="text" class="form-control form-filter input-sm" name="order_customer_name"> </td>
                                <td>
                                    <input type="text" class="form-control form-filter input-sm" name="order_ship_to"> </td>

                                <td>
                                    <select name="order_status" class="form-control form-filter input-sm">
                                        <option value="">是</option>
                                        <option value="pending">否</option>

                                    </select>
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
                        <i class="fa fa-cogs"></i>项目列表</div>
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
                            <th width="20%"> 项目编号 </th>
                            <th> 项目名称 </th>
                            <th class="numeric"> 描述 </th>
                            <th class="numeric"> 单价 </th>
                            <th class="numeric"> 数量 </th>
                            <th class="numeric"> 是否禁用 </th>
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
                            <td> 项目1 </td>
                            <td> AUSTRALIAN AGRICULTURAL COMPANY LIMITED. </td>
                            <td class="numeric">22 &nbsp; </td>
                            <td class="numeric"> -0.01 </td>
                            <td>
                                <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                    <input type="checkbox" class="group-checkable" data-set="#sample_2 .checkboxes" />
                                    <span></span>
                                </label>
                            </td>
                            <td class="numeric"> <button class="btn btn-sm btn-success filter-submit margin-bottom">
                                 编辑</button></td>
                        </tr>
                        <tr>
                            <td>
                                <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                    <input type="checkbox" class="group-checkable" data-set="#sample_2 .checkboxes" />
                                    <span></span>
                                </label>
                            </td>
                            <td> AAC </td>
                            <td> 项目1 </td>
                            <td> AUSTRALIAN AGRICULTURAL COMPANY LIMITED. </td>
                            <td class="numeric">12 &nbsp; </td>
                            <td class="numeric"> -0.01 </td>
                            <td>
                                <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                    <input type="checkbox" class="group-checkable" data-set="#sample_2 .checkboxes" />
                                    <span></span>
                                </label>
                            </td>
                            <td class="numeric"> <button class="btn btn-sm btn-success filter-submit margin-bottom">
                                编辑</button></td>
                        </tr>
                        <tr>
                            <td>
                                <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                    <input type="checkbox" class="group-checkable" data-set="#sample_2 .checkboxes" />
                                    <span></span>
                                </label>
                            </td>
                            <td> AAC </td>
                            <td> 项目1 </td>
                            <td> AUSTRALIAN AGRICULTURAL COMPANY LIMITED. </td>
                            <td class="numeric"> 11&nbsp; </td>
                            <td class="numeric"> -0.01 </td>
                            <td>
                                <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                    <input type="checkbox" class="group-checkable" data-set="#sample_2 .checkboxes" />
                                    <span></span>
                                </label>
                            </td>
                            <td class="numeric"> <button class="btn btn-sm btn-success filter-submit margin-bottom">
                                编辑</button></td>
                        </tr>
                        <tr>
                            <td>
                                <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                    <input type="checkbox" class="group-checkable" data-set="#sample_2 .checkboxes" />
                                    <span></span>
                                </label>
                            </td>
                            <td> AAC </td>
                            <td> 项目1 </td>
                            <td> AUSTRALIAN AGRICULTURAL COMPANY LIMITED. </td>
                            <td class="numeric">12 &nbsp; </td>
                            <td class="numeric"> -0.01 </td>
                            <td>
                                <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                    <input type="checkbox" class="group-checkable" data-set="#sample_2 .checkboxes" />
                                    <span></span>
                                </label>
                            </td>
                            <td class="numeric"> <button class="btn btn-sm btn-success filter-submit margin-bottom">
                                编辑</button></td>
                        </tr>
                        <tr>
                            <td>
                                <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                    <input type="checkbox" class="group-checkable" data-set="#sample_2 .checkboxes" />
                                    <span></span>
                                </label>
                            </td>
                            <td> AAC </td>
                            <td> 项目1 </td>
                            <td> AUSTRALIAN AGRICULTURAL COMPANY LIMITED. </td>
                            <td class="numeric">21 &nbsp; </td>
                            <td class="numeric"> -0.01 </td>
                            <td>
                                <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                    <input type="checkbox" class="group-checkable" data-set="#sample_2 .checkboxes" />
                                    <span></span>
                                </label>
                            </td>
                            <td class="numeric"> <button class="btn btn-sm btn-success filter-submit margin-bottom">
                                编辑</button></td>
                        </tr>
                        <tr>
                            <td>
                                <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                    <input type="checkbox" class="group-checkable" data-set="#sample_2 .checkboxes" />
                                    <span></span>
                                </label>
                            </td>
                            <td> AAC </td>
                            <td> 项目1 </td>
                            <td> AUSTRALIAN AGRICULTURAL COMPANY LIMITED. </td>
                            <td class="numeric"> 22&nbsp; </td>
                            <td class="numeric"> -0.01 </td>
                            <td>
                                <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                    <input type="checkbox" class="group-checkable" data-set="#sample_2 .checkboxes" />
                                    <span></span>
                                </label>
                            </td>
                            <td class="numeric"> <button class="btn btn-sm btn-success filter-submit margin-bottom">
                                编辑</button></td>
                        </tr>
                        <tr>
                            <td>
                                <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                    <input type="checkbox" class="group-checkable" data-set="#sample_2 .checkboxes" />
                                    <span></span>
                                </label>
                            </td>
                            <td> AAC </td>
                            <td> 项目1 </td>
                            <td> AUSTRALIAN AGRICULTURAL COMPANY LIMITED. </td>
                            <td class="numeric">12 &nbsp; </td>
                            <td class="numeric"> -0.01 </td>
                            <td>
                                <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                    <input type="checkbox" class="group-checkable" data-set="#sample_2 .checkboxes" />
                                    <span></span>
                                </label>
                            </td>
                            <td class="numeric"> <button class="btn btn-sm btn-success filter-submit margin-bottom">
                                编辑</button></td>
                        </tr>
                        <tr>
                            <td>
                                <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                    <input type="checkbox" class="group-checkable" data-set="#sample_2 .checkboxes" />
                                    <span></span>
                                </label>
                            </td>
                            <td> AAC </td>
                            <td> 项目1 </td>
                            <td> AUSTRALIAN AGRICULTURAL COMPANY LIMITED. </td>
                            <td class="numeric"> 11&nbsp; </td>
                            <td class="numeric"> -0.01 </td>
                            <td>
                                <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                    <input type="checkbox" class="group-checkable" data-set="#sample_2 .checkboxes" />
                                    <span></span>
                                </label>
                            </td>
                            <td class="numeric"> <button class="btn btn-sm btn-success filter-submit margin-bottom">
                                编辑</button></td>
                        </tr>
                        <tr>
                            <td>
                                <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                    <input type="checkbox" class="group-checkable" data-set="#sample_2 .checkboxes" />
                                    <span></span>
                                </label>
                            </td>
                            <td> AAC </td>
                            <td> 项目1 </td>
                            <td> AUSTRALIAN AGRICULTURAL COMPANY LIMITED. </td>
                            <td class="numeric">22 &nbsp; </td>
                            <td class="numeric"> -0.01 </td>
                            <td>
                                <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                    <input type="checkbox" class="group-checkable" data-set="#sample_2 .checkboxes" />
                                    <span></span>
                                </label>
                            </td>
                            <td class="numeric"> <button class="btn btn-sm btn-success filter-submit margin-bottom">
                                编辑</button></td>
                        </tr>
                        <tr>
                            <td>
                                <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                    <input type="checkbox" class="group-checkable" data-set="#sample_2 .checkboxes" />
                                    <span></span>
                                </label>
                            </td>
                            <td> AAC </td>
                            <td> 项目1 </td>
                            <td> AUSTRALIAN AGRICULTURAL COMPANY LIMITED. </td>
                            <td class="numeric"> 12&nbsp; </td>
                            <td class="numeric"> -0.01 </td>
                            <td>
                                <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                    <input type="checkbox" class="group-checkable" data-set="#sample_2 .checkboxes" />
                                    <span></span>
                                </label>
                            </td>
                            <td class="numeric"> <button class="btn btn-sm btn-success filter-submit margin-bottom">
                                编辑</button></td>
                        </tr>
                        <tr>
                            <td>
                                <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                    <input type="checkbox" class="group-checkable" data-set="#sample_2 .checkboxes" />
                                    <span></span>
                                </label>
                            </td>
                            <td> AAC </td>
                            <td> 项目1 </td>
                            <td> AUSTRALIAN AGRICULTURAL COMPANY LIMITED. </td>
                            <td class="numeric"> 21&nbsp; </td>
                            <td class="numeric"> -0.01 </td>
                            <td>
                                <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                    <input type="checkbox" class="group-checkable" data-set="#sample_2 .checkboxes" />
                                    <span></span>
                                </label>
                            </td>
                            <td class="numeric"> <button class="btn btn-sm btn-success filter-submit margin-bottom">
                                编辑</button></td>
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
