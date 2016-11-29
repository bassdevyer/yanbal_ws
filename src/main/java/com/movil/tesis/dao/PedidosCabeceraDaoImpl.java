package com.movil.tesis.dao;

import com.movil.tesis.model.Consultora;
import com.movil.tesis.model.PedidosCabecera;
import com.movil.tesis.model.PedidosDetalle;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

/**
 * Created by mac on 10/13/16.
 */
public class PedidosCabeceraDaoImpl implements PedidosCabeceraDao {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public PedidosCabecera save(PedidosCabecera order) throws Exception {
        Session session = sessionFactory.getCurrentSession();
        Integer newId = (Integer) session.save(order);
        if (newId != null) {
            return (PedidosCabecera) session.get(PedidosCabecera.class, newId);
        }
        return null;
    }

    @Override
    public List<PedidosCabecera> getConsolidatedOrders(String campaign, String week) throws Exception {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from PedidosCabecera where campana = :campaign and semana = :week");
        query.setParameter("campaign", campaign);
        query.setParameter("week", week);
        return (List<PedidosCabecera>) query.list();
    }

}
