package com.eliteams.quick4j.web.service.impl;

import com.eliteams.quick4j.core.feature.orm.mybatis.Page;
import com.eliteams.quick4j.core.generic.GenericDao;
import com.eliteams.quick4j.core.generic.GenericServiceImpl;
import com.eliteams.quick4j.web.dao.BooksMapper;
import com.eliteams.quick4j.web.model.Books;
import com.eliteams.quick4j.web.model.BooksExample;
import com.eliteams.quick4j.web.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhaoyuqi on 17/5/27.
 */
@Service
public class BooksServiceImpl extends GenericServiceImpl<Books, String> implements BooksService{
    @Resource
    private BooksMapper booksMapper;

    @Override
    public GenericDao<Books, String> getDao() {
        return booksMapper;
    }

    @Override
    public int insert(Books books) {
        return booksMapper.insert(books);
    }


    public int update(Books books, BooksExample booksExample) {
        return booksMapper.updateByExample(books,booksExample);
    }

    @Override
    public int update(Books books) {
        return super.update(books);
    }

    @Override
    public int delete(String id) {
        return super.delete(id);
    }

    public int deleteByExample(BooksExample booksExample) {
        return booksMapper.deleteByExample(booksExample);
    }

    @Override
    public Books selectById(String id) {
        return super.selectById(id);
    }

    @Override
    public Books selectOne() {
        return super.selectOne();
    }

    @Override
    public List<Books> selectList() {
        return super.selectList();
    }

    /**
     * 通过EXAMPLE和PAGE来查询列表
     * @param page
     * @param booksExample
     * @return
     */
    @Override
    public List<Books> selectListByExampleAndPage(Page<Books> page, BooksExample booksExample) {
        return booksMapper.selectListByExampleAndPage(page, booksExample);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
