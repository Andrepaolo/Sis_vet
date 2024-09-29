package com.veterinaria.sistema.repository;

import com.veterinaria.sistema.entity.UbicacionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UbicacionRepository extends JpaRepository<UbicacionEntity, Long> {
    // Aquí también puedes agregar consultas personalizadas en caso de ser necesario.
}
