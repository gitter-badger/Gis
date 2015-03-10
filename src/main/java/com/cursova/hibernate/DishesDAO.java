package com.cursova.hibernate;

import com.cursova.entity.Dish;
import com.cursova.entity.Product;
import org.hibernate.HibernateException;
import org.hibernate.Query;

import java.util.Set;

/**
 * Created by Dima on 18.02.2015.
 */
public class DishesDAO extends DAO {

    public Dish createDishes(Product product, Integer id_dishes, String name_dishes, double price_dishes) throws Exception {
        try {
            begin();
            Dish dish = new Dish((Set<Product>) product, id_dishes, name_dishes, price_dishes);
            getSession().save(dish);
            commit();
            return dish;
        }catch (HibernateException e){
            rollback();
            throw new Exception("Could not create dishes",e);
        }
    }

    public Dish getDishes(Integer id_product, Integer id_dishes, String name_dishes, double price_dishes) throws Exception{
        try {
            begin();
            Query q = getSession().createQuery("from Dish where name_dishes = :name_dishes");
            q.setString("name_dishes",name_dishes);
            Dish dish = (Dish) q.uniqueResult();
            commit();
            return dish;
        }catch (HibernateException e){
            rollback();
            throw new Exception ("Could not get dishes" + name_dishes,e);
        }
    }



}
