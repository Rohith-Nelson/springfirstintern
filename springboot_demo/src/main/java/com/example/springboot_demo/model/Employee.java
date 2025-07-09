package com.example.springboot_demo.model;

public class Employee {
    private int empid;
    private String name;
    private String job;

    // Parameterized constructor
    public Employee(int empid, String name, String job) {
        this.empid = empid;
        this.name = name;
        this.job = job;
    }

    // Getters
    public int getEmpid() {
        return empid;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

}