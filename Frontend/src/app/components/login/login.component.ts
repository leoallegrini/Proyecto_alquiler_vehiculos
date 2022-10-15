import { Cliente } from './../../interfaces/interfaces';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from 'src/app/services/auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  cliente:Cliente = new Cliente();

  constructor(private router: Router,private loginService:AuthService) { }

  ngOnInit(): void {
  }

  loginCliente(){
    let link = [''];
    this.loginService.loginCliente(this.cliente.correo,this.cliente.password).subscribe({
      next: (v:any) => {alert("Bienvenido!"),this.router.navigate(link),this.loginService.setToken(v.password),this.loginService.SetIdUser(v.idcliente),this.loginService.setIdRol(v.rol)},
      error: (e:any) => {alert("El correo electronico ingresado o la contraseña no son correctos"),console.log(e)}
    });


  }

  registro() {
    let link = ['/registro'];
    this.router.navigate(link);
  }

}
