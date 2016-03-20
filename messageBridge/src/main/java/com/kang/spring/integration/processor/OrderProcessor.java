package com.kang.spring.integration.processor;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/3/13.
 */
@Component
public class OrderProcessor {
    public String process(String order) {
        System.out.println("Processed order " + order);
        return "Processed order " + order;
    }
}
