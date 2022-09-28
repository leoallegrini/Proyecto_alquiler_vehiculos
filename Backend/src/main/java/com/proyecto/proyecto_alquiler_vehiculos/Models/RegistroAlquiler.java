package com.proyecto.proyecto_alquiler_vehiculos.models;

import java.sql.Date;

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
    private long id_vehiculo_alquilado;
    
    private int id_vehiculo;
    private int id_cliente;
    private Date fecha_inicio;
    private Date fecha_fin;
    private boolean siniestro;
    private String det_siniestro;
    private float monto_siniestro;

}
