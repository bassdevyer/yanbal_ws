package com.movil.tesis.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by mac on 10/12/16.
 */
@Entity
public class Cliente {
    private String identificacionCliente;
    private String tipoIdentificacionCliente;
    private String nombresCliente;
    private String apellidosCliente;
    private String emailCliente;
    private String celularCliente;
    private String telefonoCliente;
    private String fechaNacimientoCliente;
    private String generoCliente;
    private String password;

    @Id
    @Column(name = "IDENTIFICACION_CLIENTE")
    public String getIdentificacionCliente() {
        return identificacionCliente;
    }

    public void setIdentificacionCliente(String identificacionCliente) {
        this.identificacionCliente = identificacionCliente;
    }

    @Basic
    @Column(name = "TIPO_IDENTIFICACION_CLIENTE")
    public String getTipoIdentificacionCliente() {
        return tipoIdentificacionCliente;
    }

    public void setTipoIdentificacionCliente(String tipoIdentificacionCliente) {
        this.tipoIdentificacionCliente = tipoIdentificacionCliente;
    }

    @Basic
    @Column(name = "NOMBRES_CLIENTE")
    public String getNombresCliente() {
        return nombresCliente;
    }

    public void setNombresCliente(String nombresCliente) {
        this.nombresCliente = nombresCliente;
    }

    @Basic
    @Column(name = "APELLIDOS_CLIENTE")
    public String getApellidosCliente() {
        return apellidosCliente;
    }

    public void setApellidosCliente(String apellidosCliente) {
        this.apellidosCliente = apellidosCliente;
    }

    @Basic
    @Column(name = "EMAIL_CLIENTE")
    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    @Basic
    @Column(name = "CELULAR_CLIENTE")
    public String getCelularCliente() {
        return celularCliente;
    }

    public void setCelularCliente(String celularCliente) {
        this.celularCliente = celularCliente;
    }

    @Basic
    @Column(name = "TELEFONO_CLIENTE")
    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    @Basic
    @Column(name = "FECHA_NACIMIENTO_CLIENTE")
    public String getFechaNacimientoCliente() {
        return fechaNacimientoCliente;
    }

    public void setFechaNacimientoCliente(String fechaNacimientoCliente) {
        this.fechaNacimientoCliente = fechaNacimientoCliente;
    }

    @Basic
    @Column(name = "GENERO_CLIENTE")
    public String getGeneroCliente() {
        return generoCliente;
    }

    public void setGeneroCliente(String generoCliente) {
        this.generoCliente = generoCliente;
    }

    @Basic
    @Column(name = "PASSWORD")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cliente cliente = (Cliente) o;

        if (identificacionCliente != null ? !identificacionCliente.equals(cliente.identificacionCliente) : cliente.identificacionCliente != null)
            return false;
        if (tipoIdentificacionCliente != null ? !tipoIdentificacionCliente.equals(cliente.tipoIdentificacionCliente) : cliente.tipoIdentificacionCliente != null)
            return false;
        if (nombresCliente != null ? !nombresCliente.equals(cliente.nombresCliente) : cliente.nombresCliente != null)
            return false;
        if (apellidosCliente != null ? !apellidosCliente.equals(cliente.apellidosCliente) : cliente.apellidosCliente != null)
            return false;
        if (emailCliente != null ? !emailCliente.equals(cliente.emailCliente) : cliente.emailCliente != null)
            return false;
        if (celularCliente != null ? !celularCliente.equals(cliente.celularCliente) : cliente.celularCliente != null)
            return false;
        if (telefonoCliente != null ? !telefonoCliente.equals(cliente.telefonoCliente) : cliente.telefonoCliente != null)
            return false;
        if (fechaNacimientoCliente != null ? !fechaNacimientoCliente.equals(cliente.fechaNacimientoCliente) : cliente.fechaNacimientoCliente != null)
            return false;
        if (generoCliente != null ? !generoCliente.equals(cliente.generoCliente) : cliente.generoCliente != null)
            return false;
        if (password != null ? !password.equals(cliente.password) : cliente.password != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = identificacionCliente != null ? identificacionCliente.hashCode() : 0;
        result = 31 * result + (tipoIdentificacionCliente != null ? tipoIdentificacionCliente.hashCode() : 0);
        result = 31 * result + (nombresCliente != null ? nombresCliente.hashCode() : 0);
        result = 31 * result + (apellidosCliente != null ? apellidosCliente.hashCode() : 0);
        result = 31 * result + (emailCliente != null ? emailCliente.hashCode() : 0);
        result = 31 * result + (celularCliente != null ? celularCliente.hashCode() : 0);
        result = 31 * result + (telefonoCliente != null ? telefonoCliente.hashCode() : 0);
        result = 31 * result + (fechaNacimientoCliente != null ? fechaNacimientoCliente.hashCode() : 0);
        result = 31 * result + (generoCliente != null ? generoCliente.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }
}
