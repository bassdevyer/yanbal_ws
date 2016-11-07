package com.movil.tesis.dao;

import com.movil.tesis.model.Cliente;
import com.movil.tesis.model.Consultora;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by mac on 10/12/16.
 */
public interface ClienteDao {

    @Transactional
    Cliente save(Cliente cliente) throws Exception;

    @Transactional
    List<Cliente> getClients() throws Exception;

}
