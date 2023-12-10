package com.estudos.Estudosspring.dto;

public class LoginRequest {

    private String email;
    private String senha;

    // Construtor vazio
    public LoginRequest() {
    }

    // Construtor com parâmetros
    public LoginRequest(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    // Getter para o email
    public String getEmail() {
        return email;
    }

    // Setter para o email
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter para a senha
    public String getSenha() {
        return senha;
    }

    // Setter para a senha
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
