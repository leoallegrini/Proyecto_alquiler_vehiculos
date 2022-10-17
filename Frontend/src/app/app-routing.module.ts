import { ModificarVehiculoComponent } from './components/modificar-vehiculo/modificar-vehiculo.component';
import { RegistrarAlquilerVehiculoComponent } from './registrar-alquiler-vehiculo/registrar-alquiler-vehiculo.component';
import { HomeComponent } from './home/home.component';
import { ListaVehiculosComponent } from './lista-vehiculos/lista-vehiculos.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './components/login/login.component';
import { RegistroComponent } from './components/registro/registro.component';
import { RegitroEmpresaComponent } from './components/regitro-empresa/regitro-empresa.component';
import { LoginEmpresaComponent } from './components/login-empresa/login-empresa.component';
import { VehiculosComponent } from './components/vehiculos/vehiculos.component';
import { EmpresaModificarComponent } from './components/empresa-modificar/empresa-modificar.component';

const routes: Routes = [
  {path : 'vehiculos', component:ListaVehiculosComponent},
  {path: 'ingresarvehiculo',component:VehiculosComponent},
  {path : '', component:HomeComponent},
  {path: 'registrar-alquiler/:id',component:RegistrarAlquilerVehiculoComponent},
  {path: 'login',component:LoginComponent},
  {path: 'registro',component:RegistroComponent},
  {path: 'registroEmpresa',component:RegitroEmpresaComponent},
  {path: 'loginEmpresa',component:LoginEmpresaComponent},
  {path: 'modificarEmpresa',component:EmpresaModificarComponent},
  {path: 'modificarVehiculo/:id',component:ModificarVehiculoComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
