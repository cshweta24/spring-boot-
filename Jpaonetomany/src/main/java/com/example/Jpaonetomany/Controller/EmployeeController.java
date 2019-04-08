package com.example.Jpaonetomany.Controller;

import com.example.Jpaonetomany.Model.Employee;
import com.example.Jpaonetomany.Repos.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeRepo employeeRepo;



    @PostMapping(value = "/saveemp")
    public String saveEmp(@RequestBody Employee employee){
        employeeRepo.save(employee);
        return "employee saved";
    }

    @PutMapping(value = "/updateemp/{id}/{city}")
    public String update(@PathVariable Integer id,@PathVariable String city){
        Employee e=employeeRepo.findById(id);
        if(e==null){
            return "Please enter valid employee id";
        }
        else {
            e.setCity(city);
            employeeRepo.save(e);
            return "Data saved";
        }
    }

    @GetMapping(value = "/deleteemp/{id}")
    public String deleteEmp(@PathVariable Integer id){
       Employee e= employeeRepo.findById(id);
       employeeRepo.delete(e);
        return "Employee Deleted";
    }
}
