package com.example.intern.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private int Student_id;
    private String Student_Name;
    private String Student_Email;
    private String Student_Phone;

    public Student(int Student_id, String Student_Name, String Student_Email, String Student_Phone) {
        this.Student_id = Student_id;
        this.Student_Name = Student_Name;
        this.Student_Email = Student_Email;
        this.Student_Phone = Student_Phone;
    }

    public String getStudent_Name() {
        return Student_Name;
    }

    public String getStudent_Email() {
        return Student_Email;
    }

    public String getStudent_Phone() {
        return Student_Phone;
    }

    public int getStudent_id() {
        return Student_id;
    }
}

