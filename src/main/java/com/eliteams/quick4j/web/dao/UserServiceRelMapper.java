package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.UserServiceRel;
import com.eliteams.quick4j.web.model.UserServiceRelExample;
import com.eliteams.quick4j.web.model.UserServiceRelKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserServiceRelMapper {
    int countByExample(UserServiceRelExample example);

    int deleteByExample(UserServiceRelExample example);

    int deleteByPrimaryKey(UserServiceRelKey key);

    int insert(UserServiceRel record);

    int insertSelective(UserServiceRel record);

    List<UserServiceRel> selectByExample(UserServiceRelExample example);

    UserServiceRel selectByPrimaryKey(UserServiceRelKey key);

    int updateByExampleSelective(@Param("record") UserServiceRel record, @Param("example") UserServiceRelExample example);

    int updateByExample(@Param("record") UserServiceRel record, @Param("example") UserServiceRelExample example);

    int updateByPrimaryKeySelective(UserServiceRel record);

    int updateByPrimaryKey(UserServiceRel record);
}