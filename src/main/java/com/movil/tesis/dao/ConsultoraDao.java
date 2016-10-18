package com.movil.tesis.dao;

import com.movil.tesis.model.Consultora;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by mac on 10/12/16.
 */
public interface ConsultoraDao {

    @Transactional
    Consultora getByUsernameAndPassword(String username, String password) throws Exception;

    @Transactional
    Consultora save(Consultora consultora) throws Exception;

}
