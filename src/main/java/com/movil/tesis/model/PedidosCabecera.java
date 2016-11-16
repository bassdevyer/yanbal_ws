package com.movil.tesis.model;


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

    @OneToMany(mappedBy = "codigoPedidosCabecera", cascade = {CascadeType.ALL})
    public Collection<PedidosDetalle> getPedidosDetalles() {
        return pedidosDetalles;
    }

    public void setPedidosDetalles(Collection<PedidosDetalle> pedidosDetallesByCodigoPedidoCabecera) {
        this.pedidosDetalles = pedidosDetallesByCodigoPedidoCabecera;
    }
}
