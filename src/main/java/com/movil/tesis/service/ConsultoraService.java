package com.movil.tesis.service;

import com.movil.tesis.model.Consultora;

/**
 * Created by mac on 10/13/16.
 */
public interface ConsultoraService {

    Consultora findByUsernamePassword(String username, String password) throws Exception;

}
