package com.veterinaria.sistema.repository;

import com.veterinaria.sistema.entity.FarmaciaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FarmaciaRepository extends JpaRepository<FarmaciaEntity, Long> {
    // Si en algún momento necesitas búsquedas específicas, puedes agregarlas aquí.
}
