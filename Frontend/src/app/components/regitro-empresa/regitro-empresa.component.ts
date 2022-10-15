import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Empresa } from 'src/app/interfaces/interfaces';
import { AuthService } from 'src/app/services/auth.service';

@Component({
  selector: 'app-regitro-empresa',
  templateUrl: './regitro-empresa.component.html',
  styleUrls: ['./regitro-empresa.component.css']
})
export class RegitroEmpresaComponent implements OnInit {

  empresa:Empresa = new Empresa();

  constructor(private router: Router,private loginService:AuthService) { }

  ngOnInit(): void {
  }

  crearEmpresa(){
    this.loginService.registrarEmpresa(this.empresa).subscribe();

    alert("Su registro ha sido realizado con éxito ");
    let link = [''];
    this.loginService.loginEmpresa(this.empresa.correo,this.empresa.password).subscribe({
      next: (v:any) => {alert("Bienvenido!"),this.router.navigate(link),this.loginService.setToken(v.password),this.loginService.SetIdUser(v.idempresa),this.loginService.setIdRol(v.rol)},
      error: (e:any) => {alert("El correo electronico ingresado o la contraseña no son correctos"),console.log(e)}
    });
  }
}
