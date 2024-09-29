package com.veterinaria.sistema.service;

import com.veterinaria.sistema.entity.FarmaciaEntity;
import com.veterinaria.sistema.repository.FarmaciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FarmaciaService {

    @Autowired
    private FarmaciaRepository farmaciaRepository;

    // Crear un nuevo medicamento
    public FarmaciaEntity crearMedicamento(FarmaciaEntity medicamento) {
        return farmaciaRepository.save(medicamento);
    }

    // Obtener todos los medicamentos
    public List<FarmaciaEntity> obtenerTodosLosMedicamentos() {
        return farmaciaRepository.findAll();
    }

    // Obtener un medicamento por ID
    public Optional<FarmaciaEntity> obtenerMedicamentoPorId(Long id) {
        return farmaciaRepository.findById(id);
    }

    // Actualizar un medicamento existente
    public FarmaciaEntity actualizarMedicamento(FarmaciaEntity medicamento) {
        return farmaciaRepository.save(medicamento);
    }

    // Eliminar un medicamento por ID
    public void eliminarMedicamentoPorId(Long id) {
        farmaciaRepository.deleteById(id);
    }
}
