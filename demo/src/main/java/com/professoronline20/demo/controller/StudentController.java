package com.professoronline20.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.professoronline20.demo.domain.Student;
import com.professoronline20.demo.service.StudentService;

@Controller
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/form")
    public String exibirForm() {
        return "index.html";
    }

    @PostMapping("/submit")
    public Student processarFormulario(@RequestBody Student estudante) {
        return studentService.retornarDados(estudante);
    }
}
