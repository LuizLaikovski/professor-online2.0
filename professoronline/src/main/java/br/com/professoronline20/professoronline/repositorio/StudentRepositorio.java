package br.com.professoronline20.professoronline.repositorio;

import br.com.professoronline20.professoronline.model.StudentModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepositorio extends CrudRepository<StudentModel, Integer> {

}
