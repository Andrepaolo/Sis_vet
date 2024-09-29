package com.veterinaria.sistema.repository;

import com.veterinaria.sistema.entity.MedicamentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicamentoRepository extends JpaRepository<MedicamentoEntity, Long> {
    // Aquí también puedes agregar consultas personalizadas en caso de ser necesario.
}
