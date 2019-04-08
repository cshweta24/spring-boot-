package com.example.AopExample.Controller;

import com.example.AopExample.Implemantation.Demoimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Cont {

    @Autowired
    private Demoimp demoimp;

    @GetMapping(value = "/data")
    public String data(){
        demoimp.check();
        return "in implementation";



    }
}
