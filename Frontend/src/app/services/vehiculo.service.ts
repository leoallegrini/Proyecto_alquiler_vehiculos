import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { observableToBeFn } from 'rxjs/internal/testing/TestScheduler';
import { Vehiculo } from '../classes/vehiculo';

@Injectable({
  providedIn: 'root'
})
export class VehiculoService {
  //URL backend listado de todos los vehiculos
  private baseUrl = "http://localhost:8080/RentalsVenado/vehiculos";
  private urlVehiSingle = "http://localhost:8080/RentalsVenado/ObtenerVehiculo"
  private urlVehiUpdate = "http://localhost:8080/RentalsVenado/Actualizar"

  constructor(private httpClient : HttpClient) { }

  //Este metodo devuleve los vehiculos
  obtenerListaVehiculos(): Observable<Vehiculo[]>{
    return this.httpClient.get<Vehiculo[]>(`${this.baseUrl}`);
  }

  obtenerVehiculo(id:number):Observable<Vehiculo>{
    return this.httpClient.get<Vehiculo>(`${this.urlVehiSingle}/${id}`);
  }

  actualizarVehiculo(id:number):Observable<Vehiculo>{
    return this.httpClient.get<Vehiculo>(`${this.urlVehiUpdate}/${id}`);
   }
}
