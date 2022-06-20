package com.proyecto.proyecto_alquiler_vehiculos.controller;

import java.util.List;


import com.proyecto.proyecto_alquiler_vehiculos.models.*;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/RentalsVenado")
@CrossOrigin(origins = "http://localhost:4200")

public class AlquilerController {

    @Autowired
	private I_Vehiculo IVehiculos;

	//Este metodo lista todos los vehiculos
	@GetMapping("/vehiculos")
	public List<Vehiculo> listarVehiculos(){
        
		return IVehiculos.Vehiculos();
	}

	//Este método obtiene un vehiculo seleccionado
	@GetMapping("/ObtenerVehiculo/{id}")
	public Vehiculo oVehiculo(@PathVariable Integer id){
		return IVehiculos.obtenerVehiculo(id);
	}
	//Este metodo se encarga de actualizar el estado de un vehiculo
	@GetMapping("/Actualizar/{id}")
	public Vehiculo aVehiculo(@PathVariable Integer id){
		return IVehiculos.actualizarVehiculo(id);
	}
	//Este metodo se encarga de registrar un alquiler
	@PostMapping("/RegistrarAlquiler")
	public Alquiler GuardarAlquiler(Alquiler nuevoAlquiler) {
		
		return IVehiculos.registrarAlquiler(nuevoAlquiler);
	}
	

}
