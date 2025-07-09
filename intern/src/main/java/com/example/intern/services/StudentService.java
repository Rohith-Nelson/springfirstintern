package com.example.intern.services;

import com.example.intern.models.Student;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    List<Student> stud=new ArrayList<>(
            Arrays.asList(new Student(1,"Nidhish","nid@gmail.com","xxyyyxyxyx"),
                    new Student(2,"padma","cxx@gmail.com","cdsaddvfse")

            )
    );

    public List<Student> getStudents(){
        return stud;
    }

    public Student getStudentbyId(int id){
        for(Student s :stud){
            if(s.getStudent_id()==id){
                return s;
            }
        }
        return null;
    }

    public String postStudent(Student student){
//       System.out.println("Enter student id:");
//       Scanner sc=new Scanner(System.in);
//       int id=sc.nextInt();
//       System.out.println("Enter student name:");
//       String name=sc.next();
//       System.out.println("Enter student email:");
//       String email=sc.next();
//       System.out.println("Ener student phone number:");
//       String phone=sc.next();
//       Student st=new Student(id,name,email,phone);
          stud.add(student);
       return "Student added successfully";
    }

    public String updateStudent(@RequestBody Student student){
        for(Student s :stud){
            if(s.getStudent_id()==student.getStudent_id()){
                stud.remove(s);
                stud.add(student);
                return "Student updated successfully";
            }
        }
        return "Student not found";
    }

    public String deleteStudent(int id){
        for(Student s :stud){
            if(s.getStudent_id()==id){
                stud.remove(s);
                return "Student deleted successfully";
            }
        }
        return "Student not found";
    }
}
