package com.eliteams.quick4j.web.service;

import com.eliteams.quick4j.core.generic.GenericService;
import com.eliteams.quick4j.web.model.UserServiceRel;

import java.util.List;

/**
 * Created by Angel on 2017/4/19.
 */
public interface UserServiceRelService extends GenericService<UserServiceRel, Long> {
    @Override
    int insert(UserServiceRel userServiceRel);

    @Override
    int update(UserServiceRel userServiceRel);

    @Override
    int delete(Long id);

    @Override
    UserServiceRel selectById(Long id);

    @Override
    UserServiceRel selectOne();

    @Override
    List<UserServiceRel> selectList();
}
