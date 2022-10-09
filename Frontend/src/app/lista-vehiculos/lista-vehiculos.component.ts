import { Component, OnInit } from '@angular/core';
import { VehiculoService } from '../services/vehiculo.service';
import { Router } from '@angular/router';
import { Vehiculo } from '../interfaces/interfaces';

@Component({
  selector: 'app-lista-vehiculos',
  templateUrl: './lista-vehiculos.component.html',
  styleUrls: ['./lista-vehiculos.component.css'],
})
export class ListaVehiculosComponent implements OnInit {
  vehiculos: Vehiculo[];

  constructor(
    private router: Router,
    private vehiculoServicio: VehiculoService
  ) {}

  ngOnInit(): void {
    this.obtenerVehiculos();
  }


  private obtenerVehiculos() {
    this.vehiculoServicio.obtenerListaVehiculos().subscribe((dato) => {
      this.vehiculos = dato;
    });
  }


  SeleccionarVehiculo(vehiculo: Vehiculo) {
    let link = ['/registrar-alquiler', vehiculo.idvehiculo];
    this.router.navigate(link);
  }
}
