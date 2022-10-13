
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Alquiler,Vehiculo } from '../interfaces/interfaces';

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
  //Este metodo obtiene un solo vehiculo (el seleccionado)
  obtenerVehiculo(id:number):Observable<Vehiculo>{
    return this.httpClient.get<Vehiculo>(`${this.baseUrl}/ObtenerVehiculo/${id}`);
  }
  //Este metodo actualiza el vehiculo a no disponible
  actualizarVehiculo(id:number):Observable<Vehiculo>{
    return this.httpClient.get<Vehiculo>(`${this.baseUrl}/Actualizar/${id}`);
   }
  //Este metodo registra el alquiler de un vehiculo
   registrarAlquiler(alquiler:Alquiler):Observable<object>{
     return this.httpClient.post(`${this.baseUrl}/RegistrarAlquiler`,alquiler)
   }

   crearVehiculo(vehiculo:Vehiculo):Observable<object>{
    return this.httpClient.post(`${this.baseUrl}/RegistrarVehiculo`,vehiculo)
   }

}
