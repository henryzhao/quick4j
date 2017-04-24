routerApp.config(function($stateProvider, $urlRouterProvider) {
    $urlRouterProvider.otherwise('/index');
    $stateProvider.state('index', {
        url: '/index',
        views: {
            '': {
                templateUrl: 'tpls/home.html'
            },
            'top@index': {
                templateUrl: 'tpls/top.html'
            }, 
            'mid@index': {
                templateUrl: 'tpls/mid.html'
            }, 
            'foot@index': {
                templateUrl: 'tpls/foot.html'
            },'left@index': {
                templateUrl: 'tpls/left.html'
            },
            'right@index': {
                templateUrl: 'tpls/right.html'
            } 
        }
    })
    .state('index.getMenuView', {
            url: '/{menuId:[0-9]{1,4}}',
            views: { 
                'left@index': {
                    templateUrl: 'tpls/left.html'
                },
                'right@index': {
                    templateUrl: 'tpls/right.html'
                } 
            }
        })
});

