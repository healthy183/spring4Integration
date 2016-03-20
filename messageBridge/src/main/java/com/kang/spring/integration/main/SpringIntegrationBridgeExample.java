package com.kang.spring.integration.main;

import com.kang.spring.integration.customer.BaseCustomer;
import com.kang.spring.integration.customer.PrivilegedCustomer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016/3/12.
 */
public class SpringIntegrationBridgeExample {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        try {
            PrivilegedCustomer privilegedCust = (PrivilegedCustomer) context
                    .getBean("privilegedCustomer");
            String complaint = "Machine is not working!";
            System.out.println("Post high priority complaint '" + complaint + "'");

            System.out.println("Response: " + privilegedCust.processRequest(complaint));

            System.out.println("Post normal priority complaint '" + complaint + "'");

            BaseCustomer baseCust = (BaseCustomer) context.getBean("baseCustomer");
            System.out.println("Response: " + baseCust.processRequest("General maintenance!"));
        } finally {
            context.close();
        }
    }

}
