package com.proyecto.proyecto_alquiler_vehiculos.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vehiculoalquilado")
public class Alquiler {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idVehiculoAlquilado;
    
    private int idvehiculo;
    private int idcliente;
    private Date fechainicio;
    private Date fechafin;
    private boolean siniestro;
    private String detsiniestro;
    private float montosin;

    public Alquiler() {

    }

    public long getIdVehiculoAlquilado() {
        return idVehiculoAlquilado;
    }

    public void setIdVehiculoAlquilado(long idVehiculoAlquilado) {
        this.idVehiculoAlquilado = idVehiculoAlquilado;
    }

    public int getIdVehiculo() {
        return idvehiculo;
    }

    public void setIdVehiculo(int idvehiculo) {
        this.idvehiculo = idvehiculo;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public Date getFechaInicio() {
        return fechainicio;
    }

    public void setFechaInicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public Date getFechafin() {
        return fechafin;
    }

    public void setFechaFin(Date fechafin) {
        this.fechafin = fechafin;
    }

    public boolean isSiniestro() {
        return siniestro;
    }

    public void setSiniestro(boolean siniestro) {
        this.siniestro = siniestro;
    }

    public String getDetSiniestro() {
        return detsiniestro;
    }

    public void setDetSiniestro(String detsiniestro) {
        this.detsiniestro = detsiniestro;
    }

    public float getMontoSin() {
        return montosin;
    }

    public void setMontoSin(float montosin) {
        this.montosin = montosin;
    }

}
