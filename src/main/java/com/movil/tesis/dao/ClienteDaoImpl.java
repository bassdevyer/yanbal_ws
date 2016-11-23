package com.movil.tesis.dao;

import com.movil.tesis.model.Cliente;
import com.movil.tesis.model.Consultora;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by mac on 10/13/16.
 */
public class ClienteDaoImpl implements ClienteDao {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Cliente save(Cliente cliente) throws Exception {
        Session session = sessionFactory.getCurrentSession();
        String newId = (String) session.save(cliente);
        if (newId != null) {
            return (Cliente) session.get(Cliente.class, newId);
        }
        return null;
    }

    @Override
    public List<Cliente> getClients(String consultantId) throws Exception {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Cliente where codConsultora = :consultantId");
        query.setParameter("consultantId", consultantId);
        return (List<Cliente>) query.list();
    }
}
