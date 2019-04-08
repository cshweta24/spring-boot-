package com.example.Jpaonetomany.Controller;

import com.example.Jpaonetomany.Model.Department;
import com.example.Jpaonetomany.Repos.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentRepo departmentRepo;

    @PostMapping(value = "/savedept")
    public String saveDept(@RequestBody Department department){
        departmentRepo.save(department);
        return "Dept Saved";
    }



}
