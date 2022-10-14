import { Component, OnInit} from '@angular/core';
import { VehiculoService } from '../services/vehiculo.service';
import { ActivatedRoute } from '@angular/router';
import { Router } from '@angular/router';
import { Vehiculo,Alquiler } from '../interfaces/interfaces';


@Component({
  selector: 'app-registrar-alquiler-vehiculo',
  templateUrl: './registrar-alquiler-vehiculo.component.html',
  styleUrls: ['./registrar-alquiler-vehiculo.component.css']
})
export class RegistrarAlquilerVehiculoComponent implements OnInit {

  vehiculos : Vehiculo;
  alquiler : Alquiler = new Alquiler();

  constructor(private vehiculoServicio:VehiculoService, private _route:ActivatedRoute,  private router: Router) { }

  ngOnInit(): void {
    let id = this._route.snapshot.paramMap.get('id');
    this.mostrarVehiculos(id!)
  }

  guardarAlquiler(){
    this.alquiler.idvehiculo = this.vehiculos.idvehiculo;

    console.log(this.alquiler);

    this.vehiculoServicio.registrarAlquiler(this.alquiler).subscribe({
      next: (v) => this.deshabilitarVehiculo(this.vehiculos),
      error: (e) => console.log(e)
    });
  }

  private mostrarVehiculos(cod: string){
    var codigo = parseInt(cod);
    this.vehiculoServicio.obtenerVehiculo(codigo)
    .subscribe(dato => {
      this.vehiculos = dato;
    })
  }

  deshabilitarVehiculo(vehiculo: Vehiculo){
    this.vehiculoServicio.deshabilitarVehiculo(vehiculo.idvehiculo).subscribe(dato => {
      this.vehiculos = dato;
    });
    alert("Su alquiler ha sido confirmado con éxito ");
    let link = ['/vehiculos'];
    this.router.navigate(link);
  }

  onSubmit(){
    this.guardarAlquiler();
  }


}


