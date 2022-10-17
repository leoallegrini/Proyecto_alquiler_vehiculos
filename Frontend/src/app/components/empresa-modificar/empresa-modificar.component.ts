import { AuthService } from 'src/app/services/auth.service';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Empresa } from 'src/app/interfaces/interfaces';
import { EmpresaService } from 'src/app/services/empresa.service';

@Component({
  selector: 'app-empresa-modificar',
  templateUrl: './empresa-modificar.component.html',
  styleUrls: ['./empresa-modificar.component.css']
})
export class EmpresaModificarComponent implements OnInit {

  empresa:Empresa = new Empresa();
  empresaUtilizada:Empresa;

  constructor(private router: Router,private empresaService:EmpresaService,private loginService:AuthService) { }

  ngOnInit(): void {
    this.obtenerEmpresa();
  }

  private obtenerEmpresa() {
    this.empresa.idempresa = this.loginService.getIdUser();
    this.empresaService.obtenerEmpresa(this.empresa.idempresa).subscribe((dato) => {
      this.empresaUtilizada = dato;
    });
  }

  modificarEmpresa(){
    this.empresaService.actualizarEmpresa(this.empresa.idempresa,this.empresaUtilizada).subscribe();

    alert("Tus datos han sido modificados con exito!");
  }

}
