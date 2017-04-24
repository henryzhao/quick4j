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
                <span class="caption-subject bold uppercase">近期营销额</span>
                <span class="caption-helper">展示近几日的营销额</span>
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
            <div id="CSSAnimationChart" class="CSSAnimationChart" style="height:400px;width: 100%;"></div>
        </div>
    </div>
    <!-- END PORTLET-->
</div>
<div class="m-heading-1 border-red m-bordered">
    <h3>Bootstrap Datetime Picker</h3>
    <p> Bootstrap form component to handle date and time data. For more info pleasw3e53ede check out
        <a href="http://www.malot.fr/bootstrap-datetimepicker/index.php" target="_blank">the official documentation</a>. </p>
</div>
<div class="row">
    <div class="col-md-12">
        <!-- BEGIN PORTLET-->
        <div class="portlet light form-fit bordered">
            <div class="portlet-title">
                <div class="caption">
                    <i class="icon-pin font-blue"></i>
                    <span class="caption-subject font-blue sbold uppercase">Datetime Pickers</span>
                </div>
                <div class="actions">
                    <div class="btn-group btn-group-devided" data-toggle="buttons">
                        <label class="btn btn-outline grey-salsa btn-circle btn-sm active">
                            <input type="radio" name="options" class="toggle" id="option1">New</label>
                        <label class="btn btn-outline grey-salsa btn-circle btn-sm">
                            <input type="radio" name="options" class="toggle" id="option2">Returning</label>
                    </div>
                </div>
            </div>
            <div class="portlet-body form">
                <!-- BEGIN FORM-->
                <form action="#" class="form-horizontal form-bordered">
                    <div class="form-body">
                        <div class="form-group">
                            <label class="control-label col-md-3">Default Datetimepicker</label>
                            <div class="col-md-4">
                                <div class="input-group date form_datetime">
                                    <input type="text" size="16" readonly class="form-control">
                                    <span class="input-group-btn">
                                                                        <button class="btn default date-set" type="button">
                                                                            <i class="fa fa-calendar"></i>
                                                                        </button>
                                                                    </span>
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-md-3">Advance Datetimepicker</label>
                            <div class="col-md-4">
                                <div class="input-group date form_datetime" data-date="2012-12-21T15:25:00Z">
                                    <input type="text" size="16" readonly class="form-control">
                                    <span class="input-group-btn">
                                                                        <button class="btn default date-reset" type="button">
                                                                            <i class="fa fa-times"></i>
                                                                        </button>
                                                                        <button class="btn default date-set" type="button">
                                                                            <i class="fa fa-calendar"></i>
                                                                        </button>
                                                                    </span>
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-md-3">Meridian Format</label>
                            <div class="col-md-4">
                                <div class="input-group date form_meridian_datetime" data-date="2012-12-21T15:25:00Z">
                                    <input type="text" size="16" class="form-control">
                                    <span class="input-group-btn">
                                                                        <button class="btn default date-reset" type="button">
                                                                            <i class="fa fa-times"></i>
                                                                        </button>
                                                                        <button class="btn default date-set" type="button">
                                                                            <i class="fa fa-calendar"></i>
                                                                        </button>
                                                                    </span>
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-md-3">Inline</label>
                            <div class="col-md-4">
                                <div class="form_datetime" data-date="2012-12-21T15:25:00Z"> </div>
                            </div>
                        </div>
                        <div class="form-group last">
                            <label class="control-label col-md-3"></label>
                            <div class="col-md-4">
                                <a class="btn btn-outline red" href="#form_modal1" data-toggle="modal"> View Datetimepicker in modal
                                    <i class="fa fa-share"></i>
                                </a>
                            </div>
                        </div>
                    </div>
                    <div class="form-actions">
                        <div class="row">
                            <div class="col-md-offset-3 col-md-9">
                                <button type="submit" class="btn grey-salsa btn-outline">
                                    <i class="fa fa-check"></i> Submit</button>
                                <button type="button" class="btn green">Cancel</button>
                            </div>
                        </div>
                    </div>
                </form>
                <div id="form_modal1" class="modal fade" role="dialog" aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                                <h4 class="modal-title">Datetimepicker in Modal</h4>
                            </div>
                            <div class="modal-body">
                                <form action="#" class="form-horizontal">
                                    <div class="form-group">
                                        <label class="control-label col-md-4">Default Datetimepicker</label>
                                        <div class="col-md-8">
                                            <div class="input-group date form_datetime input-large">
                                                <input type="text" size="16" readonly class="form-control">
                                                <span class="input-group-btn">
                                                                                    <button class="btn default date-set" type="button">
                                                                                        <i class="fa fa-calendar"></i>
                                                                                    </button>
                                                                                </span>
                                            </div>
                                            <!-- /input-group -->
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="control-label col-md-4">Advance Datetimepicker</label>
                                        <div class="col-md-8">
                                            <div class="input-group date form_datetime input-large" data-date="2012-12-21T15:25:00Z">
                                                <input type="text" size="16" readonly class="form-control">
                                                <span class="input-group-btn">
                                                                                    <button class="btn default date-reset" type="button">
                                                                                        <i class="fa fa-times"></i>
                                                                                    </button>
                                                                                    <button class="btn default date-set" type="button">
                                                                                        <i class="fa fa-calendar"></i>
                                                                                    </button>
                                                                                </span>
                                            </div>
                                            <!-- /input-group -->
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="control-label col-md-4">Meridian Format</label>
                                        <div class="col-md-8">
                                            <div class="input-group date form_meridian_datetime input-large" data-date="2012-12-21T15:25:00Z">
                                                <input type="text" size="16" class="form-control">
                                                <span class="input-group-btn">
                                                                                    <button class="btn default date-reset" type="button">
                                                                                        <i class="fa fa-times"></i>
                                                                                    </button>
                                                                                    <button class="btn default date-set" type="button">
                                                                                        <i class="fa fa-calendar"></i>
                                                                                    </button>
                                                                                </span>
                                            </div>
                                            <!-- /input-group -->
                                        </div>
                                    </div>
                                </form>
                            </div>
                            <div class="modal-footer">
                                <button class="btn grey-salsa btn-outline" data-dismiss="modal" aria-hidden="true">Close</button>
                                <button class="btn green btn-primary" data-dismiss="modal">Save changes</button>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- END FORM-->
            </div>
        </div>
        <!-- END PORTLET-->
    </div>
</div>