package com.kang.spring.integration.main;

import com.kang.spring.integration.domain.Person;
import com.kang.spring.integration.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;
import java.util.List;

/**
 * Created by Administrator on 2016/4/17.
 */
@Slf4j
public class MainRun {

    public static void main(String[] args) {

        final ApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:applicationContext.xml");
        final PersonService service = context.getBean(PersonService.class);

        final Person person = new Person();
        Calendar createdDateTime = Calendar.getInstance();
        createdDateTime.set(1980, 0, 1);
        person.setCreatedDateTime(createdDateTime.getTime());
        person.setName("Name Of The Person");
        service.createPerson(person);

        List<Person>  list = service.findPeople();
        log.info("list :"+list.toString());

    }
}
