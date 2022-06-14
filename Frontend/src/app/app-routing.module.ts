import { RegistrarAlquilerVehiculoComponent } from './registrar-alquiler-vehiculo/registrar-alquiler-vehiculo.component';
import { HomeComponent } from './home/home.component';
import { AppComponent } from './app.component';
import { ListaVehiculosComponent } from './lista-vehiculos/lista-vehiculos.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {path : 'vehiculos', component:ListaVehiculosComponent},
  {path : '', component:HomeComponent},
  {path: 'registrar-alquiler/:id',component:RegistrarAlquilerVehiculoComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
