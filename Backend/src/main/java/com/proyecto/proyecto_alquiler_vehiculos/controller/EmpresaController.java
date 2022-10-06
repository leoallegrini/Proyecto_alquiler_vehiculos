package com.proyecto.proyecto_alquiler_vehiculos.controller;

import java.util.List;

import com.proyecto.proyecto_alquiler_vehiculos.repository.EmpresaRepository;
import com.proyecto.proyecto_alquiler_vehiculos.exceptions.ResourceNotFoundExceptions;
import com.proyecto.proyecto_alquiler_vehiculos.models.Empresa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



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

	// Este metodo se encarga de registrar una nueva empresa
	@PostMapping("/RegistrarEmpresa")
	public Empresa CrearEmpresa(@RequestBody Empresa nuevaEmpresa) {

		return repositorio.save(nuevaEmpresa);
	}

	//Este metodo se encarga de deshabilitar una empresa
	@PostMapping("/EliminarEmpresa/{id}")
	public ResponseEntity<String> EliminarEmpresa(@PathVariable Long id) {

		Empresa empresa = repositorio.findById(id)
				.orElseThrow(() -> new ResourceNotFoundExceptions("No existe una empresa con el id: " + id));

		empresa.setHabilitado(false);

		repositorio.save(empresa);

		return ResponseEntity.ok("Empresa eliminada");
	}
}
