package com.kang.spring.integration.processor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/3/13.
 */
@Component
@Slf4j
public class OrderProcessor {
    public String process(String order) {
        log.info("Processed order [{}]",order);
        return "Processed order " + order;
    }
}
