package com.kang.spring.integration.service;

import com.kang.spring.integration.service.domain.Customer;

/**
 * Created by Administrator on 2016/2/6.
 */
public interface CustomerService {

    public Customer getCustomerInfo(String customerId);
}
