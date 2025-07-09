package com.example.springboot_demo.controller;

import java.util.List;

import com.example.springboot_demo.service.Employeeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.springboot_demo.model.*;

@RestController
public class Employeecontroller {
    @Autowired
    Employeeservice service;
    @GetMapping("/")
    public List<Employee> getAllEmployees() {
        return service.getEmployees();
    }


    @PostMapping("/")
    public String postMethod() {
        return service.postEmployee();
    }


    @PutMapping("/")
    public String putMethod() {
        return service.putMethod();
    }


    @DeleteMapping("/")
    public String deleteMethod() {
        return service.deleteMethod();
    }

}
