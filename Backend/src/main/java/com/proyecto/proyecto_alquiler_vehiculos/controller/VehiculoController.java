package com.proyecto.proyecto_alquiler_vehiculos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.proyecto_alquiler_vehiculos.exceptions.ResourceNotFoundExceptions;
import com.proyecto.proyecto_alquiler_vehiculos.models.Vehiculo;
import com.proyecto.proyecto_alquiler_vehiculos.repository.VehiculoRepository;


@RestController
@RequestMapping("/RentalsVenado")
@CrossOrigin(origins = "http://localhost:4200")
public class VehiculoController {

	@Autowired
	private VehiculoRepository repositorioV;

	// Este metodo lista todos los vehiculos
	@GetMapping("/vehiculos")
	public List<Vehiculo> ListarVehiculos() {

		return repositorioV.findAll();
	}

	// Este método se encarga de obtener un vehiculo seleccionado
	@GetMapping("/ObtenerVehiculo/{id}")
	public ResponseEntity<Vehiculo> ObtenerVehiculo(@PathVariable Long id) {

		Vehiculo vehiculo = repositorioV.findById(id)
				.orElseThrow(() -> new ResourceNotFoundExceptions("No existe un vehiculo con el id: " + id));

		return ResponseEntity.ok(vehiculo);
	}

	// Este metodo se encarga de actualizar el estado de un vehiculo
	@PutMapping("/actualizarVehiculo/{id}")
	public ResponseEntity<Vehiculo> ActualizarVehiculo(@PathVariable Long id, @RequestBody Vehiculo nuevoVehiculo) {

		Vehiculo vehiculo = repositorioV.findById(id)
				.orElseThrow(() -> new ResourceNotFoundExceptions("No existe un vehiculo con el id: " + id));

		vehiculo.setIdempresa(nuevoVehiculo.getIdempresa());
		vehiculo.setMarca(nuevoVehiculo.getMarca());
		vehiculo.setModelo(nuevoVehiculo.getModelo());
		vehiculo.setAnio(nuevoVehiculo.getAnio());
		vehiculo.setPatente(nuevoVehiculo.getPatente());
		vehiculo.setTamanio(nuevoVehiculo.getTamanio());
		vehiculo.setTransmision(nuevoVehiculo.isTransmision());
		vehiculo.setCategoria(nuevoVehiculo.getCategoria());
		vehiculo.setPrecioalquiler(nuevoVehiculo.getPrecioalquiler());
		vehiculo.setDisponible(nuevoVehiculo.isDisponible());
		vehiculo.setImagen(nuevoVehiculo.getImagen());

		Vehiculo vehiculoActualizado = repositorioV.save(vehiculo);

		return ResponseEntity.ok(vehiculoActualizado);
	}

	// Este metodo se encarga de deshabilitar un vehiculo
	@PostMapping("/EliminarVehiculo/{id}")
	public ResponseEntity<String> EliminarVehiculo(@PathVariable Long id) {

		Vehiculo vehiculo = repositorioV.findById(id)
				.orElseThrow(() -> new ResourceNotFoundExceptions("No existe un vehiculo con el id: " + id));

		vehiculo.setDisponible(false);

		repositorioV.save(vehiculo);

		return ResponseEntity.ok("Vehiculo eliminado");
	}

	// Este metodo se encarga de registrar un nuevo vehiculo
	@PostMapping("/RegistrarVehiculo")
	public Vehiculo CrearVehiculo(@RequestBody Vehiculo nuevoVehiculo) {

		return repositorioV.save(nuevoVehiculo);
	}


}
