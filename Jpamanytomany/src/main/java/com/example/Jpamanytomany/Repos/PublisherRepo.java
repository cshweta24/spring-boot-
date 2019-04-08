package com.example.Jpamanytomany.Repos;

import com.example.Jpamanytomany.Model.Book;
import com.example.Jpamanytomany.Model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepo extends JpaRepository<Publisher,Integer> {
   // Publisher findById(Integer pid);
}
