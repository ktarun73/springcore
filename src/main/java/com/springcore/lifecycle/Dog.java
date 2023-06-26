package com.springcore.lifecycle;

public class Dog {
    private String name;

    public String getName() {
        System.out.println(" Dog getter");
        return name;
    }

    public void setName(String name) {
        System.out.println("Dog setter");
        this.name = name;
    }

    public Dog() {
        super();
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }


    //Implementation of life cycle methods using XML
    public void init(){
        System.out.println("Dog init method");
    }

    public void destroy(){
        System.out.println("Dog destroy method");
    }
}
