package com.proyecto.proyecto_alquiler_vehiculos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.proyecto_alquiler_vehiculos.repositorio.pruebaRepositorio;
import com.proyecto.proyecto_alquiler_vehiculos.models.Prueba;
import java.util.List;

@RestController
public class PruebaController {
    

    @Autowired
    private pruebaRepositorio repositorio;

    @GetMapping("/prueba")
    public List<Prueba> listarTodos(){
        return repositorio.findAll();
    }
}
