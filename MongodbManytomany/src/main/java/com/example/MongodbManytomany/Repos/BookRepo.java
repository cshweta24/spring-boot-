package com.example.MongodbManytomany.Repos;

import com.example.MongodbManytomany.Model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepo extends MongoRepository<Book,String> {
}
