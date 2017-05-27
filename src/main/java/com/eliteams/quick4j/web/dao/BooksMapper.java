package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.core.feature.orm.mybatis.Page;
import com.eliteams.quick4j.core.generic.GenericDao;
import com.eliteams.quick4j.web.model.Books;
import com.eliteams.quick4j.web.model.BooksExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BooksMapper extends GenericDao<Books, String> {
    int countByExample(BooksExample example);

    int deleteByExample(BooksExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Books record);

    int insertSelective(Books record);

    List<Books> selectByExample(BooksExample example);

    Books selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Books record, @Param("example") BooksExample example);

    int updateByExample(@Param("record") Books record, @Param("example") BooksExample example);

    int updateByPrimaryKeySelective(Books record);

    int updateByPrimaryKey(Books record);

    List<Books> selectListByExampleAndPage(Page<Books> page, BooksExample booksExample);
}