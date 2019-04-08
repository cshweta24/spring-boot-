package com.example.Jpaonetomany.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@Data
@Getter
@Setter
public class Department {
@Id
private Integer did;
private String dname;


    @OneToMany(cascade = CascadeType.ALL)
    private Set<Employee> employeeSet;
}
