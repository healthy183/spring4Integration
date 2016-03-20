package com.kang.spring.integration.main;

import com.kang.spring.integration.cafe.Cafe;
import com.kang.spring.integration.pojo.DrinkType;
import com.kang.spring.integration.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/3/21.
 */
public class MainRun {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Cafe cafe = (Cafe) context.getBean("cafe");

        Order order = new Order();
        order.addItem(DrinkType.TEA,1,true);
        cafe.placeOrder(order);


    }


}
