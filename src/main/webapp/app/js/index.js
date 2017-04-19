$(function() {
    App.init();

    var Index = (function() {
        var me = {};

        // 处理一级菜单点击
        me.handleMenuClick = function() {
            $('#page-sidebar-menu > li').click(function(e) {
                var menu = $('#page-sidebar-menu');
                var li = menu.find('li.active').removeClass('active');

                // 添加选中 打开的样式
                // $(this).addClass('active');
            });
        };

        // 处理子菜单点击
        me.handleSubMenuClick = function() {
            $('#page-sidebar-menu li a').click(function(e) {
                e.preventDefault();
                var url = this.href;
                if (url != null && url != 'javascript:;') {
                    $.get(url, function(data) {
                        $('#main-content').html(data);
                    });
                }
            });
        };
        me.handleAmChart = function() {
            var chartData = [
                {
                    "date": "2012-01-05",
                    "distance": 480,
                    "townName": "Miami",
                    "townName2": "Miami",
                    "townSize": 10,
                    "latitude": 25.83,
                    "duration": 501
                },
                {
                    "date": "2012-01-06",
                    "distance": 386,
                    "townName": "Tallahassee",
                    "townSize": 7,
                    "latitude": 30.46,
                    "duration": 443
                },
                {
                    "date": "2012-01-07",
                    "distance": 348,
                    "townName": "New Orleans",
                    "townSize": 10,
                    "latitude": 29.94,
                    "duration": 405
                },
                {
                    "date": "2012-01-08",
                    "distance": 238,
                    "townName": "Houston",
                    "townName2": "Houston",
                    "townSize": 16,
                    "latitude": 29.76,
                    "duration": 309
                },
                {
                    "date": "2012-01-09",
                    "distance": 218,
                    "townName": "Dalas",
                    "townSize": 17,
                    "latitude": 32.8,
                    "duration": 287
                },
                {
                    "date": "2012-01-10",
                    "distance": 349,
                    "townName": "Oklahoma City",
                    "townSize": 11,
                    "latitude": 35.49,
                    "duration": 485
                },
                {
                    "date": "2012-01-11",
                    "distance": 603,
                    "townName": "Kansas City",
                    "townSize": 10,
                    "latitude": 39.1,
                    "duration": 890
                },
                {
                    "date": "2012-01-12",
                    "distance": 534,
                    "townName": "Denver",
                    "townName2": "Denver",
                    "townSize": 18,
                    "latitude": 39.74,
                    "duration": 810
                },
                {
                    "date": "2012-01-13",
                    "townName": "Salt Lake City",
                    "townSize": 12,
                    "distance": 425,
                    "duration": 670,
                    "latitude": 40.75,
                    "alpha":0.4
                },
                {
                    "date": "2012-01-14",
                    "latitude": 36.1,
                    "duration": 470,
                    "townName": "Las Vegas",
                    "townName2": "Las Vegas",
                    "bulletClass": "lastBullet"
                },
                {
                    "date": "2012-01-15"
                }
            ];
            var chart = AmCharts.makeChart("CSSAnimationChart", {
                type: "serial",
                fontSize: 12,
                fontFamily: "Open Sans",
                dataDateFormat: "YYYY-MM-DD",
                dataProvider: chartData,


                addClassNames: true,
                startDuration: 1,
                color: "#6c7b88",
                marginLeft: 0,
                height:500,

                categoryField: "date",
                categoryAxis: {
                    parseDates: true,
                    minPeriod: "DD",
                    autoGridCount: false,
                    gridCount: 50,
                    gridAlpha: 0.1,
                    gridColor: "#FFFFFF",
                    axisColor: "#555555",
                    dateFormats: [{
                        period: 'DD',
                        format: 'DD'
                    }, {
                        period: 'WW',
                        format: 'MMM DD'
                    }, {
                        period: 'MM',
                        format: 'MMM'
                    }, {
                        period: 'YYYY',
                        format: 'YYYY'
                    }]
                },

                valueAxes: [{
                    id: "a1",
                    title: "distance",
                    gridAlpha: 0,
                    axisAlpha: 0
                },{
                    id: "a2",
                    position: "right",
                    gridAlpha: 0,
                    axisAlpha: 0,
                    labelsEnabled: false
                },{
                    id: "a3",
                    title: "duration",
                    position: "right",
                    gridAlpha: 0,
                    axisAlpha: 0,
                    inside: true,
                    duration: "mm",
                    durationUnits: {
                        DD: "d. ",
                        hh: "h ",
                        mm: "min",
                        ss: ""
                    }
                }],
                graphs: [{
                    id: "g1",
                    valueField:  "distance",
                    title:  "distance",
                    type:  "column",
                    fillAlphas:  0.7,
                    valueAxis:  "a1",
                    balloonText:  "[[value]] miles",
                    legendValueText:  "[[value]] mi",
                    legendPeriodValueText:  "total: [[value.sum]] mi",
                    lineColor:  "#08a3cc",
                    alphaField:  "alpha",
                },{
                    id: "g2",
                    valueField: "latitude",
                    classNameField: "bulletClass",
                    title: "latitude/city",
                    type: "line",
                    valueAxis: "a2",
                    lineColor: "#786c56",
                    lineThickness: 1,
                    legendValueText: "[[description]]/[[value]]",
                    descriptionField: "townName",
                    bullet: "round",
                    bulletSizeField: "townSize",
                    bulletBorderColor: "#02617a",
                    bulletBorderAlpha: 1,
                    bulletBorderThickness: 2,
                    bulletColor: "#89c4f4",
                    labelText: "[[townName2]]",
                    labelPosition: "right",
                    balloonText: "latitude:[[value]]",
                    showBalloon: true,
                    animationPlayed: true,
                },{
                    id: "g3",
                    title: "duration",
                    valueField: "duration",
                    type: "line",
                    valueAxis: "a3",
                    lineAlpha: 0.8,
                    lineColor: "#e26a6a",
                    balloonText: "[[value]]",
                    lineThickness: 1,
                    legendValueText: "[[value]]",
                    bullet: "square",
                    bulletBorderColor: "#e26a6a",
                    bulletBorderThickness: 1,
                    bulletBorderAlpha: 0.8,
                    dashLengthField: "dashLength",
                    animationPlayed: true
                }],

                chartCursor: {
                    zoomable: false,
                    categoryBalloonDateFormat: "DD",
                    cursorAlpha: 0,
                    categoryBalloonColor: "#e26a6a",
                    categoryBalloonAlpha: 0.8,
                    valueBalloonsEnabled: false
                },
                legend: {
                    bulletType: "round",
                    equalWidths: false,
                    valueWidth: 120,
                    useGraphSettings: true,
                    color: "#6c7b88"
                }
            });
        };

        me.init = function() {
            me.handleMenuClick();
            me.handleSubMenuClick();
            me.handleAmChart();
        };

        return me;
    })();

    Index.init();


    $('#btn-dashboard').trigger("click");
});