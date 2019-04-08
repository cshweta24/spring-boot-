package com.example.JpaExample.Repos;

import com.example.JpaExample.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
    Employee findById(Integer id);
List <Employee> findByName(String name);

    List<Employee> findByAgeLessThan(Integer age);

    List<Employee> findByAgeIsNull(Integer age);


    //List<Employee> findByLastnameAndFirstname(String lastname, String name);
}
