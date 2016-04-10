package com.kang.spring.integration.run;

import com.kang.spring.integration.model.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.PollableChannel;
import org.springframework.messaging.support.GenericMessage;

/**
 * Created by Administrator on 2016/4/8.
 */
@Slf4j
public class simplePollableChannel {

    public static void main(String[] args) {

        ApplicationContext context = null;
        context = new ClassPathXmlApplicationContext("simplePollableChannel.xml");
        MessageChannel inputChannel = (MessageChannel) context.getBean("orderConfirmationChannel");
        PollableChannel pollableChannel = (PollableChannel) context.getBean("orderBilledChannel");

        inputChannel.send(new GenericMessage<Order>(new Order(1)));
        Order payload = (Order)pollableChannel.receive(0).getPayload();
        log.info("payload:"+payload.toString());
    }
}
