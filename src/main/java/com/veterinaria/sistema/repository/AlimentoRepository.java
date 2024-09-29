package com.veterinaria.sistema.repository;

import com.veterinaria.sistema.entity.AlimentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlimentoRepository extends JpaRepository<AlimentoEntity, Long> {
    // No es necesario agregar ningún método, JpaRepository ya proporciona todos los métodos CRUD por defecto.
}
