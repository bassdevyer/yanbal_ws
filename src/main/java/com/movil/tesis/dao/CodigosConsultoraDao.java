package com.movil.tesis.dao;

import com.movil.tesis.model.CodigosConsultora;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by mac on 12/6/16.
 */
public interface CodigosConsultoraDao {

    @Transactional
    CodigosConsultora getBySecurityCode(String securityCode) throws Exception;
}
