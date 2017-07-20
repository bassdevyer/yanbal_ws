package com.movil.tesis.service;

import com.movil.tesis.dao.CodigosConsultoraDao;
import com.movil.tesis.dao.ConsultoraDao;
import com.movil.tesis.model.CodigosConsultora;
import com.movil.tesis.model.Consultora;

/**
 * Created by mac on 10/13/16.
 */
public class ConsultoraServiceImpl implements ConsultoraService {

    ConsultoraDao consultoraDao;
    CodigosConsultoraDao codigosConsultoraDao;

    public void setConsultoraDao(ConsultoraDao consultoraDao) {
        this.consultoraDao = consultoraDao;
    }

    public void setCodigosConsultoraDao(CodigosConsultoraDao codigosConsultoraDao) {
        this.codigosConsultoraDao = codigosConsultoraDao;
    }

    public Consultora findByUsernamePassword(String username, String password) throws Exception {
        return consultoraDao.getByUsernameAndPassword(username, password);
    }

    @Override
    public Consultora save(Consultora consultora, String securityCode) throws Exception {
        if (codigosConsultoraDao.getBySecurityCode(securityCode) != null) {
            codigosConsultoraDao.deleteSecurityCode(securityCode);
            return consultoraDao.save(consultora);
        }
        return null;
    }
}
