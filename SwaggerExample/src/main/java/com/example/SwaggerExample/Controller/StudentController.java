package com.example.SwaggerExample.Controller;

import com.example.SwaggerExample.Model.Student;
import com.example.SwaggerExample.Repository.StudentRepo;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class StudentController {

    @Autowired
    private StudentRepo studentRepo;



    @PostMapping(value = "/sendStudent")
    public String sendStudent(@RequestBody Student student){
        studentRepo.save(student);
        return "Student Saved";
    }

    @GetMapping(value = "/getStudent/{name}")

        List<Student> findByName(@PathVariable String name) {
            List<Student> students= studentRepo.findByName(name);
            return students;
    }

    @PutMapping(value = "/deleteStudent/{id}")
    public String deleteStudent(@PathVariable Integer id){
        studentRepo.delete(id);
        return "Student Deleted";
    }
}
