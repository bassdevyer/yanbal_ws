package com.movil.tesis.model;

import javax.persistence.*;

/**
 * Created by mac on 10/12/16.
 */
@Entity
@Table(name = "PEDIDOS_DETALLE", schema = "dbo", catalog = "yanbal")
public class PedidosDetalle {
    private int codigoPedidosDetalle;
    private int codigoPedidoCabecera;
    private String nombreProducto;
    private String descripcionProducto;
    private int cantidad;
    private double precio;
    private String estado;

    @Id
    @Column(name = "CODIGO_PEDIDOS_DETALLE")
    public int getCodigoPedidosDetalle() {
        return codigoPedidosDetalle;
    }

    public void setCodigoPedidosDetalle(int codigoPedidosDetalle) {
        this.codigoPedidosDetalle = codigoPedidosDetalle;
    }

    @Basic
    @Column(name = "CODIGO_PEDIDO_CABECERA")
    public int getCodigoPedidoCabecera() {
        return codigoPedidoCabecera;
    }

    public void setCodigoPedidoCabecera(int codigoPedidoCabecera) {
        this.codigoPedidoCabecera = codigoPedidoCabecera;
    }

    @Basic
    @Column(name = "NOMBRE_PRODUCTO")
    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    @Basic
    @Column(name = "DESCRIPCION_PRODUCTO")
    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    @Basic
    @Column(name = "CANTIDAD")
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Basic
    @Column(name = "PRECIO")
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
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

        PedidosDetalle that = (PedidosDetalle) o;

        if (codigoPedidosDetalle != that.codigoPedidosDetalle) return false;
        if (codigoPedidoCabecera != that.codigoPedidoCabecera) return false;
        if (cantidad != that.cantidad) return false;
        if (Double.compare(that.precio, precio) != 0) return false;
        if (nombreProducto != null ? !nombreProducto.equals(that.nombreProducto) : that.nombreProducto != null)
            return false;
        if (descripcionProducto != null ? !descripcionProducto.equals(that.descripcionProducto) : that.descripcionProducto != null)
            return false;
        if (estado != null ? !estado.equals(that.estado) : that.estado != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = codigoPedidosDetalle;
        result = 31 * result + codigoPedidoCabecera;
        result = 31 * result + (nombreProducto != null ? nombreProducto.hashCode() : 0);
        result = 31 * result + (descripcionProducto != null ? descripcionProducto.hashCode() : 0);
        result = 31 * result + cantidad;
        temp = Double.doubleToLongBits(precio);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        return result;
    }
}
