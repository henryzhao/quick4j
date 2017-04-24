package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.VipReport;
import com.eliteams.quick4j.web.model.VipReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VipReportMapper {
    int countByExample(VipReportExample example);

    int deleteByExample(VipReportExample example);

    int deleteByPrimaryKey(String vipreportid);

    int insert(VipReport record);

    int insertSelective(VipReport record);

    List<VipReport> selectByExample(VipReportExample example);

    VipReport selectByPrimaryKey(String vipreportid);

    int updateByExampleSelective(@Param("record") VipReport record, @Param("example") VipReportExample example);

    int updateByExample(@Param("record") VipReport record, @Param("example") VipReportExample example);

    int updateByPrimaryKeySelective(VipReport record);

    int updateByPrimaryKey(VipReport record);
}