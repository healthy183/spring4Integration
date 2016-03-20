package com.kang.spring.integration.run;

import com.kang.spring.integration.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/3/18.
 */
@Component
public class SimpleChannelRun {

    @Autowired
    private MessageChannel orderConfirmationChannel;

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("simpleQueueChannel.xml");
        SimpleChannelRun springIntExample = (SimpleChannelRun) context.getBean("simpleChannelRun");
        springIntExample.postOrder();
    }


    public void postOrder() {
        Order emp = new Order(1);
        Message msg = MessageBuilder.withPayload(emp).build();
        orderConfirmationChannel.send(msg);
    }
}
