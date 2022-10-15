import { Component } from '@angular/core';
import { AuthService } from './services/auth.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'RentalsVenado';

  constructor(private loginService:AuthService){

  }

  Logout(){
    this.loginService.clear();
  }

  estaLogueado(){
    return this.loginService.isLogged();
  }

  tipoUsuario(){
    return this.loginService.getIdRol();
  }


}
