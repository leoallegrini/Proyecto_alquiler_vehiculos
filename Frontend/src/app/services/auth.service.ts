import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Subject, Observable } from 'rxjs';
import { Cliente, Empresa } from '../interfaces/interfaces';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  private baseUrl = "http://localhost:8080/RentalsVenado";

  constructor(private httpClient : HttpClient) { }
  rol = 0;
  logged:Boolean;

  //Este metodo valida e ingresa un cliente
  loginCliente(correo:String,pass:String):Observable<object>{
    this.rol = 1;
    return this.httpClient.get(`${this.baseUrl}/clientes/loginCliente?correo=${correo}&pass=${pass}`)
  }

  //Este metodo registra el alquiler de un cliente
  registrarCliente(cliente:Cliente):Observable<object>{
    return this.httpClient.post(`${this.baseUrl}/clientes/registrarCliente`,cliente)
  }

  //Este metodo registra el alquiler de una empresa
  registrarEmpresa(empresa:Empresa):Observable<object>{
    return this.httpClient.post(`${this.baseUrl}/empresas/registrarEmpresa`,empresa)
  }

  //Este metodo valida e ingresa un empresa
  loginEmpresa(correo:String,pass:String):Observable<object>{
    this.rol = 2;
    return this.httpClient.get(`${this.baseUrl}/empresas/loginEmpresa?correo=${correo}&pass=${pass}`)
  }

  logout(){
    this.logged = false;
    this.rol = 0;
  }
  login(){
    this.logged = true;
  }

  estaLogueado(){
    return this.logged;
  }

  tipoUsuario(){
    return this.rol;
  }


}
