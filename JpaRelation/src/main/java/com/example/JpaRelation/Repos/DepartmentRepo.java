package com.example.JpaRelation.Repos;

import com.example.JpaRelation.Model.Department;
import com.example.JpaRelation.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department,Integer> {
    Employee findById(Integer id);
}
