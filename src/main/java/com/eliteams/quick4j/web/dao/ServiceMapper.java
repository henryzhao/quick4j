package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.core.generic.GenericDao;
import com.eliteams.quick4j.web.model.Service;
import com.eliteams.quick4j.web.model.ServiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServiceMapper extends GenericDao<Service, String>{
    int countByExample(ServiceExample example);

    int deleteByExample(ServiceExample example);

    int deleteByPrimaryKey(String serviceid);

    int insert(Service record);

    int insertSelective(Service record);

    List<Service> selectByExampleWithBLOBs(ServiceExample example);

    List<Service> selectByExample(ServiceExample example);

    Service selectByPrimaryKey(String serviceid);

    int updateByExampleSelective(@Param("record") Service record, @Param("example") ServiceExample example);

    int updateByExampleWithBLOBs(@Param("record") Service record, @Param("example") ServiceExample example);

    int updateByExample(@Param("record") Service record, @Param("example") ServiceExample example);

    int updateByPrimaryKeySelective(Service record);

    int updateByPrimaryKeyWithBLOBs(Service record);

    int updateByPrimaryKey(Service record);
}