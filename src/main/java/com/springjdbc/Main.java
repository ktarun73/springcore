package com.springjdbc;

import com.springjdbc.dao.StudentDao;
import com.springjdbc.entites.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("springjdbc/config.xml");
        StudentDao studentDao=context.getBean("studentDao", StudentDao.class);
//         insert
//        Student student=new Student();
//        student.setId(225);
//        student.setName("Vishal");
//        student.setCity("Nahan");
//
//        int res=studentDao.insert(student);
//        System.out.println(res);

//        update
//        Student student=new Student();
//        student.setId(224);
//        student.setName("Manish");
//        student.setCity("Chandigarh");
//        int res=studentDao.update(student);
//        System.out.println(res);

//        //delete
//        int res= studentDao.delete(224);
//        System.out.println(res);


//        Student student=studentDao.getStudent(223);
//        System.out.println(student);

        List<Student> studentList=studentDao.getStudents();
        for (Student student:studentList){
            System.out.println(student);
        }

    }
}
