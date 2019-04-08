package com.example.Jpamanytomany.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.Set;


@Entity
@Setter
@Getter

@Data
public class Book {

    @Id
    private Integer id;
    private String name;

    @ManyToMany(cascade={CascadeType.PERSIST,CascadeType.MERGE},fetch = FetchType.LAZY)

    @JoinTable(name = "book_publisher", joinColumns = @JoinColumn(name = "book_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "publisher_id", referencedColumnName = "pid"))
    private Set<Publisher> publisher;

}
