package com.eliteams.quick4j.web.service;

import com.eliteams.quick4j.core.feature.orm.mybatis.Page;
import com.eliteams.quick4j.core.generic.GenericService;
import com.eliteams.quick4j.web.model.Books;
import com.eliteams.quick4j.web.model.BooksExample;

import java.util.List;

/**
 * Created by zhaoyuqi on 17/5/27.
 */
public interface BooksService extends GenericService<Books, String>{
    @Override
    int insert(Books books);

    @Override
    int update(Books books);

    @Override
    int delete(String id);

    @Override
    Books selectById(String id);

    @Override
    Books selectOne();

    @Override
    List<Books> selectList();

    List<Books> selectListByExampleAndPage(Page<Books> page, BooksExample booksExample);
}
