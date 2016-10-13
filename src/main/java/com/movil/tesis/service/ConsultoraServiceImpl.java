package com.movil.tesis.service;

import com.movil.tesis.dao.ConsultoraDao;
import com.movil.tesis.model.Consultora;

/**
 * Created by mac on 10/13/16.
 */
public class ConsultoraServiceImpl implements ConsultoraService {

    ConsultoraDao consultoraDao;

    public void setConsultoraDao(ConsultoraDao consultoraDao) {
        this.consultoraDao = consultoraDao;
    }

    public Consultora findByUsernamePassword(String username, String password) throws Exception {
        return consultoraDao.getByUsernameAndPassword(username, password);
    }

}
