package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.DaytimeReport;
import com.eliteams.quick4j.web.model.DaytimeReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DaytimeReportMapper {
    int countByExample(DaytimeReportExample example);

    int deleteByExample(DaytimeReportExample example);

    int deleteByPrimaryKey(String reportid);

    int insert(DaytimeReport record);

    int insertSelective(DaytimeReport record);

    List<DaytimeReport> selectByExample(DaytimeReportExample example);

    DaytimeReport selectByPrimaryKey(String reportid);

    int updateByExampleSelective(@Param("record") DaytimeReport record, @Param("example") DaytimeReportExample example);

    int updateByExample(@Param("record") DaytimeReport record, @Param("example") DaytimeReportExample example);

    int updateByPrimaryKeySelective(DaytimeReport record);

    int updateByPrimaryKey(DaytimeReport record);
}