package com.proyecto.proyecto_alquiler_vehiculos.models;

public class Vehiculo {

    private int ID;
    private String Marca;
    private String Modelo;
    private String Anio;
    private String Patente;
    private String Tamanio;
    private boolean Transmision;
    private String Categoria;
    private Integer Precio_Alquiler;
    private boolean Disponible;
    private String Imagen;

    public Vehiculo() {
    }

    public Vehiculo(int Id, String marca, String modelo, String anio,
            String tamanio, String categoria, Boolean disponible, Integer precio_Alquiler, String imagen) {
        this.ID = Id;
        this.Marca = marca;
        this.Modelo = modelo;
        this.Anio = anio;
        this.Tamanio = tamanio;
        this.Categoria = categoria;
        this.Disponible = disponible;
        this.Precio_Alquiler = precio_Alquiler;
        this.Imagen = imagen;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        this.Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        this.Modelo = modelo;
    }

    public String getAnio() {
        return Anio;
    }

    public void setAnio(String anio) {
        this.Anio = anio;
    }

    public String getPatente() {
        return Patente;
    }

    public void setPatente(String patente) {
        this.Patente = patente;
    }

    public String getTamanio() {
        return Tamanio;
    }

    public void setTamanio(String tamanio) {
        this.Tamanio = tamanio;
    }

    public boolean isTransmision() {
        return Transmision;
    }

    public void setTransmision(boolean transmision) {
        this.Transmision = transmision;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        this.Categoria = categoria;
    }

    public Integer getPrecio_Alquiler() {
        return Precio_Alquiler;
    }

    public void setPrecio_Alquiler(Integer precio_Alquiler) {
        this.Precio_Alquiler = precio_Alquiler;
    }

    public boolean isDisponible() {
        return Disponible;
    }

    public void setDisponible(boolean disponible) {
        this.Disponible = disponible;
    }

    public int getID() {
        return ID;
    }

    public void setID(int id) {
        this.ID = id;
    }

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String imagen) {
        this.Imagen = imagen;
    }
}
