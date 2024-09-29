package com.veterinaria.sistema.repository;

import com.veterinaria.sistema.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
    // Podrías agregar métodos como buscar por email más adelante.
}
