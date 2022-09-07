package com.proyecto.proyecto_alquiler_vehiculos.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idempresa;
    
    private String nombreape;
    private String rznscial;
    private String cuit;
    private String celular;
    private boolean habilitado;

    private Empresa() {

    }

    public int getIdEmpresa() {
        return idempresa;
    }

    public void setIdEmpresa(int idempresa) {
        this.idempresa = idempresa;
    }

    public String getNombreApe() {
        return nombreape;
    }

    public void setNombreApe(String nombreape) {
        this.nombreape = nombreape;
    }

    public String getRznScial() {
        return rznscial;
    }

    public void setRznScial(String rznscial) {
        this.rznscial = rznscial;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

}
