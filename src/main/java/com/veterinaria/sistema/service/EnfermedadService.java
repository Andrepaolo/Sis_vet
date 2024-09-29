package com.veterinaria.sistema.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veterinaria.sistema.entity.EnfermedadEntity;
import com.veterinaria.sistema.repository.EnfermedadesRepository;

@Service
public class EnfermedadService {

    //autoregistro
    @Autowired
    private EnfermedadesRepository enfermedadRepository;

    //Create- crear nuevo registro de enfermedad
    public EnfermedadEntity crearEnfermedad(EnfermedadEntity enfermedad){
        return enfermedadRepository.save(enfermedad);
    }

    //Read-Obtener todas las enfermedades
    public List<EnfermedadEntity> obtenerTodasLasEnferemedades(){
        return enfermedadRepository.findAll();
    }

    public Optional<EnfermedadEntity> obtenerEnfermedadPorId(Long id){
        return enfermedadRepository.findById(id);
    }
    
    //Update- actualizar una enfermedad
    public EnfermedadEntity actualizarEnfermedad(EnfermedadEntity enfermedad){
        return enfermedadRepository.save(enfermedad);
    }

}
