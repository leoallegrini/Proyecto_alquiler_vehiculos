package com.proyecto.proyecto_alquiler_vehiculos.controller;

import java.util.List;

import com.proyecto.proyecto_alquiler_vehiculos.repository.EmpresaRepository;
import com.proyecto.proyecto_alquiler_vehiculos.exceptions.ResourceNotFoundExceptions;
import com.proyecto.proyecto_alquiler_vehiculos.models.Empresa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	@PostMapping("/registrarEmpresa")
	public Empresa CrearEmpresa(@RequestBody Empresa nuevaEmpresa) {
		nuevaEmpresa.setHabilitado(true);
		return repositorio.save(nuevaEmpresa);
	}

	// Este metodo se encarga de actualizar el estado de una empresa
	@PutMapping("/actualizarEmpresa/{id}")
	public ResponseEntity<Empresa> ActualizarEmpresa(@PathVariable Long id, @RequestBody Empresa nuevaEmpresa) {

		Empresa empresa = repositorio.findById(id)
				.orElseThrow(() -> new ResourceNotFoundExceptions("No existe un cliente con el id: " + id));

		empresa.setNombre(nuevaEmpresa.getNombre());
		empresa.setApellido(nuevaEmpresa.getApellido());
		empresa.setRazonsocial(nuevaEmpresa.getRazonsocial());
		empresa.setCuit(nuevaEmpresa.getCuit());
		empresa.setCelular(nuevaEmpresa.getCelular());
		empresa.setHabilitado(nuevaEmpresa.isHabilitado());
		empresa.setCorreo(nuevaEmpresa.getCorreo());
		empresa.setPassword(nuevaEmpresa.getPassword());

		Empresa empresaActualizada = repositorio.save(empresa);

		return ResponseEntity.ok(empresaActualizada);
	}

	//Este metodo se encarga de deshabilitar una empresa
	@PostMapping("/eliminarEmpresa/{id}")
	public ResponseEntity<String> EliminarEmpresa(@PathVariable Long id) {

		Empresa empresa = repositorio.findById(id)
				.orElseThrow(() -> new ResourceNotFoundExceptions("No existe una empresa con el id: " + id));

		empresa.setHabilitado(false);

		repositorio.save(empresa);

		return ResponseEntity.ok("Empresa eliminada");
	}

	@GetMapping("/loginEmpresa")
	public ResponseEntity<Empresa> LoginEmpresa(String correo, String pass){

		Empresa empresa = repositorio.findByCorreo(correo).orElseThrow(() -> new ResourceNotFoundExceptions("No existe un cliente con el correo ingresado "+ correo));

		if(empresa.getPassword().equals(pass)){
			return ResponseEntity.ok(empresa);
		}else{
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
	}
}
