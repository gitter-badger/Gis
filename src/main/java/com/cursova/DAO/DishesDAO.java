package com.cursova.DAO;

import com.cursova.DAO.impl.DAOImpl;
import com.cursova.entity.Dish;


/**
 * Created by Dima on 18.02.2015.
 */
public class DishesDAO extends DAOImpl<Dish> {

    @Override
    protected Class returnClass() {
        return Dish.class;
    }

}
