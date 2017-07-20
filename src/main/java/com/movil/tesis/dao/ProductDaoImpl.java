package com.movil.tesis.dao;

import com.movil.tesis.model.PedidosCabecera;
import com.movil.tesis.model.PedidosDetalle;
import com.movil.tesis.model.ProductosYanbal;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Created by mac on 10/31/16.
 */
public class ProductDaoImpl implements ProductDao {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public ProductosYanbal checkExistence(String code) throws Exception {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from ProductosYanbal where codigoRapido = :code and disponible = 1");
        query.setParameter("code", Integer.parseInt(code));
        return (ProductosYanbal) query.uniqueResult();
    }

    @Override
    public void decreaseBy(int id, int quantity) throws Exception {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from ProductosYanbal where codigoRapido=:code");
        query.setParameter("code", id);
        ProductosYanbal product = (ProductosYanbal) query.uniqueResult();
        if(product != null){
            int newStock = product.getStock() - quantity;
            if (newStock <= 0) {
                product.setDisponible(0);
            }
            product.setStock(product.getStock() - quantity);
            session.update(product);
        }
    }

}
