package com.kang.spring.integration.service.impl;

import com.kang.spring.integration.domain.BillingInfo;
import com.kang.spring.integration.domain.Customer;
import com.kang.spring.integration.service.BillingService;
import org.springframework.stereotype.Service;

/**
 * @Title 类名
 * @Description 类描述
 * @Date 2016/2/14 14:54
 * @Author 梁健康
 * @Version 2.0
 */
@Service
public class BillingServiceImpl implements BillingService {

  /*
    int:enricher
    会将BillingInfo的BillingInfo，creditPoints封装到customer*/
    @Override
    public BillingInfo getBillingAddress(Customer customer) {
        if (customer.getId().equals("Joe")) {
            return new BillingInfo(customer, "Joe Billing Address - XYZ", 22);
        } else if (customer.getId().equals("Sam")) {
            return new BillingInfo(customer, "Sam Billing Address - ABC", 1001);
        }
        return new BillingInfo(customer, customer.getId() + " - " + "UNKNOWN", 0);
    }
}
