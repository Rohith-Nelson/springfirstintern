package com.example.Springboot.repository;

import com.example.Springboot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Employeerepo extends JpaRepository<Employee,Integer> {
    List<Employee> findByName(String Name);
    List<Employee> findByJob(String Job);
    Employee findReferenceByEmpid(int Empid);
}
