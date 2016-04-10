package com.kang.spring.integration.service.run;

import com.kang.spring.integration.service.CustomerService;
import com.kang.spring.integration.service.domain.Customer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016/2/6.
 */
public class SpringIntegrationGatewayExample {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        try{
            CustomerService customerService =  (CustomerService)context.getBean("customerServiceGateway");
            System.out.println("Get Customer info synchronously!");
            for(int i = 0; i < 3; i++){
                String id = "C0"+i;
                System.out.println("id:"+id);
                Customer customer =  customerService.getCustomerInfo(id);
                System.out.println("Customer information for: " + id + "(" + customer + ")");
            }
        }finally {
            context.close();
        }
    }
}
