package com.kang.spring.integration.run;

import lombok.extern.slf4j.Slf4j;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.integration.channel.QueueChannel;
import org.springframework.messaging.Message;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kang.spring.integration.service.GreeterService;

/**
 * @Title 类名
 * @Description 类描述
 * @Date 2016/1/27 15:29
 * @Author 梁健康
 * @Version 2.0
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
@Slf4j
public class MainRun {

    @Autowired
    private GreeterService greeterServiceImpl;

   /* @Autowired
    private QueueChannel outputChannel;*/


    @Test
    public void testHello(){
        greeterServiceImpl.greet("tom");

        /*Message<?> message =  outputChannel.receive();
        System.out.println(message);*/
    }
}
