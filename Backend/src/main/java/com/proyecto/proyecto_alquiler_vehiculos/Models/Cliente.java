package com.proyecto.proyecto_alquiler_vehiculos.Models;

import org.springframework.format.annotation.DateTimeFormat;

public class Cliente {
    
    private String Username;
    private String Password;
    private DateTimeFormat FechaNacimiento;
    private String DNI;
    private String CorreoElectronico;
    private String Nombre;
    private String Apellido;
    private String Celular;
    private String Nacionalidad;

    
    public Cliente() {
    }



    public Cliente(String username, String password, DateTimeFormat fechaNacimiento, String dNI,
            String correoElectronico, String nombre, String apellido, String celular, String nacionalidad) {
        this.Username = username;
        this.Password = password;
        this.FechaNacimiento = fechaNacimiento;
        this.DNI = dNI;
        this.CorreoElectronico = correoElectronico;
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.Celular = celular;
        this.Nacionalidad = nacionalidad;
    }



    

    public String getUsername() {
        return Username;
    }
    public void setUsername(String username) {
        this.Username = username;
    }
    public String getPassword() {
        return Password;
    }
    public void setPassword(String password) {
        this.Password = password;
    }
    public DateTimeFormat getFechaNacimiento() {
        return FechaNacimiento;
    }
    public void setFechaNacimiento(DateTimeFormat fechaNacimiento) {
        this.FechaNacimiento = fechaNacimiento;
    }
    public String getDNI() {
        return DNI;
    }
    public void setDNI(String dNI) {
        this.DNI = dNI;
    }
    public String getCorreoElectronico() {
        return CorreoElectronico;
    }
    public void setCorreoElectronico(String correoElectronico) {
        this.CorreoElectronico = correoElectronico;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String apellido) {
        this.Apellido = apellido;
    }
    public String getCelular() {
        return Celular;
    }
    public void setCelular(String celular) {
        this.Celular = celular;
    }
    public String getNacionalidad() {
        return Nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        this.Nacionalidad = nacionalidad;
    }
}
