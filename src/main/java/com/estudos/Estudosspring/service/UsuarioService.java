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

    public String fazerLogin(LoginRequest loginRequest) {
        // Busca o usuário pelo email
        Usuario usuario = usuarioRepository.findByEmail(loginRequest.getEmail());

        // Verifica se o usuário existe
        if (usuario != null) {
            // Verifica se a senha fornecida corresponde à senha armazenada (considerando que você usa bcrypt)
            if (passwordEncoder.matches(loginRequest.getSenha(), usuario.getSenha())) {
                return "Login bem-sucedido!";
            } else {
                return "Senha incorreta.";
            }
        } else {
            return "Usuário não encontrado.";
        }
    }
}
