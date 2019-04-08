package com.example.JDBCExample.Dao;

import com.example.JDBCExample.Model.Department;
import com.example.JDBCExample.Model.Student;
import com.example.JDBCExample.Repos.StudentRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Types;
import java.util.List;

@Repository
public class StudentDao implements StudentRepos {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Student> getStudentList() {

        String sql="select * from student";
        List<Student> list=jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Student.class));
        return list;
    }

    @Override
    public Student getStudent(Integer id) {
        String sql="select * from student where id=?";
        Student stu=jdbcTemplate.
                queryForObject(sql,new Object[]{id},new BeanPropertyRowMapper<>(Student.class));
        return stu;
    }
    @Override
    public String saveData(Student stu) {

        String sql="insert into student values(?,?,?)";
        jdbcTemplate.update(sql,new Object[]{stu.getId(),stu.getName(),stu.getCity()});
        return "Data inserted";
    }

    @Override
    public String updateStudent(Integer id, String name) {

        String sql="update student set name=? where id=?";
        jdbcTemplate.update(sql,new Object[]{name,id},new int[]{Types.VARCHAR,Types.INTEGER});

        return "Data updated";
    }

    @Override
    public String deleteStudent(Integer id) {

        String sql="delete from student where id=?";
        jdbcTemplate.update(sql,new Object[]{id},new int[]{Types.INTEGER});

        return "Data deleted";
    }




}
