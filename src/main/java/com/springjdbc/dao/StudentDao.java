package com.springjdbc.dao;

import com.springjdbc.entites.Student;

import java.util.List;

public interface StudentDao {
    public int insert(Student student);
    public int update(Student student);
    public int delete(int studentId);
    public Student getStudent(int id);
    public List<Student> getStudents();
}
