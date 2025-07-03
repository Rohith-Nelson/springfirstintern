package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("resources.xml");
        Student s1 = (Student) context.getBean("std");
        s1.StudentDetails("Guruvel","guruvel@gmail.com");

        Course C = (Course) context.getBean("course");
        C.CourseDetails();
        C.CourseDuration();

        EnrolledCourse e1 = (EnrolledCourse) context.getBean("enroll");
        e1.EnrolledCourses("Guruvel","guruvel@gmail.com","SpringBoot");



    }
}
