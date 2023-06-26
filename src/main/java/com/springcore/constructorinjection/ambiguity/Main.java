package com.springcore.constructorinjection.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("constructorambiguity.xml");
        Addition add= (Addition) context.getBean("addition");
        add.doSum();
    }
}
