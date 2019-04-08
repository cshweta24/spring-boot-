package com.example.JpaRelation.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Data

@Getter
@Setter
public class Employee {

    @Id
    private Integer id;
    private String name;
    private String city;

    @ManyToOne
    @JoinColumn(name="deptid")
    private Department department;
}
