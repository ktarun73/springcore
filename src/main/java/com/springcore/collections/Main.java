package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("colleactionconfig.xml");

        Emp emp1= (Emp) context.getBean("emp");
        System.out.println(emp1);
    }
}
