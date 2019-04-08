package com.example.JpaExample.Controller;


import com.example.JpaExample.Model.Employee;
import com.example.JpaExample.Repos.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepo employeeRepo;

    @PostMapping(value = "/saveemp")
    public String saveData(@RequestBody Employee emp) {
        employeeRepo.save(emp);
        return "data saved";
    }

    //update data
    @PutMapping(value = "/updateemp/{id}/{city}")
    public String updateEmp(@PathVariable Integer id, @PathVariable String city) {
        Employee e = employeeRepo.findById(id);
        e.setCity(city);
        employeeRepo.save(e);
        return "data updated";

    }

    //delete
    @GetMapping(value = "/deleteemp/{id}")
    public String deleteEmp(@PathVariable Integer id) {
    Employee e=employeeRepo.findById(id);
    employeeRepo.delete(e);
    return "Data deleted";
    }
//update multiple column
@PutMapping(value = "/updatememp/{id}/{city}/{name}")
public String updatemEmp(@PathVariable Integer id, @PathVariable String city,@PathVariable String name) {
    Employee e = employeeRepo.findById(id);
    e.setCity(city);
    e.setName(name);
    employeeRepo.save(e);
    return "data updated";

}

//findbyname
@GetMapping(value="findbyname/{name}")
    List<Employee>findByName(@PathVariable String name) {
    List<Employee> employees=employeeRepo.findByName(name);
    return employees;
     }

//findbyfirstnameandlastname
//    @GetMapping(value="/findByLastnameAndFirstname/{lastname}/{name}")
//    List<Employee>findByLastnameAndFirstname(@PathVariable String lastname,@PathVariable String name)
//    {
//        List<Employee> e=employeeRepo.findByLastnameAndFirstname(lastname,name);
//        return e;
//    }


    //findbyagelessthan

    @GetMapping(value="findByAgeIsNull/{age}")
    List<Employee>findByAgeIsNull	(@RequestParam Integer age) {
        List<Employee> employees=employeeRepo.findByAgeIsNull(age);
        return employees;
    }

}
