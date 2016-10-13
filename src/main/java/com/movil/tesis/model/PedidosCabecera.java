package com.movil.tesis.model;

import javax.persistence.*;

/**
 * Created by mac on 10/12/16.
 */
@Entity
@Table(name = "PEDIDOS_CABECERA", schema = "dbo", catalog = "yanbal")
public class PedidosCabecera {
    private int codigoPedidoCabecera;
    private String identificacionConsultora;
    private String identificacionCliente;
    private String fechaCompra;

    @Id
    @Column(name = "CODIGO_PEDIDO_CABECERA")
    public int getCodigoPedidoCabecera() {
        return codigoPedidoCabecera;
    }

    public void setCodigoPedidoCabecera(int codigoPedidoCabecera) {
        this.codigoPedidoCabecera = codigoPedidoCabecera;
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
    @Column(name = "IDENTIFICACION_CLIENTE")
    public String getIdentificacionCliente() {
        return identificacionCliente;
    }

    public void setIdentificacionCliente(String identificacionCliente) {
        this.identificacionCliente = identificacionCliente;
    }

    @Basic
    @Column(name = "FECHA_COMPRA")
    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PedidosCabecera that = (PedidosCabecera) o;

        if (codigoPedidoCabecera != that.codigoPedidoCabecera) return false;
        if (identificacionConsultora != null ? !identificacionConsultora.equals(that.identificacionConsultora) : that.identificacionConsultora != null)
            return false;
        if (identificacionCliente != null ? !identificacionCliente.equals(that.identificacionCliente) : that.identificacionCliente != null)
            return false;
        if (fechaCompra != null ? !fechaCompra.equals(that.fechaCompra) : that.fechaCompra != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codigoPedidoCabecera;
        result = 31 * result + (identificacionConsultora != null ? identificacionConsultora.hashCode() : 0);
        result = 31 * result + (identificacionCliente != null ? identificacionCliente.hashCode() : 0);
        result = 31 * result + (fechaCompra != null ? fechaCompra.hashCode() : 0);
        return result;
    }
}
