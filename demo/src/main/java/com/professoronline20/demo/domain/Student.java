package com.professoronline20.demo.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String name;
    private int CPF;
    private String dateOfBirth;
    private int registration;
    

    public Student(String name, int cPF, int registration, String sdf) {
        this.name = name;
        this.CPF = cPF;
        this.dateOfBirth = sdf;
        this.registration = registration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int cPF) {
        CPF = cPF;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getRegistration() {
        return registration;
    }

    public void setRegistration(int registration) {
        this.registration = registration;
    }

    @Override
    public String toString() {
        return "Nome = " + name + ", CPF = " + CPF + ", Data de Nascimento = " + dateOfBirth + ", Matricula = "+ registration;
    }
}