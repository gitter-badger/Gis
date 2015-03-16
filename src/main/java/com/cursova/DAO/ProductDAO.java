package com.cursova.DAO;

import com.cursova.DAO.impl.DAOImpl;
import com.cursova.entity.Product;



/**
 * Created by Dima on 17.02.2015.
 */
public class ProductDAO  extends DAOImpl<Product> {

    @Override
    protected Class returnClass() {
        return Product.class;
    }

}






