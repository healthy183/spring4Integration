package com.kang.spring.integration.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @Title 类名
 * @Description 类描述
 * @Date 2016/2/24 16:06
 * @Author 梁健康
 * @Version 2.0
 */
public class SpringIntegrationFileCopyExample {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        try {
            Thread.sleep(2000);
            Properties prop = new Properties();
            FileInputStream is = new FileInputStream(new File(System.getProperty("user.dir") + "/output/fileToCopy.properties"));
            prop.load(is);
            System.out.println(prop);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            context.close();
        }

    }

}
