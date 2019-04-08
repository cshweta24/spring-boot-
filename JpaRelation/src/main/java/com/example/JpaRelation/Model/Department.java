package com.example.JpaRelation.Model;

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
@Setter
@Getter
public class Department {
 @Id
    private Integer deptid;
    private String name;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Employee> employeeSet;
}
