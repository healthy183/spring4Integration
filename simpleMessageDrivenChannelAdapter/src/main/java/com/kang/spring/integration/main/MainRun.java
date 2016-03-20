package com.kang.spring.integration.main;

import com.kang.spring.integration.template.SpringIntExample;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016/3/13.
 */
public class MainRun {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SpringIntExample springIntExample = (SpringIntExample) context.getBean("springIntExample");
        springIntExample.sendEmployee();
    }


}
