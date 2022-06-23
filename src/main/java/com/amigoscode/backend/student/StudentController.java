package com.amigoscode.backend.student;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

    @GetMapping
    public List<Student> getAllStudents() {
         return Arrays.asList(
                new Student(1L, "Stefan", "ts@onet.pl", Gender.MALE),
                new Student(2L, "Frania", "frania20@gmail.pl", Gender.FEMALE),
                new Student(3L, "Jacek", "jacula@gmail.com", Gender.MALE)
        );
    }
}
