package com.estudos.Estudosspring.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Usuario {

    @Id
    private String email;
    private String nome;
    private String sobrenome;
    private int idade;
    private String senha;
}
