package com.frank.service;

import com.frank.entity.Person;
import org.springframework.stereotype.Service;

/**
 * Created by liyan on 2016/2/23.
 */
@Service
public class MvcService {
    public Person show(){
        Person person = new Person();
        person.setName("张三");
        person.setAge(13);
        System.out.print("service run");
        return person;
    }
}
