package com.cursova.DAO;

import com.cursova.DAO.impl.DAOImpl;
import com.cursova.entity.Dish;
import com.cursova.entity.Order;
import org.hibernate.HibernateException;
import org.hibernate.Query;

import java.sql.Date;
import java.util.List;
import java.util.Set;

/**
 * Created by Dima on 18.02.2015.
 */
public class OrdersDAO extends DAOImpl<Order> {

    @Override
    protected Class returnClass() {
        return Order.class;
    }

}





