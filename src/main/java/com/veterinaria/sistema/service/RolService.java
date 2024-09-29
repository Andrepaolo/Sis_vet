package com.veterinaria.sistema.service;

import com.veterinaria.sistema.entity.RolEntity;
import com.veterinaria.sistema.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RolService {

    @Autowired
    private RolRepository rolRepository;

    // Crear un nuevo rol
    public RolEntity crearRol(RolEntity rol) {
        return rolRepository.save(rol);
    }

    // Obtener todos los roles
    public List<RolEntity> obtenerTodosLosRoles() {
        return rolRepository.findAll();
    }

    // Obtener un rol por ID
    public Optional<RolEntity> obtenerRolPorId(Long id) {
        return rolRepository.findById(id);
    }

    // Actualizar un rol existente
    public RolEntity actualizarRol(RolEntity rol) {
        return rolRepository.save(rol);
    }

    // Eliminar un rol por ID
    public void eliminarRolPorId(Long id) {
        rolRepository.deleteById(id);
    }
}

