package com.movil.tesis.dao;

import com.movil.tesis.model.Cliente;
import com.movil.tesis.model.CodigosConsultora;
import org.apache.cxf.common.i18n.Exception;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by mac on 12/6/16.
 */
public class CodigosConsultoraDaoImpl implements CodigosConsultoraDao {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public CodigosConsultora getBySecurityCode(String securityCode) throws Exception {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from CodigosConsultora where securityCode = :securityCode");
        query.setParameter("securityCode", securityCode);
        return (CodigosConsultora) query.uniqueResult();
    }

    @Override
    public void deleteSecurityCode(String securityCode) throws Exception {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from CodigosConsultora where securityCode = :securityCode");
        query.setParameter("securityCode", securityCode);
        Object toDelete = query.uniqueResult();
        session.delete(toDelete);
    }


}
