package com.scxh.pagehelper.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.scxh.pagehelper.entity.Book;
import com.scxh.pagehelper.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author: 乔童
 * @Description:
 * @Date: 2019/12/25 16:47
 * @Version: 1.0
 */
@Controller
public class BookController {
    @Autowired
    private BookServiceImpl bookService;
    @RequestMapping("/")
    public String index(Model model)
    {
        //启用分页插件，这个语句表示对接下来的一条sql语句进行拦截并产生分页数据
        PageHelper.startPage(1, 2);
        //这条就是被拦截的是Sql语句
        List<Book> bookList = bookService.findBookList();
        //将刚才产生的分页数据封装到BookInfo对象中
        PageInfo<Book> bookPageInfo = new PageInfo<>(bookList);
        model.addAttribute("books",bookPageInfo);
        return "index";
    }
}
