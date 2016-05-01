package com.kang.spring.integration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.channel.QueueChannel;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;

/**
 * Created by Administrator on 2016/5/1.
 */
@Slf4j
public class MainRun {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = null;
        try{
            context = new ClassPathXmlApplicationContext("applicationContext.xml");
            Thread.sleep(1000);
            String payload = "XXXABCXXX";
            MessageChannel inputChannel = (MessageChannel) context.getBean("inputChannel");
            QueueChannel queueChannel = (QueueChannel) context.getBean("outputChannel");
            Message<String> message = MessageBuilder.withPayload(payload).build();
            inputChannel.send(message);
            Message<?> outMessage = queueChannel.receive(0);
            log.info("outMessage-payload:"+outMessage.getPayload());
            log.info("outMessage-payload-myHeader:"+outMessage.getHeaders().get("myHeader"));
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            context.close();
        }
    }
}
