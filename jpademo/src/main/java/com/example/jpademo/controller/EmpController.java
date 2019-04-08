package com.example.jpademo.controller;


import com.example.jpademo.domain.Emp;
import com.example.jpademo.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class EmpController
{


    @Autowired
    private EmpRepo empRepo;


    @PostMapping(value = "/insertData")
    public String insertData(@RequestBody Emp emp)
    {
      empRepo.save(emp);
      return "data saved";
    }



    @GetMapping(value = "/updateData")
    public String updateData(@RequestParam Integer id, @RequestParam String name, @RequestParam String city)
    {
     Emp emp=empRepo.findById(id);
     emp.setName(name);
     emp.setCity(city);
     empRepo.save(emp);
     return "updated";

    }





    @GetMapping(value = "/deleteData")
    public String deleteData(@RequestParam Integer id)
    {
        Emp emp=empRepo.findOne(id);
        empRepo.delete(emp);
        return "deleted";


    }
}
