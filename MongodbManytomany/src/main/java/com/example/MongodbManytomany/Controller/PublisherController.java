package com.example.MongodbManytomany.Controller;

import com.example.MongodbManytomany.Model.Publisher;
import com.example.MongodbManytomany.Repos.PublisherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublisherController {

    @Autowired
    private PublisherRepo publisherRepo;

    @PostMapping(value = "/addPublisher")
    public String addPublisher(@RequestBody Publisher publisher){
        publisherRepo.save(publisher);
        return "Publisher saved";
    }
}
