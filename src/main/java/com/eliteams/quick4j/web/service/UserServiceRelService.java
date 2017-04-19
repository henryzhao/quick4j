package com.eliteams.quick4j.web.service;

import com.eliteams.quick4j.core.generic.GenericService;
import com.eliteams.quick4j.web.model.UserServiceRel;
import com.eliteams.quick4j.web.model.UserServiceRelExample;
import com.eliteams.quick4j.web.model.UserServiceRelKey;

import java.util.List;

/**
 * Created by Angel on 2017/4/19.
 */
public interface UserServiceRelService extends GenericService<UserServiceRel, UserServiceRelKey> {
    @Override
    int insert(UserServiceRel userServiceRel);

    @Override
    int update(UserServiceRel userServiceRel);

    @Override
    int delete(UserServiceRelKey id);

    @Override
    UserServiceRel selectById(UserServiceRelKey id);

    @Override
    UserServiceRel selectOne();

    @Override
    List<UserServiceRel> selectList();
    
    List<UserServiceRel> selectByExample(UserServiceRelExample example);   
}
