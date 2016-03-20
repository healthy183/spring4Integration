package com.kang.spring.integration.service;

import com.kang.spring.integration.domain.BillingInfo;
import com.kang.spring.integration.domain.Customer;

/**
 * @Title 类名
 * @Description 类描述
 * @Date 2016/2/14 14:54
 * @Author 梁健康
 * @Version 2.0
 */
public interface BillingService {

    BillingInfo getBillingAddress(Customer customer);
}
