package com.veterinaria.sistema.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veterinaria.sistema.entity.AnimalEntity;
import com.veterinaria.sistema.repository.AnimalRepository;

@Service
public class AnimalService {
    
    @Autowired
    private AnimalRepository animalRepository;

    // Crear un nuevo animal (CREATE)
    public AnimalEntity crearAnimal(AnimalEntity animal) {
        return animalRepository.save(animal);
    }

    // Obtener todos los animales (READ)
    public List<AnimalEntity> obtenerTodosLosAnimales() {
        return animalRepository.findAll();
    }

    // Obtener un animal por ID (READ)
    public Optional<AnimalEntity> obtenerAnimalPorId(Long id) {
        return animalRepository.findById(id);
    }

    // Actualizar un animal existente (UPDATE)
    public AnimalEntity actualizarAnimal(AnimalEntity animal) {
        return animalRepository.save(animal); // `save()` también funciona para actualizar
    }

    // Eliminar un animal por ID (DELETE)
    public void eliminarAnimalPorId(Long id) {
        animalRepository.deleteById(id);
    }




}
