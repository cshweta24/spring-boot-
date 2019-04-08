package com.example.JpaRelation.Repos;

import com.example.JpaRelation.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepos extends JpaRepository<Employee,Integer> {
    Employee findById(Integer id);
}
