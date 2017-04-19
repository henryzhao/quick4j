package com.eliteams.quick4j.web.service.impl;

import com.eliteams.quick4j.core.generic.GenericDao;
import com.eliteams.quick4j.core.generic.GenericServiceImpl;
import com.eliteams.quick4j.web.dao.OrdersMapper;
import com.eliteams.quick4j.web.model.Orders;
import com.eliteams.quick4j.web.service.OrdersService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dell on 2017/4/18.
 */
public class OrdersServiceImpl extends GenericServiceImpl<Orders, Long> implements OrdersService {

    @Resource
    private OrdersMapper ordersMapper;


    @Override
    public GenericDao<Orders, Long> getDao() {
        return ordersMapper;
    }

    @Override
    public List<Orders> selectOrdersByOrderId(Long OrderId) {
        return ordersMapper.selectOrdersByOrderId(OrderId);
    }

    @Override
    public int insert(Orders orders) {
        return super.insert(orders);
    }

    @Override
    public int update(Orders orders) {
        return super.update(orders);
    }

    @Override
    public int delete(Long id) {
        return super.delete(id);
    }

    @Override
    public Orders selectById(Long id) {
        return super.selectById(id);
    }

    @Override
    public Orders selectOne() {
        return super.selectOne();
    }

    @Override
    public List<Orders> selectList() {
        return super.selectList();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
