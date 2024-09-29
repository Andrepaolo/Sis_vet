package com.veterinaria.sistema.repository;

import com.veterinaria.sistema.entity.HistoriaClinicaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoriaClinicaRepository extends JpaRepository<HistoriaClinicaEntity, Long> {
    // Podrías agregar métodos como buscar por email más adelante.
}
