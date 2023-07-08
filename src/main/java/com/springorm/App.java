package com.springorm;

import com.springorm.dao.StudentDao;
import com.springorm.entities.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("springorm/config.xml");
        StudentDao dao=context.getBean("studentDao", StudentDao.class);
//        Car car=new Car();
//        car.setId(10213);
//        car.setModel("Suzuki Swift");
//        System.out.println(dao.insert(car));
//        dao.update(car);
//        dao.delete(car);
//        System.out.println(dao.getCar(10213));
        System.out.println(dao.getCars());
    }

}
