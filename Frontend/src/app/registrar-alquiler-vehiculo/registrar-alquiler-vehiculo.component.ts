import { Vehiculo } from '../classes/vehiculo';
import { Component, OnInit} from '@angular/core';
import { VehiculoService } from '../services/vehiculo.service';
import { ActivatedRoute } from '@angular/router';
import { Router } from '@angular/router';

@Component({
  selector: 'app-registrar-alquiler-vehiculo',
  templateUrl: './registrar-alquiler-vehiculo.component.html',
  styleUrls: ['./registrar-alquiler-vehiculo.component.css']
})
export class RegistrarAlquilerVehiculoComponent implements OnInit {

  vehiculos : Vehiculo;

  constructor(private vehiculoServicio:VehiculoService, private _route:ActivatedRoute,  private router: Router) { }

  ngOnInit() {
    let id = this._route.snapshot.paramMap.get('id');
    this.mostrarVehiculos(id!)
  }

  onSubmit(){

  }

  private mostrarVehiculos(cod: string){
    var codigo = parseInt(cod);
    this.vehiculoServicio.obtenerVehiculo(codigo)
    .subscribe(dato => {
      this.vehiculos = dato;
    })
  }

  actualizarVehiculo(vehiculo: Vehiculo){
    this.vehiculoServicio.actualizarVehiculo(vehiculo.id).subscribe(dato => {
      this.vehiculos = dato;
    });
    alert("Su alquiler ha sido confirmado con éxito ");
    let link = ['/vehiculos'];
    this.router.navigate(link);
  }
}


