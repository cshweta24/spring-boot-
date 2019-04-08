package com.example.MongodbManytomany.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.List;



@Setter
@Getter

public class Publisher {

    @Id
    private String id;
    private String name;

    @DBRef(lazy=true)
    private List<Book> book;
}
