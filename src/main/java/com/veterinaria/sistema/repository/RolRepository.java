package com.veterinaria.sistema.repository;

import com.veterinaria.sistema.entity.RolEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<RolEntity, Long> {
    // Aquí también puedes agregar consultas personalizadas en caso de ser necesario.
}
