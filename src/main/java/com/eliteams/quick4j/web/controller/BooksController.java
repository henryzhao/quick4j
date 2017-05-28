package com.eliteams.quick4j.web.controller;

import com.eliteams.quick4j.core.entity.JSONResult;
import com.eliteams.quick4j.core.entity.Result;
import com.eliteams.quick4j.core.feature.orm.mybatis.Page;
import com.eliteams.quick4j.web.model.Books;
import com.eliteams.quick4j.web.model.BooksExample;
import com.eliteams.quick4j.web.service.BooksService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * Created by zhaoyuqi on 17/5/27.
 */
@Controller
@RequestMapping(value = "/books")
public class BooksController {

    private static Logger log = LoggerFactory.getLogger(BooksController.class);

    @Resource
    private BooksService booksService;

    /**
     * 存图书数据进入数据库
     * @param books
     * @return
     */
    @RequestMapping(value = "/books", method = RequestMethod.POST)
    @ResponseBody
    public JSONResult<Result> saveBooks(@Valid Books books){

        JSONResult<Result> resp =new JSONResult<Result>();
        Result data =new Result ();
        data.setMessage("处理成功");
        resp.setData(data);
        resp.setStatusCode(200);
        resp.setMessage("处理成功");
        resp.setSuccess(true);

         if (books.getBookname()!=null) {
             booksService.insert(books);
         }else {
             data.setMessage("处理失败,未检测到图书记录");
             resp.setSuccess(false);
             return resp;
         }
        return resp;
    }


    /**
     * 获取书籍的列表
     * @param pageNo
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "/books.json")
    @ResponseBody
    public List<Books> getBooks(@RequestParam("pageNo") int pageNo,@RequestParam("pageSize") int pageSize){
        Page<Books> page = new Page<Books>(pageNo,pageSize);
        BooksExample booksExample = new BooksExample();
        List<Books> list  = booksService.selectListByExampleAndPage(page,booksExample);
        return list;
    }

    /**
     * 获取书籍总数
     * @return
     */
    @RequestMapping(value = "/number")
    @ResponseBody
    public int getCount(){
        BooksExample booksExample = new BooksExample();
        int count = booksService.selectByExampe(booksExample).size();
        return count;
    }
}
