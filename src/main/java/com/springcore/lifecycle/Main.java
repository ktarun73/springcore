package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("springcore/lifecycleconfig.xml");
        System.out.println("++++++++++++++++++++++++++++++++++++");


        //XML
        Dog dog=(Dog) context.getBean("dog");
        System.out.println(dog);
        System.out.println("++++++++++++++++++++++++++++++++++");


        //Interfaces
        Cat cat=(Cat) context.getBean("cat");
        System.out.println(cat);
        System.out.println("++++++++++++++++++++++++++++++++++");
//        Annotations
//        TODO: annotation method not working
        Mouse mouse=(Mouse) context.getBean("mouse");
        System.out.println(mouse);

        System.out.println("++++++++++++++++++++++++++++++++++");
        // registering shutdown hook to call destroy method
        context.registerShutdownHook();
    }
}
