package com.example.JpaRelation.Controller;

import com.example.JpaRelation.Model.Employee;
import com.example.JpaRelation.Repos.EmployeeRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeRepos employeeRepos;

    @PostMapping(value = "/saveemp")
    public String saveEmp(@RequestBody Employee employee){
        employeeRepos.save(employee);
        return "Employee saved";
    }

    @PutMapping(value = "/updateemp/{id}/{city}")
    public String updateEmp(@PathVariable Integer id,@PathVariable String city) {
        Employee e = employeeRepos.findById(id);

      if (e == null) {
            return "Please enter valid Employee id";
        } else {
            e.setCity(city);
            employeeRepos.save(e);
            return "data updated";
       }

    }
       @GetMapping(value = "/deleteemp/{id}")
        public String deleteEmp(@PathVariable Integer id) {
            Employee employee=employeeRepos.findById(id);
            employeeRepos.delete(employee);
            return "Data deleted";
        }


}
