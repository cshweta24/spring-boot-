package com.example.MongodbExample.Repos;

import com.example.MongodbExample.Model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface EmployeeRepo extends MongoRepository<Employee,String> {
//@Query("{$text:{$search:?,$city:?},$text:{$search:?,$name:?}}).pretty()")
    List<Employee> findByCityOrNameRegex(String city, String name);
}
