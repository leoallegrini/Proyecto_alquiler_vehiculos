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
  logged:Boolean;

  //Este metodo valida e ingresa un cliente
  loginCliente(correo:String,pass:String):Observable<object>{
    return this.httpClient.get(`${this.baseUrl}/clientes/loginCliente?correo=${correo}&pass=${pass}`)
  }

  //Este metodo registra el alquiler de un cliente
  registrarCliente(cliente:Cliente):Observable<object>{
    return this.httpClient.post(`${this.baseUrl}/clientes/RegistrarCliente`,cliente)
  }

  logout(){
    this.logged = false;
  }
  login(){
    this.logged = true;
  }

  estaLogueado(){
    return this.logged;
  }


}
