package com.movil.tesis.model;

import javax.persistence.*;

/**
 * Created by mac on 10/12/16.
 */
@Entity
public class Consultora {
    private String identificacionConsultora;
    private String tipoIdentificacionConsultora;
    private String nombresConsultora;
    private String apellidosConsultora;
    private String emailConsultora;
    private String celularConsultora;
    private String telefonoConsultora;
    private String fechaNacimientoConsultora;
    private String generoConsultora;
    private String password;

    @Id
    @Column(name = "IDENTIFICACION_CONSULTORA")
    public String getIdentificacionConsultora() {
        return identificacionConsultora;
    }

    public void setIdentificacionConsultora(String identificacionConsultora) {
        this.identificacionConsultora = identificacionConsultora;
    }

    @Basic
    @Column(name = "TIPO_IDENTIFICACION_CONSULTORA")
    public String getTipoIdentificacionConsultora() {
        return tipoIdentificacionConsultora;
    }

    public void setTipoIdentificacionConsultora(String tipoIdentificacionConsultora) {
        this.tipoIdentificacionConsultora = tipoIdentificacionConsultora;
    }

    @Basic
    @Column(name = "NOMBRES_CONSULTORA")
    public String getNombresConsultora() {
        return nombresConsultora;
    }

    public void setNombresConsultora(String nombresConsultora) {
        this.nombresConsultora = nombresConsultora;
    }

    @Basic
    @Column(name = "APELLIDOS_CONSULTORA")
    public String getApellidosConsultora() {
        return apellidosConsultora;
    }

    public void setApellidosConsultora(String apellidosConsultora) {
        this.apellidosConsultora = apellidosConsultora;
    }

    @Basic
    @Column(name = "EMAIL_CONSULTORA")
    public String getEmailConsultora() {
        return emailConsultora;
    }

    public void setEmailConsultora(String emailConsultora) {
        this.emailConsultora = emailConsultora;
    }

    @Basic
    @Column(name = "CELULAR_CONSULTORA")
    public String getCelularConsultora() {
        return celularConsultora;
    }

    public void setCelularConsultora(String celularConsultora) {
        this.celularConsultora = celularConsultora;
    }

    @Basic
    @Column(name = "TELEFONO_CONSULTORA")
    public String getTelefonoConsultora() {
        return telefonoConsultora;
    }

    public void setTelefonoConsultora(String telefonoConsultora) {
        this.telefonoConsultora = telefonoConsultora;
    }

    @Basic
    @Column(name = "FECHA_NACIMIENTO_CONSULTORA")
    public String getFechaNacimientoConsultora() {
        return fechaNacimientoConsultora;
    }

    public void setFechaNacimientoConsultora(String fechaNacimientoConsultora) {
        this.fechaNacimientoConsultora = fechaNacimientoConsultora;
    }

    @Basic
    @Column(name = "GENERO_CONSULTORA")
    public String getGeneroConsultora() {
        return generoConsultora;
    }

    public void setGeneroConsultora(String generoConsultora) {
        this.generoConsultora = generoConsultora;
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

        Consultora that = (Consultora) o;

        if (identificacionConsultora != null ? !identificacionConsultora.equals(that.identificacionConsultora) : that.identificacionConsultora != null)
            return false;
        if (tipoIdentificacionConsultora != null ? !tipoIdentificacionConsultora.equals(that.tipoIdentificacionConsultora) : that.tipoIdentificacionConsultora != null)
            return false;
        if (nombresConsultora != null ? !nombresConsultora.equals(that.nombresConsultora) : that.nombresConsultora != null)
            return false;
        if (apellidosConsultora != null ? !apellidosConsultora.equals(that.apellidosConsultora) : that.apellidosConsultora != null)
            return false;
        if (emailConsultora != null ? !emailConsultora.equals(that.emailConsultora) : that.emailConsultora != null)
            return false;
        if (celularConsultora != null ? !celularConsultora.equals(that.celularConsultora) : that.celularConsultora != null)
            return false;
        if (telefonoConsultora != null ? !telefonoConsultora.equals(that.telefonoConsultora) : that.telefonoConsultora != null)
            return false;
        if (fechaNacimientoConsultora != null ? !fechaNacimientoConsultora.equals(that.fechaNacimientoConsultora) : that.fechaNacimientoConsultora != null)
            return false;
        if (generoConsultora != null ? !generoConsultora.equals(that.generoConsultora) : that.generoConsultora != null)
            return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = identificacionConsultora != null ? identificacionConsultora.hashCode() : 0;
        result = 31 * result + (tipoIdentificacionConsultora != null ? tipoIdentificacionConsultora.hashCode() : 0);
        result = 31 * result + (nombresConsultora != null ? nombresConsultora.hashCode() : 0);
        result = 31 * result + (apellidosConsultora != null ? apellidosConsultora.hashCode() : 0);
        result = 31 * result + (emailConsultora != null ? emailConsultora.hashCode() : 0);
        result = 31 * result + (celularConsultora != null ? celularConsultora.hashCode() : 0);
        result = 31 * result + (telefonoConsultora != null ? telefonoConsultora.hashCode() : 0);
        result = 31 * result + (fechaNacimientoConsultora != null ? fechaNacimientoConsultora.hashCode() : 0);
        result = 31 * result + (generoConsultora != null ? generoConsultora.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }
}
