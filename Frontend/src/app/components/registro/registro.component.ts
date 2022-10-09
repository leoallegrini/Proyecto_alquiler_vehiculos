import { Cliente } from './../../interfaces/interfaces';
import { Component, OnInit } from '@angular/core';
import { AuthService } from 'src/app/services/auth.service';

@Component({
  selector: 'app-registro',
  templateUrl: './registro.component.html',
  styleUrls: ['./registro.component.css']
})
export class RegistroComponent implements OnInit {

  cliente:Cliente = new Cliente();

  constructor(private authorizationService:AuthService) { }

  ngOnInit(): void {
  }

  crearCliente(){
    this.authorizationService.registrarCliente(this.cliente).subscribe();

    alert("Su registro ha sido realizado con éxito ");
  }

  onSubmit(){
    this.crearCliente();
  }

}
