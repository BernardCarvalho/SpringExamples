package com.example.security.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.security.model.Student;

@RestController
public class StudentController {

    List<Student> students = new ArrayList<>();

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/students")
    public List<Student> students(){
        
        Student student1 = new Student();
        student1.setId(1);
        student1.setFirstName("Ramesh");
        student1.setLastName("Fatadare");

        Student student2 = new Student();
        student2.setId(2);
        student2.setFirstName("Ram");
        student2.setLastName("Jadhav");

        students.add(student1);
        students.add(student2);

        return students;
    }

    @PostMapping("/students")
    public Student createStudent(@RequestBody Student student){
        students.add(student);
        return student;
    }
}
