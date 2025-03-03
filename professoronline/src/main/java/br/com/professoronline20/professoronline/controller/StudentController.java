package br.com.professoronline20.professoronline.controller;

import br.com.professoronline20.professoronline.model.ResponseStudentModel;
import br.com.professoronline20.professoronline.model.StudentModel;
import br.com.professoronline20.professoronline.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @DeleteMapping("/remover/{matricula}")
    public ResponseEntity<ResponseStudentModel> remover(@PathVariable Integer matricula) {
        return studentService.remover(matricula);
    }

    @PutMapping("/alterar")
    public ResponseEntity<?> alterar(@RequestBody StudentModel studentModel){
        return studentService.cadastrarAletar(studentModel, "alterar");
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<?> cadastrar(@RequestBody StudentModel studentModel){
        return studentService.cadastrarAletar(studentModel, "cadastrar");
    }

    @GetMapping("/listar")
    public Iterable<StudentModel> listar() {
        return studentService.listar();
    }

    @GetMapping("/")
    public String rota() {
        return "TESTE POPOPO";
    }
}
