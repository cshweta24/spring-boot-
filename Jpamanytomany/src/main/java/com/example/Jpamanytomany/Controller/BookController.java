package com.example.Jpamanytomany.Controller;

import com.example.Jpamanytomany.Model.Book;
import com.example.Jpamanytomany.Repos.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {

    @Autowired
    private BookRepo bookRepo;

    @PostMapping(value = "/savebook")
    public String saveBook(@RequestBody Book book){
        bookRepo.save(book);
        return "Book saved";
    }

@PutMapping(value = "/updatebook/{id}/{name}")
public String updateBook(@PathVariable Integer id,@PathVariable String name){
       Book b=bookRepo.findById(id);
       if(b==null)
       {
           return "Enter valid id";
       }
       else
       {
           b.setName(name);
           bookRepo.save(b);
           return "updated";
       }

}

    @GetMapping(value = "/delete/{id}")
    public String deleteBook(@PathVariable Integer id){

        bookRepo.delete(id);
        return " Deleted";
    }

}
