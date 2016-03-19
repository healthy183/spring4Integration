package com.kang.spring.integration.service.impl;

import com.kang.spring.integration.domain.Customer;
import com.kang.spring.integration.service.CustomerService;
import org.springframework.stereotype.Service;

/**
 * @Title 类名
 * @Description 类描述
 * @Date 2016/2/14 14:46
 * @Author 梁健康
 * @Version 2.0
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public Customer findCustomerById(String id) {
        return new Customer(id);
    }
}
