package com.springorm.dao;

import com.springorm.entities.Car;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class StudentDao {
    HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Transactional
    public int insert(Car car){
        int res=(Integer)this.hibernateTemplate.save(car);
        return res;
    }

    @Transactional
    public void update(Car car){
        this.hibernateTemplate.update(car);
    }

    @Transactional
    public void delete(Car car){
        this.hibernateTemplate.delete(car);
    }

    public Car getCar(int id){
        Car car=this.hibernateTemplate.get(Car.class,id);
        return car;
    }

    public List<Car> getCars(){
        return this.hibernateTemplate.loadAll(Car.class);
    }

}
