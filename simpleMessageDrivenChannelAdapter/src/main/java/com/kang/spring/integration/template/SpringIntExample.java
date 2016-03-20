package com.kang.spring.integration.template;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/3/13.
 */

@ToString
@NoArgsConstructor
@AllArgsConstructor
class Employee implements  java.io.Serializable{
    private Integer id;
    private String name;
    private Integer age;
}


@Component
public class SpringIntExample {
    @Autowired
    private JmsTemplate jmsTemplate;

    public void sendEmployee() {
        Employee emp = new Employee(1, "Joe", 37);
        System.out.println("Queue employee " + emp + " for processing");
        jmsTemplate.convertAndSend("empQueue", emp);
        jmsTemplate.convertAndSend("empQueue", new Employee(2, "Sam", 25));
    }

    public void processEmployee(Employee emp) {
        System.out.println("Employee: " + emp + " processed");
    }
}
