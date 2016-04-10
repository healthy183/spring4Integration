package com.kang.spring.integration.jdbc;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2016/4/5.
 */
@Component
public class JdbcMessageHandler {

    public void handleMessage(List<Article> articleList) {
        System.out.println("In JdbcMessageHandler:" + articleList);
    }
}
