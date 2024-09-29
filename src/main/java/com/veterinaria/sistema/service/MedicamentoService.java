package com.veterinaria.sistema.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veterinaria.sistema.entity.MedicamentoEntity;
import com.veterinaria.sistema.repository.MedicamentoRepository;



@Service
public class MedicamentoService {
    
    @Autowired
    private MedicamentoRepository medicamentoRepository;

    // Crear un nuevo animal (CREATE)
    public MedicamentoEntity crearMedicamento(MedicamentoEntity medicamento) {
        return medicamentoRepository.save(medicamento);
    }

    // Obtener todos los animales (READ)
    public List<MedicamentoEntity> obtenerTodosLosMedicamentos() {
        return medicamentoRepository.findAll();
    }

    // Obtener un animal por ID (READ)
    public Optional<MedicamentoEntity> obtenerMedicamentoPorId(Long id) {
        return medicamentoRepository.findById(id);
    }

    // Actualizar un animal existente (UPDATE)
    public MedicamentoEntity actualizarMedicamento(MedicamentoEntity medicamento) {
        return medicamentoRepository.save(medicamento); // `save()` también funciona para actualizar
    }

    // Eliminar un animal por ID (DELETE)
    public void eliminarMedicamentoPorId(Long id) {
        medicamentoRepository.deleteById(id);
    }




}
