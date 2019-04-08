package com.example.JpaRelation.Controller;

import com.example.JpaRelation.Model.Department;
import com.example.JpaRelation.Model.Employee;
import com.example.JpaRelation.Repos.DepartmentRepo;
import com.example.JpaRelation.Repos.EmployeeRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentRepo departmentRepo;

    @PostMapping(value = "/savedept")
    public String saveDept(@RequestBody Department department){
        departmentRepo.save(department);
        return "Deptartment saved";
    }

}
