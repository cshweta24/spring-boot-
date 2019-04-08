package com.example.JunitExample.Repos;

import com.example.JunitExample.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {
}
