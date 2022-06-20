import { Alquiler } from '../classes/alquiler';
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
  alquiler : Alquiler = new Alquiler();

  constructor(private vehiculoServicio:VehiculoService, private _route:ActivatedRoute,  private router: Router) { }

  ngOnInit(): void {
    let id = this._route.snapshot.paramMap.get('id');
    this.mostrarVehiculos(id!)
  }

  guardarAlquiler(){
    this.alquiler.marca = this.vehiculos.marca;
    this.alquiler.modelo = this.vehiculos.modelo;
    this.alquiler.anio = this.vehiculos.anio;
    this.alquiler.disponible = false;
    this.alquiler.iD = this.vehiculos.id;
    this.alquiler.transmision = this.vehiculos.transmision;
    this.alquiler.tamanio = this.vehiculos.tamanio;
    this.alquiler.categoria = this.vehiculos.categoria;

    console.log(this.alquiler);

    this.vehiculoServicio.registrarAlquiler(this.alquiler).subscribe(dato => {
      //console.log(dato);
      this.actualizarVehiculo(this.vehiculos);
    }, error => console.log(error));
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

  onSubmit(){
    this.guardarAlquiler();
  }


}


