package com.movil.tesis.dao;

import com.movil.tesis.model.CodigosConsultora;
import org.apache.cxf.common.i18n.Exception;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by mac on 12/6/16.
 */
public interface CodigosConsultoraDao {

    @Transactional
    CodigosConsultora getBySecurityCode(String securityCode) throws Exception;

    @Transactional
    void deleteSecurityCode(String securityCode) throws Exception;
}
