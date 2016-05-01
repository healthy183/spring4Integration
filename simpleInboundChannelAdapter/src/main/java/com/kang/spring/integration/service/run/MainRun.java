package com.kang.spring.integration.service.run;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.PollableChannel;

/**
 * @Title 类名
 * @Description 类描述
 * @Date 2016/1/29 18:01
 * @Author 梁健康
 * @Version 2.0
 */
public class MainRun {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = null;
       try{
            context = new ClassPathXmlApplicationContext("applicationContext.xml");
           Thread.sleep(1000);
           context.close();
       } catch (InterruptedException e) {
           e.printStackTrace();
       } finally {
        }
    }
}
