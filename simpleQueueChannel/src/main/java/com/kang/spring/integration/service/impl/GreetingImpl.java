package com.kang.spring.integration.service.impl;

import com.kang.spring.integration.service.Greeting;
import org.springframework.stereotype.Service;

/**
 * @Title 类名
 * @Description 类描述
 * @Date 2016/1/29 16:26
 * @Author 梁健康
 * @Version 2.0
 */
@Service
public class GreetingImpl implements Greeting {
    @Override
    public String sayHello(String payload) {
        return "Hello World!" + payload;
    }
}
