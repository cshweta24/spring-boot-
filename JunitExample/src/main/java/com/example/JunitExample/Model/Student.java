package com.example.JunitExample.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

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
