package com.estudos.Estudosspring.controller;

import com.estudos.Estudosspring.entity.Usuario;
import com.estudos.Estudosspring.service.UsuarioService;
import com.estudos.Estudosspring.dto.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping("/cadastro")
    public ResponseEntity<String> cadastrarUsuario(@RequestBody Usuario usuario) {
        usuarioService.cadastrarUsuario(usuario);
        return ResponseEntity.ok("Usuário cadastrado com sucesso");
    }

    @PostMapping("/login")
    public ResponseEntity<String> fazerLogin(@RequestBody LoginRequest loginRequest) {
        String resultadoLogin = usuarioService.fazerLogin(loginRequest);
        return ResponseEntity.ok(resultadoLogin);
    }
}
