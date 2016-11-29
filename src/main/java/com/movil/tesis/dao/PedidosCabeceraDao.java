package com.movil.tesis.dao;

import com.movil.tesis.model.Consultora;
import com.movil.tesis.model.PedidosCabecera;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by mac on 10/12/16.
 */
public interface PedidosCabeceraDao {

    @Transactional
    PedidosCabecera save(PedidosCabecera order) throws Exception;

    @Transactional
    List<PedidosCabecera> getConsolidatedOrders(String campaign, String week) throws Exception;
}
