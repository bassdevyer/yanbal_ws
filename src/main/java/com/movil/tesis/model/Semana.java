package com.movil.tesis.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by mac on 10/12/16.
 */
@Entity
public class Semana {
    private int codSemana;
    private int codCampana;
    private String descripcionSemana;
    private String estadoSemana;

    @Id
    @Column(name = "COD_SEMANA")
    public int getCodSemana() {
        return codSemana;
    }

    public void setCodSemana(int codSemana) {
        this.codSemana = codSemana;
    }

    @Basic
    @Column(name = "COD_CAMPANA")
    public int getCodCampana() {
        return codCampana;
    }

    public void setCodCampana(int codCampana) {
        this.codCampana = codCampana;
    }

    @Basic
    @Column(name = "DESCRIPCION_SEMANA")
    public String getDescripcionSemana() {
        return descripcionSemana;
    }

    public void setDescripcionSemana(String descripcionSemana) {
        this.descripcionSemana = descripcionSemana;
    }

    @Basic
    @Column(name = "ESTADO_SEMANA")
    public String getEstadoSemana() {
        return estadoSemana;
    }

    public void setEstadoSemana(String estadoSemana) {
        this.estadoSemana = estadoSemana;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Semana semana = (Semana) o;

        if (codSemana != semana.codSemana) return false;
        if (codCampana != semana.codCampana) return false;
        if (descripcionSemana != null ? !descripcionSemana.equals(semana.descripcionSemana) : semana.descripcionSemana != null)
            return false;
        if (estadoSemana != null ? !estadoSemana.equals(semana.estadoSemana) : semana.estadoSemana != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codSemana;
        result = 31 * result + codCampana;
        result = 31 * result + (descripcionSemana != null ? descripcionSemana.hashCode() : 0);
        result = 31 * result + (estadoSemana != null ? estadoSemana.hashCode() : 0);
        return result;
    }
}
