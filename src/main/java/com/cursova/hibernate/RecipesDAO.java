package com.cursova.hibernate;

import com.cursova.entity.Dish;
import com.cursova.entity.Order;
import com.cursova.entity.Product;
import com.cursova.entity.Recipes;
import org.hibernate.HibernateException;
import org.hibernate.Query;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Set;

/**
 * Created by Dima on 18.02.2015.
 */

public class RecipesDAO extends DAO {

    public Recipes createRecipes(int id_recipe, Dish dish, Set<Product> product, String description) throws Exception {
            try {
                begin();
                Recipes recipe = new Recipes(id_recipe, dish, product, description);
                getSession().save(recipe);
                commit();
                return recipe;
            }catch (HibernateException e) {
                rollback();
                throw new Exception("Could not create recipe " , e);
            }
    }

    public Recipes getRecipes(int id_recipe) throws Exception{
        try {
            begin();
            Query q = getSession().createQuery("from Recipes where id_recipe = :id_recipe");
            q.setString(id_recipe,"id_recipe");
            Recipes recipe =(Recipes) q.uniqueResult();
            commit();
            return recipe;
        }catch (HibernateException e) {
            rollback();
            throw new Exception("Could not create order " , e);
        }
    }
}

