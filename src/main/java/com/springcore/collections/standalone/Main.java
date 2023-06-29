package com.springcore.collections.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("springcore/standalonecolleactionconfig.xml");
        Person person=context.getBean("person1", Person.class);
        System.out.println(person);

    }
}
