package com.movil.tesis.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by mac on 10/12/16.
 */
@Entity
public class Notificacion {
    private String idTelefono;
    private String identificacionConsultora;
    private String identificacion;
    private String estado;

    @Id
    @Column(name = "ID_TELEFONO")
    public String getIdTelefono() {
        return idTelefono;
    }

    public void setIdTelefono(String idTelefono) {
        this.idTelefono = idTelefono;
    }

    @Basic
    @Column(name = "IDENTIFICACION_CONSULTORA")
    public String getIdentificacionConsultora() {
        return identificacionConsultora;
    }

    public void setIdentificacionConsultora(String identificacionConsultora) {
        this.identificacionConsultora = identificacionConsultora;
    }

    @Basic
    @Column(name = "IDENTIFICACION")
    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
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

        Notificacion that = (Notificacion) o;

        if (idTelefono != null ? !idTelefono.equals(that.idTelefono) : that.idTelefono != null) return false;
        if (identificacionConsultora != null ? !identificacionConsultora.equals(that.identificacionConsultora) : that.identificacionConsultora != null)
            return false;
        if (identificacion != null ? !identificacion.equals(that.identificacion) : that.identificacion != null)
            return false;
        if (estado != null ? !estado.equals(that.estado) : that.estado != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTelefono != null ? idTelefono.hashCode() : 0;
        result = 31 * result + (identificacionConsultora != null ? identificacionConsultora.hashCode() : 0);
        result = 31 * result + (identificacion != null ? identificacion.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        return result;
    }
}
