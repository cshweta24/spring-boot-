package com.example.Jpaonetomany.Repos;

import com.example.Jpaonetomany.Model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department,Integer> {
}
