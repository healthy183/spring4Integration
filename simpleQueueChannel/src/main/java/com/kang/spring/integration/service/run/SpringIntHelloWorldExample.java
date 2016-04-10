package com.kang.spring.integration.service.run;

import lombok.Data;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.channel.QueueChannel;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;

/**
 * @Title 类名
 * @Description 类描述
 * @Date 2016/1/29 16:45
 * @Author 梁健康
 * @Version 2.0
 */
@Data
public class SpringIntHelloWorldExample {

    private MessageChannel inputChannel;


    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        try {
            SpringIntHelloWorldExample springIntExample = (SpringIntHelloWorldExample) context
                    .getBean("springIntHelloWorldExample");
            springIntExample.post("This is spring integration example.");
            QueueChannel outChannel = (QueueChannel) context.getBean("outputChannel");
            Message<String> message = (Message<String>) outChannel.receive();
            MessageHeaders header = message.getHeaders();
            String str = message.getPayload();
            System.out.println(header);
            System.out.println(str);
        } finally {
            context.close();
        }

    }

    public void post(String payload) {
        Message message = MessageBuilder.withPayload(payload).build();
        inputChannel.send(message);
    }
}
