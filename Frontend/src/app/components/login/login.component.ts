import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
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

  login(){
    let link = ['']
    this.loginService.login(this.cliente.correo,this.cliente.password).subscribe({
      next: (v) => {alert("Ingresaste correctamente"),this.router.navigate(link)},
      error: (e) => alert("El correo electronico ingresao o la contraseña no son correctos")
    });

  }

  registro() {
    let link = ['/registro'];
    this.router.navigate(link);
  }

}
