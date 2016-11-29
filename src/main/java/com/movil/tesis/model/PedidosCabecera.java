package com.movil.tesis.model;


import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by mac on 11/14/16.
 */
@Entity
@Table(name = "PEDIDOS_CABECERA", schema = "dbo", catalog = "yanbal")
public class PedidosCabecera {
    private int codigoPedidoCabecera;
    private String fechaCompra;
    private Consultora consultora;
    private Cliente cliente;
    private Collection<PedidosDetalle> pedidosDetalles;
    private String campana;
    private String semana;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_PEDIDO_CABECERA", nullable = false)
    public int getCodigoPedidoCabecera() {
        return codigoPedidoCabecera;
    }

    public void setCodigoPedidoCabecera(int codigoPedidoCabecera) {
        this.codigoPedidoCabecera = codigoPedidoCabecera;
    }

    @Basic
    @Column(name = "FECHA_COMPRA", nullable = false, length = 16)
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
        if (fechaCompra != null ? !fechaCompra.equals(that.fechaCompra) : that.fechaCompra != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codigoPedidoCabecera;
        result = 31 * result + (fechaCompra != null ? fechaCompra.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "IDENTIFICACION_CONSULTORA", referencedColumnName = "IDENTIFICACION_CONSULTORA", nullable = false)
    public Consultora getConsultora() {
        return consultora;
    }

    public void setConsultora(Consultora consultoraByIdentificacionConsultora) {
        this.consultora = consultoraByIdentificacionConsultora;
    }

    @ManyToOne
    @JoinColumn(name = "IDENTIFICACION_CLIENTE", referencedColumnName = "IDENTIFICACION_CLIENTE", nullable = false)
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente clienteByIdentificacionCliente) {
        this.cliente = clienteByIdentificacionCliente;
    }

    @OneToMany(fetch = FetchType.EAGER)
    @Cascade(value= {org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.DELETE})
    @JoinColumn(name="CODIGO_PEDIDO_CABECERA")
    public Collection<PedidosDetalle> getPedidosDetalles() {
        return pedidosDetalles;
    }

    public void setPedidosDetalles(Collection<PedidosDetalle> pedidosDetallesByCodigoPedidoCabecera) {
        this.pedidosDetalles = pedidosDetallesByCodigoPedidoCabecera;
    }

    @Basic
    @Column(name = "CAMPANA", nullable = true, length = 10)
    public String getCampana() {
        return campana;
    }

    public void setCampana(String campana) {
        this.campana = campana;
    }

    @Basic
    @Column(name = "SEMANA", nullable = true, length = 10)
    public String getSemana() {
        return semana;
    }

    public void setSemana(String semana) {
        this.semana = semana;
    }

}
