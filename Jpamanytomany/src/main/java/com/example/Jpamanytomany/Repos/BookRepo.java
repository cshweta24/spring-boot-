package com.example.Jpamanytomany.Repos;

import com.example.Jpamanytomany.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book,Integer> {
    Book findById(Integer id);
}
