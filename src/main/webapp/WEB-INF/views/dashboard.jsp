<%@ page language="java" pageEncoding="utf-8"%>
<div class="row">
    <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
        <div class="dashboard-stat blue">
            <div class="visual">
                <i class="fa fa-comments"></i>
            </div>
            <div class="details">
                <div class="number">会员总数：1349</div>
            </div>
            <a class="more" href="#"> 查看更多 <i class="m-icon-swapright m-icon-white"></i>
            </a>
        </div>
    </div>
    <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
        <div class="dashboard-stat green">
            <div class="visual">
                <i class="fa fa-shopping-cart"></i>
            </div>
            <div class="details">
                <div class="number">新增会员：549</div>
            </div>
            <a class="more" href="#"> 查看更多 <i class="m-icon-swapright m-icon-white"></i>
            </a>
        </div>
    </div>
    <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
        <div class="dashboard-stat purple">
            <div class="visual">
                <i class="fa fa-globe"></i>
            </div>
            <div class="details">
                <div class="number">充值人数：89</div>
            </div>
            <a class="more" href="#"> 查看更多 <i class="m-icon-swapright m-icon-white"></i>
            </a>
        </div>
    </div>
    <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
        <div class="dashboard-stat yellow">
            <div class="visual">
                <i class="fa fa-bar-chart-o"></i>
            </div>
            <div class="details">
                <div class="number">员工人数：36</div>
            </div>
            <a class="more" href="#"> 查看更多 <i class="m-icon-swapright m-icon-white"></i>
            </a>
        </div>
    </div>
</div>
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