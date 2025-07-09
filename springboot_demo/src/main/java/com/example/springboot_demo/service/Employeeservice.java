package com.example.springboot_demo.service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.example.springboot_demo.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class Employeeservice {
    List<Employee> employees = new ArrayList<>(
            Arrays.asList(
                    new Employee(1, "Prashanth", "Trainer"),
                    new Employee(2, "Yuvraj", "Faculty")
            )
    );

    public List<Employee> getEmployees() {
        return employees;
    }

    public String postEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee id: ");
        int id = sc.nextInt();
        System.out.println("Enter employee name: ");
        String name = sc.next();
        System.out.println("Enter employee job title: ");
        String jobTitle = sc.next();
        employees.add(new Employee(id, name, jobTitle));
        return "Employee added successfully";
    }

    public String putMethod() {
        return "PUT method called";
    }

    public String deleteMethod() {
        return "DELETE method called";
    }

}