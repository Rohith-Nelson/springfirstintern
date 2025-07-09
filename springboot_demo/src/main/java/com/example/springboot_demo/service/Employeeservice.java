package com.example.springboot_demo.service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.example.springboot_demo.model.Employee;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class Employeeservice {
    List<Employee> employees = new ArrayList<>(
            Arrays.asList(
                    new Employee(1,"Prashanth","Trainer"),
                    new Employee(2,"Yuvraj","Faculty")
            )
    );

    public List<Employee> getEmployees() {
        return employees;
    }

    public String postEmployee(Employee employee) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter employee id: ");
//        int id = sc.nextInt();
//        System.out.println("Enter employee name: ");
//        String name = sc.next();
//        System.out.println("Enter employee job title: ");
//        String jobTitle = sc.next();
//        employees.add(new Employee(id, name, jobTitle));
        employees.add(employee);
        return "Employee added successfully";
    }

    public Employee getEmployeeById(@PathVariable int id) {
        for(Employee employee : employees) {
            if(employee.getEmpid() == id) {
                return employee;
            }
        }
        return null;
    }

    public String updateEmployee(Employee employee) {
        for(Employee emp:employees){
            if(emp.getEmpid()==employee.getEmpid()){
                employees.remove(emp);
                employees.add(employee);
                return "Employee updated successfully";
            }
        }
        return "Employee not found";
    }

    public String deleteEmployeeById(int id) {
        for(Employee employee : employees) {
            if(employee.getEmpid() == id) {
                employees.remove(employee);
                return "Employee deleted successfully";
            }
        }
        return "Employee not found";
    }
}