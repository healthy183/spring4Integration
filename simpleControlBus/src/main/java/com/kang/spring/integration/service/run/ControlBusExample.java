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
public class ControlBusExample {

    public static void main(String[] args) {


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        try{
            PollableChannel adapterOutputChanel = context.getBean("adapterOutputChannel", PollableChannel.class);

            System.out.println("Received before adapter started: " + adapterOutputChanel.receive(1000));

            MessageChannel controlBusChannel = (MessageChannel) context.getBean("controlBusChannel");

            controlBusChannel.send(MessageBuilder.withPayload("@processAdapter.start()").build());

            System.out.println("Received after adapter started: " + adapterOutputChanel.receive(1000));

        }finally {
            context.close();
        }

    }
}
