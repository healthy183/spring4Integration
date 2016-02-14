package com.kang.spring.integration.domain;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/2/6.
 */
@Component
public class HeaderBean implements Serializable {

    private static final long serialVersionUID = 1L;

    public String value() {
        return "value from headerBean";
    }

    public String enrichValue(SomePayload payload) {
        return "'" + payload.getId() + "' enriched";
    }

    public String toString() {
        return "I am HeaderBean";
    }

}
