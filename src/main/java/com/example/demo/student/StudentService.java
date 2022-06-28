package com.example.demo.student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

//    @GetMapping
//    public List<Student> getStudents(){
//        return List.of(new Student(
//                1L,
//                "Jerome",
//                "jeromegarcia.16@gmail.com",
//                LocalDate.of(1988, Month.MAY, 22),
//                34)
//        );
//    }
}
