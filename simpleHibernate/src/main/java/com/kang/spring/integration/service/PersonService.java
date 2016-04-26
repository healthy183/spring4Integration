package com.kang.spring.integration.service;

import com.kang.spring.integration.domain.Person;
import org.springframework.integration.annotation.Payload;

import java.util.List;

/**
 * Created by Administrator on 2016/4/17.
 */
public interface PersonService {

    Person createPerson(Person person);

    @Payload("new java.util.Date()")
    List<Person> findPeople();
}
