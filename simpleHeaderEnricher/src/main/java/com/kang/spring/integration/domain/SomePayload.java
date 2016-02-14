package com.kang.spring.integration.domain;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Administrator on 2016/2/6.
 */
public class SomePayload  {

    private String id;
    private AtomicLong serialNbr = new AtomicLong(0);

    public SomePayload(String id) {
        this.id = id;
    }

    public String toString() {
        return "Payload: " + id;
    }

    public String getId() {
        return id;
    }

    public long uniqueNbr() {

        return serialNbr.incrementAndGet();
    }
}
