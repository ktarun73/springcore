package com.springcore.lifecycle;


//Implementation of life cycle methods using Annotations@


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Mouse {

    private String name;

    public String getName() {
        System.out.println("Mouse getter");
        return name;
    }

    public void setName(String name) {
        System.out.println("Mouse setter");
        this.name = name;
    }

    public Mouse() {
        super();
    }

    //TODO: annotation method not working
    @PostConstruct
    public void init(){
        System.out.println("Mouse init method");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Mouse destroy method");
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "name='" + name + '\'' +
                '}';
    }
}
