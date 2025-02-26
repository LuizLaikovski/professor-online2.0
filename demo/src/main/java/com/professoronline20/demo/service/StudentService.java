package com.professoronline20.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.professoronline20.demo.domain.Student;

@Service
public class StudentService {

    public Student retornarDados(Student estudante) {
        return estudante;
    }
}
