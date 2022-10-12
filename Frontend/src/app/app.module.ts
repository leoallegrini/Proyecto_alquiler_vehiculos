import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListaVehiculosComponent } from './lista-vehiculos/lista-vehiculos.component';
import { HttpClientModule } from '@angular/common/http';
import { HomeComponent } from './home/home.component';
import { RegistrarAlquilerVehiculoComponent } from './registrar-alquiler-vehiculo/registrar-alquiler-vehiculo.component';
import { FormsModule } from '@angular/forms';
import { LoginComponent } from './components/login/login.component';
import { RegistroComponent } from './components/registro/registro.component';
import { RegitroEmpresaComponent } from './components/regitro-empresa/regitro-empresa.component';
import { LoginEmpresaComponent } from './components/login-empresa/login-empresa.component';

@NgModule({
  declarations: [
    AppComponent,
    ListaVehiculosComponent,
    HomeComponent,
    RegistrarAlquilerVehiculoComponent,
    LoginComponent,
    RegistroComponent,
    RegitroEmpresaComponent,
    LoginEmpresaComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
