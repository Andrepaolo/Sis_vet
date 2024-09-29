package com.veterinaria.sistema.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veterinaria.sistema.entity.AlimentoEntity;
import com.veterinaria.sistema.repository.AlimentoRepository;

@Service
public class AlimentoService {
    //auto registro
    @Autowired
    private AlimentoRepository alimentoRepository;
    //inico del CRUD(create-read-update-delete)
    //crear alimento
    public AlimentoEntity crearAlimento(AlimentoEntity alimento){
        return alimentoRepository.save(alimento);
    }
    //read-leer alimento leer todos los alimentos
    public List<AlimentoEntity> obtenerTodosLosAliemntos() {
        return alimentoRepository.findAll();
    }

    // Obtener un animal por ID (READ)
    public Optional<AlimentoEntity> obtenerAnimalPorId(Long id) {
        return alimentoRepository.findById(id);
    }
    //actualizar alimento
    public AlimentoEntity actualizarAlimento(AlimentoEntity alimento){
        return alimentoRepository.save(alimento);
    }
    //Eliminar un alimento por ID (delete)
    public void eliminarAlimentoPorId(Long id){
        alimentoRepository.deleteById(id);
    }

}
