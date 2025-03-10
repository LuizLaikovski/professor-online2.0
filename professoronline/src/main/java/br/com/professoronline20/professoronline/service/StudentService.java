package br.com.professoronline20.professoronline.service;

import br.com.professoronline20.professoronline.model.ResponseStudentModel;
import br.com.professoronline20.professoronline.model.StudentModel;
import br.com.professoronline20.professoronline.repositorio.StudentRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    //@Autowired
    //private StudentRepositorio studentRepositorio;

    @Autowired
    private ResponseStudentModel responseStudent;

    // MÉTODO PARA LISTAR OS ALUNOS DA TABELA
    public Iterable<StudentModel> listar() {
        return studentRepositorio.findAll();
    }

    // METODO PARA CADASTRAR ALUNOS, acao -> saber se vai retornar um status criado(criando) ou ok(alterando)
    public ResponseEntity<?> cadastrarAletar(StudentModel studentModel, String acao){
        if (studentModel.getNome().equals("")) {
            responseStudent.setMensagem("O nome do Produto é obrigatório");
            return new ResponseEntity<ResponseStudentModel>(responseStudent, HttpStatus.BAD_REQUEST);
        } else if(studentModel.getDataNascimento() == null) {
            responseStudent.setMensagem("A data de Nascimento é obrigatória");
            return new ResponseEntity<ResponseStudentModel>(responseStudent, HttpStatus.BAD_REQUEST);
        } else {
            if (acao.equals("cadastrar")) {
                return new ResponseEntity<StudentModel>(studentRepositorio.save(studentModel), HttpStatus.CREATED);
            } else {
                return new ResponseEntity<StudentModel>(studentRepositorio.save(studentModel), HttpStatus.OK);
            }

        }
    }

    // MÉTODO PARA REMOVER ESTUDANTES
    public ResponseEntity<ResponseStudentModel> remover(Integer matricula) {
        studentRepositorio.deleteById(matricula);

        responseStudent.setMensagem("O estudante de matricula "+ matricula + " foi removido");
        return new ResponseEntity<ResponseStudentModel>(responseStudent , HttpStatus.OK);
    }
}
