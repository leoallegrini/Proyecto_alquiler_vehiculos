import { Cliente } from './../../interfaces/interfaces';
import { Component, OnInit } from '@angular/core';
import { AuthService } from 'src/app/services/auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-registro',
  templateUrl: './registro.component.html',
  styleUrls: ['./registro.component.css']
})
export class RegistroComponent implements OnInit {

  cliente:Cliente = new Cliente();

  constructor(private router: Router,private loginService:AuthService) { }

  ngOnInit(): void {
  }

  crearCliente(){
    this.loginService.registrarCliente(this.cliente).subscribe();

    alert("Su registro ha sido realizado con éxito ");
    let link = [''];
    this.loginService.loginCliente(this.cliente.correo,this.cliente.password).subscribe({
      next: (v:any) => {alert("Bienvenido!"),this.router.navigate(link),this.loginService.setToken(v.password),this.loginService.SetIdUser(v.idcliente),this.loginService.setIdRol(v.rol)},
      error: (e:any) => {alert("El correo electronico ingresado o la contraseña no son correctos"),console.log(e)}
    });

  }

}
