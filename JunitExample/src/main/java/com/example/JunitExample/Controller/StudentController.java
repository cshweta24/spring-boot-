package com.example.JunitExample.Controller;

import com.example.JunitExample.Model.Student;
import com.example.JunitExample.Repos.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentRepo studentRepo;

    @PostMapping(value = "/saveStudent")
    public String saveStudent(@RequestBody Student student){
        studentRepo.save(student);
        return "Student saved";

    }

}
