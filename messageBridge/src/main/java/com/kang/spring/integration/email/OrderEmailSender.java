package com.kang.spring.integration.email;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/3/13.
 */
@Component
public class OrderEmailSender {
    public void sendEmail(String order) {
        System.out.println("Send email for " + order);
    }
}
