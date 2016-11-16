package com.movil.tesis.dao;

import com.movil.tesis.model.PedidosCabecera;
import com.movil.tesis.model.PedidosDetalle;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by mac on 10/12/16.
 */
public interface PedidosDetalleDao {

    @Transactional
    PedidosDetalle save(PedidosDetalle detail) throws Exception;

}
