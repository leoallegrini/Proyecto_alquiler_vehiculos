import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Cliente } from 'src/app/interfaces/interfaces';
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
      next: (v) => {alert("Bienvenido!"),this.router.navigate(link),this.cliente.rol = 1,this.loginService.login()},
      error: (e) => alert("El correo electronico ingresado o la contraseña no son correctos")
    });

  }

  registro() {
    let link = ['/registro'];
    this.router.navigate(link);
  }

}
