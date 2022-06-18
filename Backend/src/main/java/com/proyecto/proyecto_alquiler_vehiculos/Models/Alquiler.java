package com.proyecto.proyecto_alquiler_vehiculos.models;

import org.springframework.format.annotation.DateTimeFormat;

public class Alquiler{

    private String Nombre;
    private String Apellido;
    //private DateTimeFormat FechaNacimiento;
    private String DNI;
    private String cuit;
    private String Email;
    private String Celular;
    private String Direccion;
    private String Nacionalidad;
    //private int ID;
    private String Marca;
    private String Modelo;
    private String Anio;
    //private String Patente;
    private String Tamanio;
    //private boolean Transmision;
    private String Categoria;
    //private Integer Precio_Alquiler;
    //private boolean Disponible;

    
    public Alquiler(String nombre, String apellido, String dNI, String cuit,
            String email, String celular, String direccion, String nacionalidad,
            String marca, String modelo, String anio, String tamanio,
            String categoria) {
        Nombre = nombre;
        Apellido = apellido;
        DNI = dNI;
        this.cuit = cuit;
        Email = email;
        Celular = celular;
        Direccion = direccion;
        Nacionalidad = nacionalidad;
        Marca = marca;
        Modelo = modelo;
        Anio = anio;
        Tamanio = tamanio;
        Categoria = categoria;
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


    public String getDNI() {
        return DNI;
    }


    public void setDNI(String dNI) {
        DNI = dNI;
    }


    public String getCuit() {
        return cuit;
    }


    public void setCuit(String cuit) {
        this.cuit = cuit;
    }


    public String getEmail() {
        return Email;
    }


    public void setEmail(String email) {
        Email = email;
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


    public String getNacionalidad() {
        return Nacionalidad;
    }


    public void setNacionalidad(String nacionalidad) {
        Nacionalidad = nacionalidad;
    }


    public String getMarca() {
        return Marca;
    }


    public void setMarca(String marca) {
        Marca = marca;
    }


    public String getModelo() {
        return Modelo;
    }


    public void setModelo(String modelo) {
        Modelo = modelo;
    }


    public String getAnio() {
        return Anio;
    }


    public void setAnio(String anio) {
        Anio = anio;
    }

    public String getTamanio() {
        return Tamanio;
    }


    public void setTamanio(String tamanio) {
        Tamanio = tamanio;
    }

    public String getCategoria() {
        return Categoria;
    }


    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

}
