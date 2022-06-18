import { Alquiler } from './../alquiler';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Vehiculo } from '../classes/vehiculo';

@Injectable({
  providedIn: 'root'
})
export class VehiculoService {
  //URL backend
  private baseUrl = "http://localhost:8080/RentalsVenado";


  constructor(private httpClient : HttpClient) { }

  //Este metodo devuleve los vehiculos
  obtenerListaVehiculos(): Observable<Vehiculo[]>{
    return this.httpClient.get<Vehiculo[]>(`${this.baseUrl}/vehiculos`);
  }

  obtenerVehiculo(id:number):Observable<Vehiculo>{
    return this.httpClient.get<Vehiculo>(`${this.baseUrl}/ObtenerVehiculo/${id}`);
  }

  actualizarVehiculo(id:number):Observable<Vehiculo>{
    return this.httpClient.get<Vehiculo>(`${this.baseUrl}/Actualizar/${id}`);
   }

   registrarAlquiler(alquiler:Alquiler):Observable<object>{
     return this.httpClient.post(`${this.baseUrl}/RegistrarAlquiler`,alquiler)
   }

}
