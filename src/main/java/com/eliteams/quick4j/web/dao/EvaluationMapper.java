package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.Evaluation;
import com.eliteams.quick4j.web.model.EvaluationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EvaluationMapper {
    int countByExample(EvaluationExample example);

    int deleteByExample(EvaluationExample example);

    int deleteByPrimaryKey(String evalid);

    int insert(Evaluation record);

    int insertSelective(Evaluation record);

    List<Evaluation> selectByExampleWithBLOBs(EvaluationExample example);

    List<Evaluation> selectByExample(EvaluationExample example);

    Evaluation selectByPrimaryKey(String evalid);

    int updateByExampleSelective(@Param("record") Evaluation record, @Param("example") EvaluationExample example);

    int updateByExampleWithBLOBs(@Param("record") Evaluation record, @Param("example") EvaluationExample example);

    int updateByExample(@Param("record") Evaluation record, @Param("example") EvaluationExample example);

    int updateByPrimaryKeySelective(Evaluation record);

    int updateByPrimaryKeyWithBLOBs(Evaluation record);

    int updateByPrimaryKey(Evaluation record);
}