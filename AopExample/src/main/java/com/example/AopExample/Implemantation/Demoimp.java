package com.example.AopExample.Implemantation;

import com.example.AopExample.Repos.demo;
import org.springframework.stereotype.Service;

@Service
public class Demoimp implements demo {
    @Override
    public void check() {
System.out.println("Hello");
    }
}
