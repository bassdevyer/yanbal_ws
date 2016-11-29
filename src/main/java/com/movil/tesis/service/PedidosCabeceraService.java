package com.movil.tesis.service;

import com.movil.tesis.model.PedidosCabecera;

import java.util.List;

/**
 * Created by mac on 11/15/16.
 */
public interface PedidosCabeceraService {

    PedidosCabecera registerOrder(PedidosCabecera order) throws Exception;

    List<PedidosCabecera> getConsolidatedOrders(String campaign, String week) throws Exception;
}
