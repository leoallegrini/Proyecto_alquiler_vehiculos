package com.proyecto.proyecto_alquiler_vehiculos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.proyecto_alquiler_vehiculos.models.Vehiculo;

@Repository
public interface VehiculoRepository extends JpaRepository<Vehiculo,Long>{

}