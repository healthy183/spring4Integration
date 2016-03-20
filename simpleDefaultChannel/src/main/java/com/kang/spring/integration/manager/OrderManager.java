package com.kang.spring.integration.manager;

import com.kang.spring.integration.model.Order;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/3/17.
 */
@Component
public class OrderManager  {

    public Order billOrder(Order order) {
        System.out.println("Bill Order " + order);
        order.setBilled(true);
        return order;
    }

    public Order updateInventory(Order order) {
        System.out.println("Update inventory for " + order);
        order.setInvUpdated(true);
        return order;
    }

    public void emailOrderConfirmation(Order order) {
        order.setEmailSent(true);
        System.out.println("Email order confirmation " + order);
    }

}
