package com.scxh.pagehelper.mapper;

import com.scxh.pagehelper.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: 乔童
 * @Date: 2019/12/25 16:41
 * @Version: 1.0
 */
@Mapper
@Repository
public interface BookMapper {
    List<Book> findBookList();
}
