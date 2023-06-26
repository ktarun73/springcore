package com.springcore.constructorinjection;

import java.util.List;

public class Person {
    private String name;
    private int personId;
    private Certificate certificate;
    private List<String> phoneNumbers;
    public Person(String name, int personId,Certificate certificate,List<String> phoneNumbers) {
        this.name = name;
        this.personId = personId;
        this.certificate=certificate;
        this.phoneNumbers=phoneNumbers;
    }

    public Person() {
        super();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personId=" + personId +
                ", certificate=" + certificate +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }
}
