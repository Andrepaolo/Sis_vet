package com.veterinaria.sistema.repository;

import com.veterinaria.sistema.entity.AnimalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<AnimalEntity, Long> {
    // No es necesario agregar ningún método, JpaRepository ya proporciona todos los métodos CRUD por defecto.
}
