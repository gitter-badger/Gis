package com.cursova.hibernate;

import com.cursova.entity.Order;
import com.cursova.entity.Users;
import org.hibernate.HibernateException;
import org.hibernate.Query;

import javax.jws.soap.SOAPBinding;
import java.util.concurrent.ExecutionException;

/**
 * Created by Dima on 24.02.2015.
 */

public class UsresDAO extends DAO {

    public Users getUser(int id_user, String login, String pass, String fullname, String status )throws Exception {
        try {
            begin();
            Query q = getSession().createQuery("from Users where login= :login");
            commit();
            Users users = (Users) q.uniqueResult();
            return users;
        } catch (HibernateException e) {
            rollback();
           throw new Exception("Could not get user" + pass,e);
        }
    }

    public  Users createUser(int id_user, String login, String pass, String fullname, String status) throws Exception {
        try {
            begin();
            Users users = new Users(id_user, login, pass, fullname, status);
            commit();
            return users;
        } catch (HibernateException e) {
            rollback();
            throw new Exception("Could not create user" + login, e);
        }
    }

}
