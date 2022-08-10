package com.proyecto.proyecto_alquiler_vehiculos.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class GestorVehiculo {

    //Creacion de vehiculos
    Vehiculo automovil1 = new Vehiculo(1, "Toyota", "Corolla", "2022",
        "Mediano", "Automovil",
        true, 6500,
        "https://acroadtrip.blob.core.windows.net/catalogo-imagenes/l/RT_V_96df320cb38a4a258f20418527a3d5f7.jpg");
    Vehiculo automovil2 = new Vehiculo(2, "Toyota", "Etios", "2021",
        "chico","Automovil",true, 5000,
        "https://cdn.motor1.com/images/mgl/7OE4J/s1/lanzamiento-toyota-etios-platinum.webp" );
    Vehiculo automovil3 = new Vehiculo(3, "Toyota", "Hilux", "2019",
        "Grande","Pick-up",true,9000,
        "https://img.remediosdigitales.com/9171a3/toyota-hilux-2021-pick-up-precio-mexico_/450_1000.jpg");
    Vehiculo automovil4 = new Vehiculo(4, "Peugeot", "Partner", "2020", 
        "Mediano", "Utilitario", true, 6500, "https://cdn.motor1.com/images/mgl/QeWyjO/s1/lanzamiento-peugeot-partner-1.jpg" );
    Vehiculo automovil5 = new Vehiculo(5, "Chevrolet", "Spin",
        "2018", "Grande", "Automovil", true, 7500,
        "https://www.autoweb.com.ar/wp-content/uploads/2021/01/FGD_7793-1024x683.jpg" );



    public List<Vehiculo> Vehiculos() {
        
        List<Vehiculo> automoviles = new ArrayList<Vehiculo>();
        List<Vehiculo> automoviles_habilitados = new ArrayList<Vehiculo>();

        automoviles.add(automovil1);
        automoviles.add(automovil2);
        automoviles.add(automovil3);
        automoviles.add(automovil4);
        automoviles.add(automovil5);
        
        //Con esto desaparecen los vehiculos que ya estan alquilados
        for (Vehiculo vehiculos_habilitados : automoviles) {
            if(vehiculos_habilitados.isDisponible()){
                automoviles_habilitados.add(vehiculos_habilitados);
            }
        }

        return automoviles_habilitados;
    }


    public Vehiculo obtenerVehiculo(int id){
        Vehiculo vehiculoSeleccionado = new Vehiculo();
        for (Vehiculo vehiculo : Vehiculos()) {
            if(vehiculo.getID() == id){
                vehiculoSeleccionado = vehiculo;
            }
        }
        return vehiculoSeleccionado;
    }

    public Vehiculo actualizarVehiculo(int id){
        Vehiculo vehiculoSeleccionado = new Vehiculo();
        for (Vehiculo vehiculo : Vehiculos()) {
            if(vehiculo.getID() == id){
                vehiculoSeleccionado = vehiculo;
                vehiculoSeleccionado.setDisponible(false);
            }
        }
        return vehiculoSeleccionado;
    }


    public Alquiler registrarAlquiler(Alquiler alquiler){
        Alquiler nuevoAlquiler = new Alquiler();
        nuevoAlquiler.setVehiculo(alquiler.getVehiculo());
        nuevoAlquiler.setCliente(alquiler.getCliente());
        
        return nuevoAlquiler;
    }
    
}
