package com.proyecto.proyecto_alquiler_vehiculos.controller;

import java.util.List;

import com.proyecto.proyecto_alquiler_vehiculos.Repository.EmpresaRepository;
import com.proyecto.proyecto_alquiler_vehiculos.models.Empresa;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/RentalsVenado/empresas")
@CrossOrigin(origins = "http://localhost:4200")
public class EmpresaController {


    @Autowired
	private EmpresaRepository repositorio;

	//Este metodo lista todos los vehiculos
	@GetMapping("/lista")
	public List<Empresa> listarClientes(){

		return repositorio.findAll();
	}
}
