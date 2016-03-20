package com.kang.spring.integration.processor;

import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/3/12.
 */
@Component
public class ComplaintProcessor {

    public String process(Message complaint){
        String priority = complaint.getHeaders().get("customerPriority", String.class);
        if ("high".equals(priority)) {
            return "Complaint logged '" + complaint + "'";
        } else {
            return "Complaint queued '" + complaint + "'";
        }
    }
}

