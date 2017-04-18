package com.eliteams.quick4j.web.service.impl;

import com.eliteams.quick4j.core.generic.GenericDao;
import com.eliteams.quick4j.core.generic.GenericServiceImpl;
import com.eliteams.quick4j.web.dao.UserServiceRelMapper;
import com.eliteams.quick4j.web.model.UserServiceRel;
import com.eliteams.quick4j.web.service.UserServiceRelService;

import java.util.List;

/**
 * Created by Angel on 2017/4/19.
 */
public class UserServiceRelServiceImpl extends GenericServiceImpl<UserServiceRel, Long> implements UserServiceRelService {

    private UserServiceRelMapper userServiceRelMapper;

    @Override
    public GenericDao<UserServiceRel, Long> getDao() {
        return userServiceRelMapper;
    }

    @Override
    public int insert(UserServiceRel userServiceRel) {
        return super.insert(userServiceRel);
    }

    @Override
    public int update(UserServiceRel userServiceRel) {
        return super.update(userServiceRel);
    }

    @Override
    public int delete(Long id) {
        return super.delete(id);
    }

    @Override
    public UserServiceRel selectById(Long id) {
        return userServiceRelMapper.selectByPrimaryKey(id);
    }

    @Override
    public UserServiceRel selectOne() {
        return super.selectOne();
    }

    @Override
    public List<UserServiceRel> selectList() {
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
