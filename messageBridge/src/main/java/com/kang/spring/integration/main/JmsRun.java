package com.kang.spring.integration.main;

import org.apache.activemq.broker.BrokerService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016/3/13.
 */
public class JmsRun {

    public static void main(String[] args) {

        try {
            BrokerService broker = new BrokerService();
            broker.setPersistent(false);
            broker.setUseJmx(false);
            broker.setTransportConnectorURIs(new String[] { "tcp://localhost:61623" });
            broker.setDeleteAllMessagesOnStartup(true);
            broker.start();

            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                    "JmsApplicationContext.xml");
            context.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
