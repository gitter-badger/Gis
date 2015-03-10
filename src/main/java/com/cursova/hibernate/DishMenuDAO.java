package com.cursova.hibernate;

import com.cursova.entity.DishMenu;
import com.sun.xml.internal.ws.handler.HandlerException;
import org.hibernate.HibernateException;
import org.hibernate.Query;

/**
* Created by Dima on 05.03.2015.
*/
public class DishMenuDAO extends DAO {

        public void createDishMenu(String name_menu, int id_dish) throws Exception{
            try {
                begin();
                DishMenu dishMenu = new DishMenu(name_menu,id_dish);
                commit();
            }catch(HibernateException e){
                rollback();
                throw new Exception("Could not create Menu"+name_menu,e);
            }
        }


        public void getDishMenu(int id_dish )throws Exception{

            try{
                begin();
                Query q = getSession().createQuery("from DishMenu where id_dish = :id_dish");
                q.setString(id_dish,"id_dish");
                DishMenu dishMenu =(DishMenu) q.uniqueResult();
                commit();
            }catch(HibernateException e){
                rollback();
                throw new Exception("Could not get DishMenu:"+id_dish,e);
            }
        }


}
