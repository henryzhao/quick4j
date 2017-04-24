routerApp.factory('getMenuListServices',['$http',function($http){
    var getAllList=function(data){
        return $http({
            method :'GET',
            url: "menu/getAllMenu",
            params:{name:'test'}
        });
    }

    return {
        menuList:function(){
            return getAllList();
        }
    }
}])


routerApp.factory('getMenuServices',['$http','$stateParams',function($http,$stateParams){
	return {
		menuInfo:function(){ 
			return $http({
	            method :'GET',
	            url: "menu/getMenuById",
	            params:{id:$stateParams.menuId}
	        });
		}
	}
}])