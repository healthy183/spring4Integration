package com.kang.spring.integration.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Title 类名
 * @Description 类描述
 * @Date 2016/2/14 14:46
 * @Author 梁健康
 * @Version 2.0
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Customer implements java.io.Serializable {

    private String id;
    private String billingAddress;
    private int creditPoints;

    public Customer(String id) {
        this.id = id;
    }
}
