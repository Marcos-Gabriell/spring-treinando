package com.estudos.Estudosspring.repository;

import com.estudos.Estudosspring.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {

}
