package com.example.MongodbManytomany.Repos;

import com.example.MongodbManytomany.Model.Publisher;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PublisherRepo extends MongoRepository<Publisher,String> {
}
