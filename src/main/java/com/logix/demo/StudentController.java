package com.logix.demo;


import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class StudentController {


    @Autowired
    private StudentRepository studentRepository;


    @PostMapping("/viewall")
    @Transactional
    public ResponseEntity<List<Studentmodel>> viewAllStudents() {
        List<Studentmodel> students = studentRepository.viewAll();
        return ResponseEntity.ok(students);
    }


    @PostMapping("/students")
    @Transactional
    public ResponseEntity<Studentmodel> createStudent(@RequestBody Studentmodel student) {
        Studentmodel savedStudent = studentRepository.save(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedStudent);
    }


    @PostMapping("/login")
    @Transactional
    public ResponseEntity<Map<String, String>> logInStudent(@RequestBody Studentmodel student) {
        Studentmodel savedStudent = studentRepository.login(student.getUsername(),student.getPassword());
        Map<String, String> response = new HashMap<>();

        if (savedStudent != null) {
            response.put("status", "Login successful");
            return ResponseEntity.ok(response);
        } else {
            response.put("status", "Login Failed");
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(response);
        }

    }



}
