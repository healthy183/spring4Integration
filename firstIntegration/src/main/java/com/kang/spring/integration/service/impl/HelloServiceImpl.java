package com.kang.spring.integration.service.impl;

import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;

import com.kang.spring.integration.service.HelloService;

/**
 * @Title 类名
 * @Description 类描述
 * @Date 2016/1/27 15:04
 * @Author 梁健康
 * @Version 2.0
 */
@Service
@Slf4j
public class HelloServiceImpl implements HelloService {

    @Override
    public void hello(String name) {
       //System.out.println("hello ,"+ name);
        log.info("hello {}!",name);
    }
}
