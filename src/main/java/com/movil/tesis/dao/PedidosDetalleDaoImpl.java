package com.movil.tesis.dao;

import com.movil.tesis.model.PedidosCabecera;
import com.movil.tesis.model.PedidosDetalle;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Created by mac on 10/13/16.
 */
public class PedidosDetalleDaoImpl implements PedidosDetalleDao {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public PedidosDetalle save(PedidosDetalle detail) throws Exception {
        Session session = sessionFactory.getCurrentSession();
        Integer newId = (Integer) session.save(detail);
        if (newId != null) {
            return (PedidosDetalle) session.get(PedidosCabecera.class, newId);
        }
        return null;
    }
}
