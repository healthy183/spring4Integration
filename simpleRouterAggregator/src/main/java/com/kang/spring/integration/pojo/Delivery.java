package com.kang.spring.integration.pojo;

import lombok.Getter;

import java.util.List;

/**
 * Created by Administrator on 2016/3/21.
 */
public class Delivery {

    private static final String SEPARATOR = "-----------------------";

    @Getter
    private List<Drink> deliveredDrinks;

    @Getter
    private int orderNumber;

    public Delivery(List<Drink> deliveredDrinks) {
        assert (deliveredDrinks.size() > 0);
        this.deliveredDrinks = deliveredDrinks;
        this.orderNumber = deliveredDrinks.get(0).getOrderNumber();
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer(SEPARATOR + "\n");
        buffer.append("Order #" + getOrderNumber() + "\n");
        for (Drink drink : getDeliveredDrinks()) {
            buffer.append(drink);
            buffer.append("\n");
        }
        buffer.append(SEPARATOR + "\n");
        return buffer.toString();
    }


}
