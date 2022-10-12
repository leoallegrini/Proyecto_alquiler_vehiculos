package com.proyecto.proyecto_alquiler_vehiculos.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class RegistroAlquiler {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "idregistroalquiler")
    private Long idregistroalquiler;
    
    private int idvehiculo;
    private int idcliente;
    private Date fechainicio;
    private Date fechafin;
    private boolean siniestro;
    private String detsiniestro;
    private float montosin;

}
