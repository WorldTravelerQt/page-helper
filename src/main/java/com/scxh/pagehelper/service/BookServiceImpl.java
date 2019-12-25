package com.scxh.pagehelper.service;

import com.scxh.pagehelper.entity.Book;
import com.scxh.pagehelper.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 乔童
 * @Description:
 * @Date: 2019/12/25 16:44
 * @Version: 1.0
 */
@Service
public class BookServiceImpl {
    @Autowired
    private BookMapper bookMapper;
    public List<Book> findBookList()
    {
        return bookMapper.findBookList();
    }
}
