package com.example.MongodbManytomany.Controller;

import com.example.MongodbManytomany.Model.Book;
import com.example.MongodbManytomany.Repos.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    private BookRepo bookRepo;


    @PostMapping(value = "/addBook")
    public String addBook(@RequestBody Book book){
        bookRepo.save(book);
        return "Book saved";

    }
}
