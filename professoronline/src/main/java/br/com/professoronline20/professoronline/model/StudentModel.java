package br.com.professoronline20.professoronline.model;


import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Table(name = "students")
@Data
public class StudentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer matricula;
    private String nome;
    private Date dataNascimento;
}
