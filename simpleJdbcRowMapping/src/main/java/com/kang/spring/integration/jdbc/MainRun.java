package com.kang.spring.integration.jdbc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by Administrator on 2016/4/5.
 */
public class MainRun {

    public static void main(String[] args) throws InterruptedException, IOException, SQLException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        Thread.sleep(1000);
        context.close();
    }

}
