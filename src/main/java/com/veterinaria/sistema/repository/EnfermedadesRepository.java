package com.veterinaria.sistema.repository;

import com.veterinaria.sistema.entity.EnfermedadEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnfermedadesRepository extends JpaRepository<EnfermedadEntity, Long> {
    // Espacio para consultas personalizadas.
}
 