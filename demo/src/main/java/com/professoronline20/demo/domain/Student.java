package com.professoronline20.demo.domain;


public class Student {
    private String name;
    private String CPF;
    private String dateOfBirth;
    private Integer registration;
    

    public Student(String name, String cPF, Integer registration, String sdf) {
        this.name = name;
        this.CPF = cPF;
        this.dateOfBirth = sdf;
        if (registration == null) {
            this.registration = 1;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getRegistration() {
        return registration;
    }

    public void setRegistration(Integer registration) {
        this.registration = registration;
    }

    @Override
    public String toString() {
        return "Nome = " + this.name + ", CPF = " + this.CPF + ", Data de Nascimento = " + this.dateOfBirth + ", Matricula = "+ this.registration;
    }
}