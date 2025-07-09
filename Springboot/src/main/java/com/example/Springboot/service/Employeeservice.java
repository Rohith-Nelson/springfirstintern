package com.example.Springboot.service;

import java.util.List;

import com.example.Springboot.model.Employee;
import com.example.Springboot.repository.Employeerepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;  
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class Employeeservice {
//    List<Employee> employees = new ArrayList<>(
//            Arrays.asList(
//                    new Employee(1,"Prashanth","Trainer"),
//                    new Employee(2,"Yuvraj","Faculty")
//            )
//    );

    @Autowired
    Employeerepo repo;

    public List<Employee> getEmployees() {
        return repo.findAll();
    }

    public Employee getEmployeeById(@PathVariable int id) {
        return repo.findById(id).orElse(null);
    }

    public List<Employee> getEmployeebyName(String name) {
        return repo.findByName(name);
    }

    public List<Employee> getEmployeebyJob(String job) {
        return repo.findByJob(job);
    }

    public String postEmployee(Employee employee) {
        repo.save(employee);
        return "Employee added successfully";
    }

    public String updateEmployee(int id,Employee employee) {
        repo.save(employee);
        return "Employee updated successfully";
    }

    public String deleteEmployeeById(int id) {
        repo.deleteById(id);
        return "Employee deleted successfully";
    }
}