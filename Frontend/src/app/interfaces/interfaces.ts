export class Vehiculo {

  idvehiculo:number;
  idempresa:number;
  marca:string;
  modelo:string;
  anio:string;
  disponible: boolean;
  precioalquiler:number;
  imagen:String;
  patente: string;
  tamanio: string;
  transmision:boolean;
  categoria: string;
}

export class Cliente {

  nombre:String;
  apellido:String;
  dni:String;
  cuit:String;
  correo:String;
  fechanac:Date;
  celular:String;
  direccion:String;
  codpostal:String;
  nacionalidad:String;
  password:String;
  rol:number;

}

export class Alquiler {
  idregistro:number;
  idcliente:number;
  idvehiculo:number;
  fechainicio:Date;
  fechafin:Date;
}

export class Empresa {
  nombre:String;
  apellido:String;
  razonsocial:String;
  cuit:number;
  celular:number;
  habilitado:boolean;
  correo:String;
  password:String;
}
