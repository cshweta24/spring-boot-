package com.example.MongodbExample.Controller;

import com.example.MongodbExample.Model.Employee;
import com.example.MongodbExample.Repos.EmployeeRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api")
public class EmployeeController {
    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private MongoTemplate mongoTemplate;

    @PostMapping(value = "/saveemp")
    public String saveEmployee(@RequestBody Employee employee) {
        employeeRepo.save(employee);
        return "Employee saved";
    }


    @PutMapping(value = "/update/{id}/{name}")
    public String updateEmp(@PathVariable String id, @PathVariable String name){
        Query query=new Query(Criteria.where("id").is(id));
        Update update=new Update();
        update.set("name",name);
        mongoTemplate.updateFirst(query,update,Employee.class);
        return "Update";
    }

    @GetMapping(value = "/delete/{id}")
    public String deleteEmp(@PathVariable String id){
        mongoTemplate.remove(new Query(Criteria.where("id").is(id)),Employee.class);
        return "delete";
    }

    @GetMapping(value = "/searchByProperty/{propertyFor}")
    public List<Employee> searchByProperty(@PathVariable String propertyFor){
    Query query = new Query();
query.addCriteria(Criteria.where("propertyFor").is(propertyFor));
    List<Employee> users = mongoTemplate.find(query, Employee.class);

    return users;
    }

    @GetMapping(value = "/sortByPrice")
    public List<Employee> sortByPrice(@RequestBody Employee employee){
        Query query = new Query();
        query.with(new Sort(Sort.Direction.ASC, "price"));
        List<Employee> employees = mongoTemplate.find(query, Employee.class);

        return employees;
    }

    @GetMapping(value = "/search1")
    public List<Employee> search1(@RequestParam(value="city",required = false) String city, @RequestParam(value="name",required = false) String name) {
       // ResponseEntity entity=null;

     //  TextCriteria criteria = TextCriteria.forDefaultLanguage()
             //   .matchingAny("city", "name");
        Query query=new Query();
        query.addCriteria(Criteria.where("city").is(city));
       query.addCriteria(Criteria.where("name").is(name));


//        Criteria criteria = new Criteria();
//        Criteria.where("city").is(city);
//        Criteria.where("name").is(name);
//        Query query = Query.query(criteria);
        return mongoTemplate.find(query, Employee.class);
        //return recipes;
    }


    @PutMapping(value = "/update/{id}")
    public Optional<Employee> updatePost(@PathVariable String id, @RequestBody Employee employee){
        Query query=new Query(Criteria.where("id").is(id));
        Update update=new Update();
        ResponseEntity<Map<String,Object>> entity=null;
        //Employee employee=new Employee();
        update.set("name",employee.getName());
        mongoTemplate.updateMulti(query,update,Employee.class);
        new ResponseEntity(employee, HttpStatus.OK);
        return employeeRepo.findById(id);

    }

}
