package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.TransSerial;
import com.eliteams.quick4j.web.model.TransSerialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TransSerialMapper {
    int countByExample(TransSerialExample example);

    int deleteByExample(TransSerialExample example);

    int deleteByPrimaryKey(String serialid);

    int insert(TransSerial record);

    int insertSelective(TransSerial record);

    List<TransSerial> selectByExample(TransSerialExample example);

    TransSerial selectByPrimaryKey(String serialid);

    int updateByExampleSelective(@Param("record") TransSerial record, @Param("example") TransSerialExample example);

    int updateByExample(@Param("record") TransSerial record, @Param("example") TransSerialExample example);

    int updateByPrimaryKeySelective(TransSerial record);

    int updateByPrimaryKey(TransSerial record);
}