package com.kang.spring.integration.component;

import com.kang.spring.integration.pojo.OrderItem;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/3/21.
 */
@Component
public class DrinkRouter {

    public String resolveOrderItemChannel(OrderItem orderItem) {
        return (orderItem.isIced()) ? "coldDrinksChannel" : "hotDrinksChannel";
    }

}
