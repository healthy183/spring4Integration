package com.kang.spring.integration.service;

import com.kang.spring.integration.service.domain.Customer;
import org.springframework.integration.annotation.Gateway;

/**
 * Created by Administrator on 2016/2/6.
 */
public interface CustomerService {

    @Gateway(requestChannel="customerRequestChannel")
    public Customer getCustomerInfo(String customerId);

    //
    @Gateway(requestChannel="customerRequestDispatcherChannel")
    public Customer getCustomerInfoAsyn(String customerId);

}
