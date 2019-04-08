package com.example.Jpamanytomany.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@Data
public class Publisher {

    @Id
    private Integer pid;
    private String pname;

    @ManyToMany(mappedBy = "publisher",fetch = FetchType.LAZY)

    private Set<Book> bookSet;



}
