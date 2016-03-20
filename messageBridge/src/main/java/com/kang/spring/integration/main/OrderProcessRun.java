package com.kang.spring.integration.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.PollableChannel;

/**
 * Created by Administrator on 2016/3/13.
 */
public class OrderProcessRun {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "orderProcessApplicationContext.xml");
        try {
            context.start();
            PollableChannel orderChannel = (PollableChannel) context
                    .getBean("orderChannel");
            Message<String> orderMsg = MessageBuilder.withPayload(
                    "Order 3 Laptops").build();
            orderChannel.send(orderMsg);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            context.close();
        }


    }
}
