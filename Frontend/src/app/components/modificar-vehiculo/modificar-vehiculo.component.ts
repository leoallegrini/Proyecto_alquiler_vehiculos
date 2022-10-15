import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Vehiculo } from 'src/app/interfaces/interfaces';
import { AuthService } from 'src/app/services/auth.service';
import { VehiculoService } from 'src/app/services/vehiculo.service';

@Component({
  selector: 'app-modificar-vehiculo',
  templateUrl: './modificar-vehiculo.component.html',
  styleUrls: ['./modificar-vehiculo.component.css']
})
export class ModificarVehiculoComponent implements OnInit {

  vehiculo : Vehiculo = new Vehiculo();
  vehiculoSeleccionado: Vehiculo;

  constructor(private router: Router,private _route:ActivatedRoute,private vehiculoService:VehiculoService,private loginService:AuthService) { }

  ngOnInit(): void {
    let id = this._route.snapshot.paramMap.get('id');
    this.obtenerVehiculo(id!);
  }

  private obtenerVehiculo(cod: string) {
    var codigo = parseInt(cod);
    this.vehiculo.idempresa = this.loginService.getIdUser();
    this.vehiculoService.obtenerVehiculo(codigo).subscribe((dato) => {
      this.vehiculoSeleccionado = dato;
    });
  }

  modificarVehiculo(){
    this.vehiculoService.actualizarVehiculo(this.vehiculo.idvehiculo,this.vehiculo).subscribe();

    alert("Su vehiculo ha sido modificado con exito ");
    let link = [''];
    this.router.navigate(link);
  }
}


