package com.veterinaria.sistema.service;

import com.veterinaria.sistema.entity.RegistroAlimentoEntity;
import com.veterinaria.sistema.repository.RegistroAlimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegistroAlimentoService {

    @Autowired
    private RegistroAlimentoRepository registroAlimentoRepository;

    // Crear un nuevo registro de alimento
    public RegistroAlimentoEntity crearRegistroAlimento(RegistroAlimentoEntity registroAlimento) {
        return registroAlimentoRepository.save(registroAlimento);
    }

    // Obtener todos los registros de alimento
    public List<RegistroAlimentoEntity> obtenerTodosLosRegistrosAlimento() {
        return registroAlimentoRepository.findAll();
    }

    // Obtener un registro de alimento por ID
    public Optional<RegistroAlimentoEntity> obtenerRegistroAlimentoPorId(Long id) {
        return registroAlimentoRepository.findById(id);
    }

    // Actualizar un registro de alimento existente
    public RegistroAlimentoEntity actualizarRegistroAlimento(RegistroAlimentoEntity registroAlimento) {
        return registroAlimentoRepository.save(registroAlimento);
    }

    // Eliminar un registro de alimento por ID
    public void eliminarRegistroAlimentoPorId(Long id) {
        registroAlimentoRepository.deleteById(id);
    }
}
