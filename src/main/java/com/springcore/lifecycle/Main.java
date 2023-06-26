package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("lifecycleconfig.xml");
        System.out.println("++++++++++++++++++++++++++++++++++++");
        Dog dog=(Dog) context.getBean("dog");
        System.out.println(dog);
        // registering shutdown hook to call destroy method
        System.out.println("++++++++++++++++++++++++++++++++++");
        Cat cat=(Cat) context.getBean("cat");
        System.out.println(cat);
        System.out.println("++++++++++++++++++++++++++++++++++");
        context.registerShutdownHook();
    }
}
