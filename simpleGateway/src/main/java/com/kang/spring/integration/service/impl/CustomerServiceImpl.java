package com.kang.spring.integration.service.impl;

import com.kang.spring.integration.service.CustomerService;
import com.kang.spring.integration.service.domain.Customer;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/2/6.
 */
@Service
public class CustomerServiceImpl {

    public Customer getCustomerInfo(String customerId) {
        return new Customer(customerId + ", called by: " + Thread.currentThread().getName());
    }

    public Customer getCustomerInfoAsyn(String customerId) {
        return new Customer(customerId + ",asyn called by: " + Thread.currentThread().getName());
    }
}
