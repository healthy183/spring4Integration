package com.kang.spring.integration.domain;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.*;

/**
 * Created by Administrator on 2016/2/6.
 */
public class HeaderEnricherRun {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        try{
            MessageChannel inputChannel  = (MessageChannel)context.getBean("inputChannel");
            SubscribableChannel outputChannel  = (SubscribableChannel) context.getBean("outputChannel");

            outputChannel.subscribe(new MessageHandler() {
                @Override
                public void handleMessage(Message<?> message) throws MessagingException {
                    MessageHeaders headers =  message.getHeaders();
                    for (String key : headers.keySet()) {
                        System.out.println("Key: " + key + " , value: " + headers.get(key));
                    }
                }
            });
            inputChannel.send(MessageBuilder.withPayload(new SomePayload("Header Enricher")).build());
        }finally{
            context.close();
        }




    }


}
