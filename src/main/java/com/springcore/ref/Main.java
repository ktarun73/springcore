package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("referenceconfig.xml");
        A a1=(A) context.getBean("aref1");
        System.out.println(a1);

        A a2=(A) context.getBean("aref2");
        System.out.println(a2);

        A a3=(A) context.getBean("aref3");
        System.out.println(a3);
    }
}
