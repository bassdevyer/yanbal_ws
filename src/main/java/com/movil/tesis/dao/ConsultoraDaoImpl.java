package com.movil.tesis.dao;

import com.movil.tesis.model.Consultora;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Created by mac on 10/13/16.
 */
public class ConsultoraDaoImpl implements ConsultoraDao {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Consultora getByUsernameAndPassword(String username, String password) throws Exception {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Consultora where emailConsultora = :username and password = :password");
        query.setParameter("username", username);
        query.setParameter("password", password);
        return (Consultora) query.uniqueResult();
    }
}
