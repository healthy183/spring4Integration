package com.kang.spring.integration.run;

import com.kang.spring.integration.service.CustomerService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title 类名
 * @Description 类描述
 * @Date 2016/2/14 15:45
 * @Author 梁健康
 * @Version 2.0
 */
public class SpringIntegrationPayloadEnricherExample {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        try{
            CustomerService customerService = (CustomerService) context.getBean("custGateway");
            System.out.println(customerService.findCustomerById("Joe"));
            System.out.println(customerService.findCustomerById("Sam"));
        }finally{
            context.close();
        }


    }

}
