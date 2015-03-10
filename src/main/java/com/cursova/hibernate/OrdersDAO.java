package com.cursova.hibernate;

import com.cursova.entity.Dish;
import com.cursova.entity.Order;
import org.hibernate.HibernateException;
import org.hibernate.Query;

import java.sql.Date;
import java.util.Set;

/**
 * Created by Dima on 18.02.2015.
 */
public class OrdersDAO extends DAO {

    public Order createOrder(int id_order, Set<Dish> dishes, double sum_price, Date date) throws Exception{
        try {
            begin();
            Order order = new Order(id_order, dishes, sum_price, date);
            getSession().save(order);
            commit();
            return order;
        }catch (HibernateException e) {
            rollback();
            throw new Exception("Could not create order " , e);
        }
    }

    public Order getOrder(int id_order, int id_dishes, double sum_price, String date)throws Exception{
        try {
            begin();
            Query q = getSession().createQuery("from Order where id_order= :id_order");
            q.setString(id_order,"id_order");
            Order order =(Order) q.uniqueResult();
            commit();
            return order;
        }catch (HibernateException e) {
            rollback();
            throw new Exception("Could not create order " , e);
        }
    }

}





