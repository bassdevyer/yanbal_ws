package com.movil.tesis.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by mac on 10/12/16.
 */
@Entity
public class Campana {
    private int codCampana;
    private String descripcionCampana;
    private String estado;

    @Id
    @Column(name = "COD_CAMPANA")
    public int getCodCampana() {
        return codCampana;
    }

    public void setCodCampana(int codCampana) {
        this.codCampana = codCampana;
    }

    @Basic
    @Column(name = "DESCRIPCION_CAMPANA")
    public String getDescripcionCampana() {
        return descripcionCampana;
    }

    public void setDescripcionCampana(String descripcionCampana) {
        this.descripcionCampana = descripcionCampana;
    }

    @Basic
    @Column(name = "ESTADO")
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Campana campana = (Campana) o;

        if (codCampana != campana.codCampana) return false;
        if (descripcionCampana != null ? !descripcionCampana.equals(campana.descripcionCampana) : campana.descripcionCampana != null)
            return false;
        if (estado != null ? !estado.equals(campana.estado) : campana.estado != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codCampana;
        result = 31 * result + (descripcionCampana != null ? descripcionCampana.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        return result;
    }
}
