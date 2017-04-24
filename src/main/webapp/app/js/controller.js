routerApp.controller('getMenuListCtr',['$scope','getMenuListServices',function($scope,getMenuListServices){
   getMenuListServices.menuList().success(function(data){
       $scope.menuList=data;
   });
}])


routerApp.controller('getMenuCtr',['$scope','getMenuServices',function($scope,getMenuServices){
   getMenuServices.menuInfo().success(function(data){
       $scope.menuInfo=data;
   });
}])