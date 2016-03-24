package com.kang.spring.integration.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created by Administrator on 2016/3/21.
 */
@Data
@NoArgsConstructor
@ToString(exclude ="order" )
public class OrderItem  {

    private DrinkType drinkType;
    private boolean iced;
    private Order order;
    private int antall;

    public OrderItem(DrinkType drinkType, boolean iced, Order order, int antall) {
        this.drinkType = drinkType;
        this.iced = iced;
        this.order = order;
        this.antall = antall;
    }
}
