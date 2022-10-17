import { AuthService } from 'src/app/services/auth.service';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Vehiculo } from 'src/app/interfaces/interfaces';
import { VehiculoService } from 'src/app/services/vehiculo.service';

@Component({
  selector: 'app-vehiculos',
  templateUrl: './vehiculos.component.html',
  styleUrls: ['./vehiculos.component.css']
})
export class VehiculosComponent implements OnInit {

  vehiculo : Vehiculo = new Vehiculo();

  constructor(private router: Router,private vehiculoService:VehiculoService,private loginService:AuthService) { }

  ngOnInit(): void {
  }

  crearVehiculo(){
    this.vehiculo.idempresa = this.loginService.getIdUser();
    console.log(this.vehiculo);
    this.vehiculoService.crearVehiculo(this.vehiculo).subscribe();

    alert("Su vehiculo ha sido creado con exito ");
    let link = [''];
    this.router.navigate(link);
  }
}
