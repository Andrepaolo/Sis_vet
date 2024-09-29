package com.veterinaria.sistema.service;

import com.veterinaria.sistema.entity.HistoriaClinicaEntity;
import com.veterinaria.sistema.repository.HistoriaClinicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HistoriaClinicaService {

    @Autowired
    private HistoriaClinicaRepository historiaClinicaRepository;

    // Crear una nueva historia clínica
    public HistoriaClinicaEntity crearHistoriaClinica(HistoriaClinicaEntity historiaClinica) {
        return historiaClinicaRepository.save(historiaClinica);
    }

    // Obtener todas las historias clínicas
    public List<HistoriaClinicaEntity> obtenerTodasLasHistoriasClinicas() {
        return historiaClinicaRepository.findAll();
    }

    // Obtener una historia clínica por ID
    public Optional<HistoriaClinicaEntity> obtenerHistoriaClinicaPorId(Long id) {
        return historiaClinicaRepository.findById(id);
    }

    // Actualizar una historia clínica existente
    public HistoriaClinicaEntity actualizarHistoriaClinica(HistoriaClinicaEntity historiaClinica) {
        return historiaClinicaRepository.save(historiaClinica);
    }

    // Eliminar una historia clínica por ID
    public void eliminarHistoriaClinicaPorId(Long id) {
        historiaClinicaRepository.deleteById(id);
    }
}
