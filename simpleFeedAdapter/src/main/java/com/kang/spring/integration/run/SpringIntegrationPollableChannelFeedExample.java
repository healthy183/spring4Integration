package com.kang.spring.integration.run;

import com.rometools.rome.feed.synd.SyndEntry;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.messaging.Message;
import org.springframework.messaging.PollableChannel;

/**
 * @Title 类名
 * @Description 类描述
 * @Date 2016/2/14 17:02
 * @Author 梁健康
 * @Version 2.0
 */
public class SpringIntegrationPollableChannelFeedExample {

    public static void main(String[] args) {


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        try {
            PollableChannel feedChannel = context.getBean("articleChannel", PollableChannel.class);
            for (int i = 0; i < 10; i++) {
                Message<SyndEntry> message = (Message<SyndEntry>) feedChannel.receive(10000);
                if (message != null){
                    SyndEntry entry = message.getPayload();
                    System.out.println(entry.getPublishedDate() + " - " + entry.getTitle());
                }
                else {
                    break;
                }
            }
        } finally {
            context.close();
        }
    }
}
