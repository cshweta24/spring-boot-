package com.example.SwaggerExample.Repository;

import com.example.SwaggerExample.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepo extends JpaRepository<Student,Integer> {
   // Student findById(Integer id);

    List<Student> findByName(String name);
}
