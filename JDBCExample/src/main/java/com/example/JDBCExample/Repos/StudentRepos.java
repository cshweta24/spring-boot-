package com.example.JDBCExample.Repos;

import com.example.JDBCExample.Model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface StudentRepos {

    List<Student> getStudentList();

    Student getStudent(Integer id);

    String saveData(Student stu);

    String updateStudent(Integer id,String name);

    String deleteStudent(Integer id);
}
