package com.movil.tesis.service;

import com.movil.tesis.dao.PedidosCabeceraDao;
import com.movil.tesis.dao.ProductDao;
import com.movil.tesis.model.PedidosCabecera;
import com.movil.tesis.model.PedidosDetalle;

import java.util.List;

/**
 * Created by mac on 11/15/16.
 */
public class PedidosCabeceraServiceImpl implements PedidosCabeceraService {

    PedidosCabeceraDao pedidosCabeceraDao;
    ProductDao productDao;

    public void setPedidosCabeceraDao(PedidosCabeceraDao pedidosCabeceraDao) {
        this.pedidosCabeceraDao = pedidosCabeceraDao;
    }

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    public PedidosCabecera registerOrder(PedidosCabecera order) throws Exception {
        for(PedidosDetalle detail : order.getPedidosDetalles()){
            productDao.decreaseBy(Integer.parseInt(detail.getNombreProducto()), detail.getCantidad());
        }
        return pedidosCabeceraDao.save(order);
    }

    @Override
    public List<PedidosCabecera> getConsolidatedOrders(String campaign, String week, String consultantId) throws Exception {
        return pedidosCabeceraDao.getConsolidatedOrders(campaign, week, consultantId);
    }
}
