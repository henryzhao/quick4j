package com.eliteams.quick4j.web.service;

import com.eliteams.quick4j.core.generic.GenericService;
import com.eliteams.quick4j.web.model.TransSerial;

import java.util.List;

/**
 * Created by Angel on 2017/4/19.
 */
public interface TransSerialService extends GenericService<TransSerial, String> {
    @Override
    int insert(TransSerial transSerial);

    @Override
    int update(TransSerial transSerial);

    @Override
    int delete(String id);

    @Override
    TransSerial selectById(String id);

    @Override
    TransSerial selectOne();

    @Override
    List<TransSerial> selectList();
}
