package com.proyecto.proyecto_alquiler_vehiculos.models;


public class Alquiler{

    private Vehiculo Vehiculo;
    private Cliente Cliente;

    public Alquiler(){
        
    }
    

    public Vehiculo getVehiculo() {
        return Vehiculo;
    }


    public void setVehiculo(Vehiculo vehiculo) {
        Vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return Cliente;
    }


    public void setCliente(Cliente cliente) {
        Cliente = cliente;
    }
}
