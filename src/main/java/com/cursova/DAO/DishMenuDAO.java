package com.cursova.DAO;

import com.cursova.DAO.impl.DAOImpl;
import com.cursova.entity.DishMenu;
import org.hibernate.HibernateException;
import org.hibernate.Query;

import java.util.List;

/**
* Created by Dima on 05.03.2015.
*/
public class DishMenuDAO extends DAOImpl<DishMenu> {

    @Override
    protected Class returnClass() {
        return DishMenu.class;
    }

}
