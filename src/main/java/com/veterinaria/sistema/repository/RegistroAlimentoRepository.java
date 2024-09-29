package com.veterinaria.sistema.repository;

import com.veterinaria.sistema.entity.RegistroAlimentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistroAlimentoRepository extends JpaRepository<RegistroAlimentoEntity, Long> {
    // Podrías agregar métodos como buscar por email más adelante.
}
