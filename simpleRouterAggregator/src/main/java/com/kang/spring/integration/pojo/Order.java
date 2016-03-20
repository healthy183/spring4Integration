package com.kang.spring.integration.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/3/21.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Order implements  java.io.Serializable {

    private Integer orderNumber;

    List<OrderItem> orderItems = new ArrayList<OrderItem>();

    public Order(int i) {
        orderNumber = i;
    }

    public void addItem(DrinkType latte, int antall, boolean iced) {
        orderItems.add(new OrderItem(latte, iced, this, antall));
    }

    public Integer getNumber() {
        return orderNumber;
    }

    public List<OrderItem> getItems() {
        return orderItems;
    }
}
