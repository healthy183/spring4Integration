package com.kang.spring.integration.component;

import com.kang.spring.integration.pojo.Delivery;
import com.kang.spring.integration.pojo.Drink;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2016/3/21.
 */
@Component
public class Waiter {

    public Delivery prepareDelivery(List<Drink> drinks) {
               return new Delivery(drinks);
    }
}
