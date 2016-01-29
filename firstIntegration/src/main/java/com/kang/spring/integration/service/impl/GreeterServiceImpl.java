package com.kang.spring.integration.service.impl;

import com.kang.spring.integration.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Service;

import com.kang.spring.integration.service.GreeterService;

/**
 * @Title 类名
 * @Description 类描述
 * @Date 2016/1/27 15:09
 * @Author 梁健康
 * @Version 2.0
 */
@Service
public class GreeterServiceImpl implements GreeterService {

    @Autowired
    private MessageChannel helloWorldChannel;

    /*@Autowired
    private HelloService helloWorldGateway;*/

    @Override
    public void greet(String name) {
        helloWorldChannel.send(MessageBuilder.withPayload(name).build());
    }

    @Override
    public void greetGateway(String name) {
        //helloWorldGateway.get
    }


}
