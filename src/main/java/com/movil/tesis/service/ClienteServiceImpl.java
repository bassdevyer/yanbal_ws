package com.movil.tesis.service;

import com.movil.tesis.dao.ClienteDao;
import com.movil.tesis.dao.ConsultoraDao;
import com.movil.tesis.model.Cliente;
import com.movil.tesis.model.Consultora;

import java.util.List;

/**
 * Created by mac on 10/13/16.
 */
public class ClienteServiceImpl implements ClienteService {

    ClienteDao clienteDao;

    public void setClienteDao(ClienteDao clienteDao) {
        this.clienteDao = clienteDao;
    }

    @Override
    public Cliente save(Cliente cliente) throws Exception {
        return clienteDao.save(cliente);
    }

    @Override
    public List<Cliente> getClients() throws Exception {
        return clienteDao.getClients();
    }
}
