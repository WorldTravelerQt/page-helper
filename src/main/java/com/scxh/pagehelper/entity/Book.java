package com.scxh.pagehelper.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: 乔童
 * @Description: 图书实体类
 * @Date: 2019/12/25 16:35
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private Integer bookId;
    private String bookName;
    private Integer bookCount;
    private String detail;
}
