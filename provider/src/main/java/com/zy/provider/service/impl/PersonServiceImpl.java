package com.zy.provider.service.impl;

import com.zy.provider.entity.Person;
import com.zy.provider.service.PersonService;

/**
 * @author zhangy
 * @version Revision 2.0.0
 * @email: zhangy2222z@sina.cn
 * @create 2019-05-08 10:26
 **/
//@Component
//@Service(version = "1.0.0", interfaceClass = PersonService.class)
public class PersonServiceImpl implements PersonService{
    @Override
    public Person getPerson() {
        Person person = new Person();
        person.setName("121212");
        person.setAge(32);
        return person;
    }
}
