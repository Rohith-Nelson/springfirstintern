package com.example.springboot_demo.controller;

import java.util.List;

import com.example.springboot_demo.service.Employeeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.springboot_demo.model.*;

@RequestMapping("/employee")
@RestController
public class Employeecontroller {
    @Autowired
    Employeeservice service;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return service.getEmployees();
    }


    @GetMapping("/{empId}")
    public Employee getEmployeeById(@PathVariable int empId) {
        return service.getEmployeeById(empId);
    }


    @PostMapping
    public String postMethod(@RequestBody Employee employee) {
        return service.postEmployee(employee);
    }


    @PutMapping()
    public String putMethod(@RequestBody Employee employee) {
        return service.updateEmployee(employee);
    }


    @DeleteMapping("/{empId}")
    public String deleteEmpbyId(@PathVariable int empId) {
        return service.deleteEmployeeById(empId);
    }
}
