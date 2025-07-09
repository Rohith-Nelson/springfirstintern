package com.example.Springboot.controller;
import java.util.List;

import com.example.Springboot.service.Employeeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.Springboot .model.*;

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

    @GetMapping("/job/{job}")
    public List<Employee> getEmployeeByJob(@PathVariable String job) {
        return service.getEmployeebyJob(job);
    }

    @GetMapping("/name/{name}")
    public List<Employee> getEmployeeByName(@PathVariable String name) {
        return service.getEmployeebyName(name);
    }

    @PostMapping
    public String postMethod(@RequestBody Employee employee) {
        return service.postEmployee(employee);
    }


    @PutMapping("/{id}")
    public String putMethod(@PathVariable int id,@RequestBody Employee employee) {
        return service.updateEmployee(id,employee);
    }


    @DeleteMapping("/{empId}")
    public String deleteEmpbyId(@PathVariable int empId) {
        return service.deleteEmployeeById(empId);
    }
}
