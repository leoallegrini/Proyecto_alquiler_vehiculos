package com.proyecto.proyecto_alquiler_vehiculos.models;

import org.springframework.format.annotation.DateTimeFormat;

public class Cliente {

    private String Nombre;
    private String Apellido;
    private DateTimeFormat FechaNacimiento;
    private String DNI;
    private String cuit;
    private String CorreoElectronico;
    private String Celular;
    private String Direccion;
    private String CodPostal;
    private String Nacionalidad;
    

    public Cliente() {
    }


    public Cliente(String nombre, String apellido, DateTimeFormat fechaNacimiento, String dni, String cuit,
            String correoElectronico, String celular, String direccion, String codPostal, String nacionalidad) {
        Nombre = nombre;
        Apellido = apellido;
        FechaNacimiento = fechaNacimiento;
        DNI = dni;
        this.cuit = cuit;
        CorreoElectronico = correoElectronico;
        Celular = celular;
        Direccion = direccion;
        CodPostal = codPostal;
        Nacionalidad = nacionalidad;
    }


    public String getNombre() {
        return Nombre;
    }


    public void setNombre(String nombre) {
        Nombre = nombre;
    }


    public String getApellido() {
        return Apellido;
    }


    public void setApellido(String apellido) {
        Apellido = apellido;
    }


    public DateTimeFormat getFechaNacimiento() {
        return FechaNacimiento;
    }


    public void setFechaNacimiento(DateTimeFormat fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }


    public String getDNI() {
        return DNI;
    }


    public void setDNI(String dni) {
        DNI = dni;
    }


    public String getCuit() {
        return cuit;
    }


    public void setCuit(String cuit) {
        this.cuit = cuit;
    }


    public String getCorreoElectronico() {
        return CorreoElectronico;
    }


    public void setCorreoElectronico(String correoElectronico) {
        CorreoElectronico = correoElectronico;
    }


    public String getCelular() {
        return Celular;
    }


    public void setCelular(String celular) {
        Celular = celular;
    }


    public String getDireccion() {
        return Direccion;
    }


    public void setDireccion(String direccion) {
        Direccion = direccion;
    }


    public String getCodPostal() {
        return CodPostal;
    }


    public void setCodPostal(String codPostal) {
        CodPostal = codPostal;
    }


    public String getNacionalidad() {
        return Nacionalidad;
    }


    public void setNacionalidad(String nacionalidad) {
        Nacionalidad = nacionalidad;
    }

    

}
