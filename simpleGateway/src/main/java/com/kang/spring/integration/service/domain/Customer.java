package com.kang.spring.integration.service.domain;

/**
 * Created by Administrator on 2016/2/6.
 */
public class Customer implements  java.io.Serializable {

    private String id;

    public Customer(String id) {
        super();
        this.id = id;
    }

    public String toString() {
        return "Customer: " + id;
    }

}
