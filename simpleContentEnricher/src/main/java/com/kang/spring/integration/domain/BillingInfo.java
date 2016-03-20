package com.kang.spring.integration.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Title 类名
 * @Description 类描述
 * @Date 2016/2/14 14:51
 * @Author 梁健康
 * @Version 2.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BillingInfo {

    private Customer customer;
    private String address;
    private int creditPoints;
}
