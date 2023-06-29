package com.springjdbc.dao;

import com.springjdbc.entites.Student;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class StudentDaoImpl implements StudentDao {


    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insert(Student student) {
        String query="insert into student(id,name,city) values(?,?,?)";
        int res = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
        return res;
    }

    @Override
    public int update(Student student) {
        String query="update student set name=? , city=? where id=?";
        int res=this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
        return res;
    }

    @Override
    public int delete(int studentId) {
        String query="delete from student where id=?";
        int res=this.jdbcTemplate.update(query,studentId);
        return res;
    }

    @Override
    public Student getStudent(int studentId) {
        String query="Select * from student where id=?";
        RowMapperImpl rowMapper=new RowMapperImpl();
        Student student=this.jdbcTemplate.queryForObject(query,rowMapper,studentId);
        return student;
    }

    public List<Student> getStudents(){
        String query="select * from student";
        RowMapperImpl rowMapper=new RowMapperImpl();
        List<Student> students=this.jdbcTemplate.query(query,rowMapper);
        return students;
    }
}
