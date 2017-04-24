package com.eliteams.quick4j.web.service;

import com.eliteams.quick4j.core.generic.GenericService;
import com.eliteams.quick4j.web.model.Orders;


import java.util.List;

/**
 * Created by dell on 2017/4/18.
 */
public interface OrdersService extends GenericService<Orders, String> {

    /**
     *通过订单ID来查询订单
     * @param OrderId
     * @return
     */
    List<Orders> selectOrdersByOrderId(String OrderId);

    /**
     * 根据订单号查询订单
     *
     * @param orderId
     * @return
     */
    Orders selectByOrderId(String orderId);
}
