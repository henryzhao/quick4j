package com.eliteams.quick4j.web.service;

import com.eliteams.quick4j.core.generic.GenericService;
import com.eliteams.quick4j.web.model.Service;

import java.util.List;

/**
 * Created by Angel on 2017/4/19.
 */
public interface ServiceService extends GenericService<Service, Long> {
    @Override
    int insert(Service service);

    @Override
    int update(Service service);

    @Override
    int delete(Long id);

    @Override
    Service selectById(Long id);

    @Override
    Service selectOne();

    @Override
    List<Service> selectList();
}
