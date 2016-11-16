package com.movil.tesis.model;

import javax.persistence.*;

/**
 * Created by mac on 11/14/16.
 */
@Entity
public class Notificacion {
    private String idTelefono;
    private String identificacion;
    private String estado;
    private Consultora consultoraByIdentificacionConsultora;

    @Id
    @Column(name = "ID_TELEFONO", nullable = false, length = 255)
    public String getIdTelefono() {
        return idTelefono;
    }

    public void setIdTelefono(String idTelefono) {
        this.idTelefono = idTelefono;
    }

    @Basic
    @Column(name = "IDENTIFICACION", nullable = false, length = 15)
    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    @Basic
    @Column(name = "ESTADO", nullable = false, length = 1)
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

        Notificacion that = (Notificacion) o;

        if (idTelefono != null ? !idTelefono.equals(that.idTelefono) : that.idTelefono != null) return false;
        if (identificacion != null ? !identificacion.equals(that.identificacion) : that.identificacion != null)
            return false;
        if (estado != null ? !estado.equals(that.estado) : that.estado != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTelefono != null ? idTelefono.hashCode() : 0;
        result = 31 * result + (identificacion != null ? identificacion.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "IDENTIFICACION_CONSULTORA", referencedColumnName = "IDENTIFICACION_CONSULTORA", nullable = false)
    public Consultora getConsultoraByIdentificacionConsultora() {
        return consultoraByIdentificacionConsultora;
    }

    public void setConsultoraByIdentificacionConsultora(Consultora consultoraByIdentificacionConsultora) {
        this.consultoraByIdentificacionConsultora = consultoraByIdentificacionConsultora;
    }
}
