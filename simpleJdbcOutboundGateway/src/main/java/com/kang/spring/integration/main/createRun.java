package com.kang.spring.integration.main;

import com.kang.spring.integration.domain.Gender;
import com.kang.spring.integration.domain.Person;
import com.kang.spring.integration.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * Created by Administrator on 2016/4/16.
 */
@Slf4j
public class createRun {

    public static void main(String[] args) throws InterruptedException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "create.xml");

        final PersonService personService = context.getBean(PersonService.class);

        Person person = new Person();
        person.setDateOfBirth(new Date());
        person.setGender(Gender.MALE);
        person.setName("tom");
        Person newPerson = personService.createPerson(person);
        log.info("newPerson is"+newPerson);
        //log.info("id is"+newPerson.getPersonId());
        Thread.sleep(3000);
    }
}
