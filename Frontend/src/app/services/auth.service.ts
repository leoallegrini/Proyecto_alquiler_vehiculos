import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Subject, Observable } from 'rxjs';
import { Cliente } from '../interfaces/interfaces';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  private baseUrl = "http://localhost:8080/RentalsVenado";

  constructor(private httpClient : HttpClient) { }
  auth = new Subject();

  login(){

  }

  //Este metodo registra el alquiler de un vehiculo
  registrarCliente(cliente:Cliente):Observable<object>{
    return this.httpClient.post(`${this.baseUrl}/clientes/RegistrarCliente`,cliente)

  }

}
