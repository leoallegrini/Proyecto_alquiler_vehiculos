package com.proyecto.proyecto_alquiler_vehiculos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.proyecto_alquiler_vehiculos.models.Prueba;

@Repository
public interface pruebaRepositorio extends JpaRepository<Prueba,Long> {
    
}
