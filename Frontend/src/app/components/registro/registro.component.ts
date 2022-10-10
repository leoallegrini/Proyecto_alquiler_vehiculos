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

  constructor(private router: Router,private authorizationService:AuthService) { }

  ngOnInit(): void {
  }

  crearCliente(){
    this.authorizationService.registrarCliente(this.cliente).subscribe();

    alert("Su registro ha sido realizado con éxito ");
    let link = [''];
    this.router.navigate(link);
  }

}
