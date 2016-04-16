package com.kang.spring.integration.service;

import com.kang.spring.integration.domain.Person;

import java.util.List;

/**
 * Created by Administrator on 2016/4/16.
 */
public interface PersonService {

    Person createPerson(Person person);

    List<Person> findPersonByName(String name);
}
