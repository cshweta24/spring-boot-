package com.example.MongodbExample.Model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.TextIndexed;

@Getter
@Setter
public class Employee {
    @Id
    private String id;
    @TextIndexed
    private String name;
    @TextIndexed
    private String city;
    private String propertyFor;
    private String price;
}
