package br.com.professoronline20.professoronline.model;

import org.springframework.stereotype.Component;

@Component
public class ResponseStudentModel {
    private String mensagem;

    public ResponseStudentModel(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
