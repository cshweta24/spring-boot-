package com.example.Jpamanytomany.Controller;

import com.example.Jpamanytomany.Model.Book;
import com.example.Jpamanytomany.Model.Publisher;
import com.example.Jpamanytomany.Repos.PublisherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PublisherController {

    @Autowired
    private PublisherRepo publisherRepo;

    @PostMapping(value = "/savepublisher")
    public String savePublisher(@RequestBody Publisher publisher){
        publisherRepo.save(publisher);
        return "publisher saved";
    }

    @GetMapping(value = "/deletep/{pid}")
    public String deleteP(@PathVariable Integer pid){

        publisherRepo.delete(pid);
        return " Deleted";
    }




}
