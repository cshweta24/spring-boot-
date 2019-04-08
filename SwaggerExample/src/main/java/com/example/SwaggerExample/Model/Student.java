package com.example.SwaggerExample.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@Setter
@Getter
public class Student {
    @Id
    private Integer id;
    private String name;


}
