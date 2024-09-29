package com.veterinaria.sistema.service;

import com.veterinaria.sistema.entity.UsuarioEntity;
import com.veterinaria.sistema.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    // Crear un nuevo usuario
    public UsuarioEntity crearUsuario(UsuarioEntity usuario) {
        return usuarioRepository.save(usuario);
    }

    // Obtener todos los usuarios
    public List<UsuarioEntity> obtenerTodosLosUsuarios() {
        return usuarioRepository.findAll();
    }

    // Obtener un usuario por ID
    public Optional<UsuarioEntity> obtenerUsuarioPorId(Long id) {
        return usuarioRepository.findById(id);
    }

    // Actualizar un usuario existente
    public UsuarioEntity actualizarUsuario(UsuarioEntity usuario) {
        return usuarioRepository.save(usuario);
    }

    // Eliminar un usuario por ID
    public void eliminarUsuarioPorId(Long id) {
        usuarioRepository.deleteById(id);
    }
}
