package com.estudos.Estudosspring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Usuario")
@Data
public class Usuario {

    @Id
    @Column(length = 255)
    private String email;

    @Column(length = 255)
    private String nome;

    @Column(length = 255)
    private String sobrenome;

    private int idade;

    @Column(length = 255)
    private String senha;
}
