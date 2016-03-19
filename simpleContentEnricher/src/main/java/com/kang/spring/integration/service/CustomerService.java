package com.kang.spring.integration.service;

import com.kang.spring.integration.domain.Customer;

/**
 * @Title 类名
 * @Description 类描述
 * @Date 2016/2/14 14:45
 * @Author 梁健康
 * @Version 2.0
 */
public interface CustomerService {

    Customer findCustomerById(String id);
}
