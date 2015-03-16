package com.cursova.DAO;

import com.cursova.DAO.impl.DAOImpl;
import com.cursova.entity.Recipes;

/**
 * Created by Dima on 18.02.2015.
 */

public class RecipesDAO extends DAOImpl<Recipes> {

    @Override
    protected Class returnClass() {
        return Recipes.class;
    }

}

