export class Vehiculo {

  idvehiculo:number;
  marca:string;
  modelo:string;
  anio:string;
  disponible: boolean;
  precio_Alquiler:number;
  imagen:String;
  patente: string;
  tamanio: string;
  transmision:boolean;
  categoria: string;
}

export class Cliente {

  id: number;
  username: String;
  password: String;
  fechaNac: Date;
  email: String;
  nombre: String;
  apellido: String;
  dni: String;
  cuit: String;
  direccion: String;
  codpostal: String;
  celular: String;
  nacionalidad: String;
  fecharetiro: Date;

}

export class Alquiler {
  iD:number;
  marca:String;
  modelo:String;
  anio:String;
  disponible: boolean;
  precio_Alquiler:number;
  patente: String;
  tamanio: String;
  transmision:boolean;
  categoria: String;
  fechaRetiro: String;

  email: String;
  nombre: String;
  apellido: String;
  DNI: String;
  cuit: String;
  direccion: String;
  celular: String;
  nacionalidad: String;
  fechaNacimiento: String;
}
