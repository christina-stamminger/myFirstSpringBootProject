package com.example.myFirstSpringProject.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Mariam",
                        "Mariam@gmail.com",
                        LocalDate.of(2000, 1, 27),
                        24
                )
        );
    }
}
