package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.javaconfig")
public class Javaconfig {

    @Bean
    public Samosa getSamosa(){
        return new Samosa();
    }

    // @Beam method
    @Bean("student")
    public Student getStudent(){
        return new Student(getSamosa());
    }
}
