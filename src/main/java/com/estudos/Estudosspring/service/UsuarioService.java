package com.estudos.Estudosspring.service;

import com.estudos.Estudosspring.entity.Usuario;
import com.estudos.Estudosspring.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public void cadastrarUsuario(Usuario usuario) {
        // Aqui você pode adicionar lógica de validação, processamento, etc., antes de salvar no banco de dados
        usuarioRepository.save(usuario);
    }

    // Adicione métodos adicionais conforme necessário para operações relacionadas a usuários
}
