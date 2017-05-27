/**
 * Created by Angel on 2017/5/24.
 */
/**
 * Created by Angel on 2017/5/20.
 */
/**
 * Created by Angel on 2017/5/17.
 */
function getNowFormatDate() {
    var date = new Date();
    var seperator1 = "-";
    var month = date.getMonth() + 1;
    var strDate = date.getDate();
    if (month >= 1 && month <= 9) {
        month = "0" + month;
    }
    if (strDate >= 0 && strDate <= 9) {
        strDate = "0" + strDate;
    }
    var currentdate = date.getFullYear() + seperator1 + month + seperator1 + strDate ;
    return currentdate;
}
var date = getNowFormatDate();
var _pageNo=1;
var _pageSize=500;

//var date = '2017-05-17';
//alert($('#order_date_from').val());
// if($('#order_date_from').val()!=null){
//     date = $('#order_date_from').val();
// }

var vm = new Vue({

    el:"#refund_table",
    data:{
        orders: '',
        originOrders:'',
        queryParams: {
            tel:''
        },
        resp:{


        }
    },
    methods:{
        search:function(){
            this.queryParams.tel = $("input[name='order_phone']").val().trim();
            this.orders = newOrders(this.originOrders, this.queryParams);
        },
        refund:function (oriOrderid) {
            this.$http.post('rest/orders/refund_apply?oriOrderId='+oriOrderid).then(function(res) {
                console.log(res.data);
                //  alert('c');

                alert("处理成功");
                $('#btn-refund').trigger("click");

            }).catch(function(err) {
//                        console.log('fail' + status + "," + request);
                console.log(err);
            })
        }
    },
    mounted: function() {
        //alert('a');
        this.$nextTick(function () {
            //alert('b');
            this.$http.get('rest/orders/orders.json?pageNo='+ _pageNo+'&pageSize='+_pageSize).then(function(res) {
                console.log(res.data);
                //  alert('c');
                this.orders = res.data;
                this.originOrders = res.data;
//                        this.$set('json', res.data);
            }).catch(function(err) {
//                        console.log('fail' + status + "," + request);
                console.log(err);
            })
        })
    },


});
function newOrders(orders, queryParams){

    var newOrders = [];
    if(queryParams.tel===""){
        return orders;
    }

    $.each(orders,function(index, value){

        if(value.tel===queryParams.tel){
            //满足条件的push进返回数组
            newOrders.push(value);
        }
    });

    return newOrders;

}