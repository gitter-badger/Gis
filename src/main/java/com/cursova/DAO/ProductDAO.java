package com.cursova.DAO;
import com.cursova.DAO.impl.DAOImpl;
import com.cursova.entity.Product;
import org.hibernate.HibernateException;
import org.hibernate.Query;

import java.util.List;


/**
 * Created by Dima on 17.02.2015.
 */
public class ProductDAO  extends DAOImpl<Product> {

    @Override
    public Product getById(int id) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}






