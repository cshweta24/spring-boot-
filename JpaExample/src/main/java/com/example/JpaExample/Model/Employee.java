package com.example.JpaExample.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.crypto.Data;
//import java.util.Date;
import java.sql.Date;
@Entity
public class Employee {

    @Id
    private Integer id;
    private String name;
    private String lastname;
    private String city;
    private Date date;
     private Integer age;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
