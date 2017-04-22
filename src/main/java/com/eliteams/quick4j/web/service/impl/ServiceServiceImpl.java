package com.eliteams.quick4j.web.service.impl;

import com.eliteams.quick4j.core.generic.GenericDao;
import com.eliteams.quick4j.core.generic.GenericServiceImpl;
import com.eliteams.quick4j.web.dao.ServiceMapper;
import com.eliteams.quick4j.web.model.Service;
import com.eliteams.quick4j.web.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Angel on 2017/4/19.
 */
@ org.springframework.stereotype.Service
public class ServiceServiceImpl extends GenericServiceImpl<Service, String> implements ServiceService {

    @Autowired
    private ServiceMapper serviceMapper;

    @Override
    public GenericDao<Service, String> getDao() {
        return serviceMapper;
    }

    @Override
    public int insert(Service service) {
        return super.insert(service);
    }

    @Override
    public int update(Service service) {
        return super.update(service);
    }

    @Override
    public int delete(String id) {
        return super.delete(id);
    }

    @Override
    public Service selectById(String id) {
        return serviceMapper.selectByPrimaryKey(id);
    }

    @Override
    public Service selectOne() {
        return super.selectOne();
    }

    @Override
    public List<Service> selectList() {
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
