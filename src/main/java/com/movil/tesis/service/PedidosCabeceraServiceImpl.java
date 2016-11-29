package com.movil.tesis.service;

import com.movil.tesis.dao.PedidosCabeceraDao;
import com.movil.tesis.model.PedidosCabecera;

import java.util.List;

/**
 * Created by mac on 11/15/16.
 */
public class PedidosCabeceraServiceImpl implements PedidosCabeceraService {

    PedidosCabeceraDao pedidosCabeceraDao;

    public void setPedidosCabeceraDao(PedidosCabeceraDao pedidosCabeceraDao) {
        this.pedidosCabeceraDao = pedidosCabeceraDao;
    }

    public PedidosCabecera registerOrder(PedidosCabecera order) throws Exception {
        return pedidosCabeceraDao.save(order);
    }

    @Override
    public List<PedidosCabecera> getConsolidatedOrders(String campaign, String week) throws Exception {
        return pedidosCabeceraDao.getConsolidatedOrders(campaign, week);
    }
}
