package com.eliteams.quick4j.web.service.impl;

import com.eliteams.quick4j.core.generic.GenericDao;
import com.eliteams.quick4j.core.generic.GenericServiceImpl;
import com.eliteams.quick4j.web.dao.TransSerialMapper;
import com.eliteams.quick4j.web.model.TransSerial;
import com.eliteams.quick4j.web.service.TransSerialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * Created by Angel on 2017/4/19.
 */
@Service
public class TransSerialServiceImpl extends GenericServiceImpl<TransSerial, String> implements TransSerialService {

    @Autowired
    private TransSerialMapper transSerialMapper;

    @Override
    public GenericDao<TransSerial, String> getDao() {
        return transSerialMapper;
    }

    @Override
    public int insert(TransSerial transSerial) {
        return super.insert(transSerial);
    }

    @Override
    public int update(TransSerial transSerial) {
        return super.update(transSerial);
    }

    @Override
    public int delete(String id) {
        return super.delete(id);
    }

    @Override
    public TransSerial selectById(String id) {
        return super.selectById(id);
    }

    @Override
    public TransSerial selectOne() {
        return super.selectOne();
    }

    @Override
    public List<TransSerial> selectList() {
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
