package com.kang.spring.integration.jdbc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created by Administrator on 2016/4/5.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Article {

    private int id;
    private String name;
    private String tags;
    private String category;
    private String author;
}
