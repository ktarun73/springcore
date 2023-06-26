package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


//Implementation of life cycle methods using Interfaces
public class Cat implements InitializingBean, DisposableBean {
    private String name;

    public String getName() {
        System.out.println("Cat getter");
        return name;
    }

    public void setName(String name) {
        System.out.println("Cat setter");
        this.name = name;
    }

    public Cat(){
        super();
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name=" + name +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Cat Init method");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Cat Destroy method");
    }
}
