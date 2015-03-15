package com.cursova.DAO;

import com.cursova.DAO.impl.DAOImpl;
import com.cursova.entity.Dish;
import com.cursova.entity.Product;
import org.hibernate.HibernateException;
import org.hibernate.Query;

import java.util.List;
import java.util.Set;

/**
 * Created by Dima on 18.02.2015.
 */
public class DishesDAO extends DAOImpl<Dish> {

    @Override
    public Dish getById(int id) {
        return null;
    }

    @Override
    public List<Dish> getAll() {
        return null;
    }

}
