package com.movil.tesis.service;

import com.movil.tesis.model.Cliente;

import java.util.List;

/**
 * Created by mac on 10/13/16.
 */
public interface ClienteService {

    Cliente save(Cliente cliente) throws Exception;

    List<Cliente> getClients() throws Exception;

}
