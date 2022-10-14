import { Empresa } from './../../interfaces/interfaces';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from 'src/app/services/auth.service';

@Component({
  selector: 'app-login-empresa',
  templateUrl: './login-empresa.component.html',
  styleUrls: ['./login-empresa.component.css']
})
export class LoginEmpresaComponent implements OnInit {

  empresa:Empresa = new Empresa();

  constructor(private router: Router,private loginService:AuthService) { }

  ngOnInit(): void {
  }

  loginEmpresa(){
    let link = [''];
    this.loginService.loginEmpresa(this.empresa.correo,this.empresa.password).subscribe({
      next: (v:any) => {alert("Bienvenido!"),this.router.navigate(link),this.loginService.setToken(v.password),this.loginService.SetIdUser(v.idempresa)},
      error: (e:any) => {alert("El correo electronico ingresado o la contraseña no son correctos"),console.log(e)}
    });

  }

  registro() {
    let link = ['/registroEmpresa'];
    this.router.navigate(link);
  }

}
