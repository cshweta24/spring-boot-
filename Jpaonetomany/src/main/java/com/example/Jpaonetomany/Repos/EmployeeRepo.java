package com.example.Jpaonetomany.Repos;

import com.example.Jpaonetomany.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
    Employee findById(Integer id);
}
