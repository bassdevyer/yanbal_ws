package com.movil.tesis.model;

import javax.persistence.*;

/**
 * Created by mac on 11/14/16.
 */
@Entity
public class Semana {
    private int codSemana;
    private String descripcionSemana;
    private String estadoSemana;
    private Campana campanaByCodCampana;

    @Id
    @Column(name = "COD_SEMANA", nullable = false)
    public int getCodSemana() {
        return codSemana;
    }

    public void setCodSemana(int codSemana) {
        this.codSemana = codSemana;
    }

    @Basic
    @Column(name = "DESCRIPCION_SEMANA", nullable = false, length = 255)
    public String getDescripcionSemana() {
        return descripcionSemana;
    }

    public void setDescripcionSemana(String descripcionSemana) {
        this.descripcionSemana = descripcionSemana;
    }

    @Basic
    @Column(name = "ESTADO_SEMANA", nullable = false, length = 1)
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
        if (descripcionSemana != null ? !descripcionSemana.equals(semana.descripcionSemana) : semana.descripcionSemana != null)
            return false;
        if (estadoSemana != null ? !estadoSemana.equals(semana.estadoSemana) : semana.estadoSemana != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codSemana;
        result = 31 * result + (descripcionSemana != null ? descripcionSemana.hashCode() : 0);
        result = 31 * result + (estadoSemana != null ? estadoSemana.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "COD_CAMPANA", referencedColumnName = "COD_CAMPANA", nullable = false)
    public Campana getCampanaByCodCampana() {
        return campanaByCodCampana;
    }

    public void setCampanaByCodCampana(Campana campanaByCodCampana) {
        this.campanaByCodCampana = campanaByCodCampana;
    }
}
