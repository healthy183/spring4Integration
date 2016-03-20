package com.kang.spring.integration.component;

import com.kang.spring.integration.pojo.Order;
import com.kang.spring.integration.pojo.OrderItem;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2016/3/21.
 */
@Component
public class OrderSplitter {

    public List<OrderItem> split(Order order) {
        return order.getItems();
    }

}
