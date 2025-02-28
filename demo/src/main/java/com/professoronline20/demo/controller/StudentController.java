package com.professoronline20.demo.controller;

import java.beans.PropertyEditorSupport;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Integer.class, new PropertyEditorSupport() {
            @Override
            public void setAsText(String text) throws IllegalArgumentException {
                setValue((text == null || text.isEmpty()) ? null : Integer.parseInt(text));
            }
        });
    }

    @PostMapping("/submit")
    public String processarFormulario(@ModelAttribute Student estudante) {
        System.out.println("TESTE");
        return "redirect:/success";
    }
}
