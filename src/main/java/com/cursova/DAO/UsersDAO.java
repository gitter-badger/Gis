package com.cursova.DAO;

import com.cursova.DAO.impl.DAOImpl;
import com.cursova.entity.Users;
import org.hibernate.HibernateException;
import org.hibernate.Query;

import java.util.List;

/**
 * Created by Dima on 24.02.2015.
 */

public class UsersDAO extends DAOImpl<Users> {

    @Override
    public Users getById(int id) {
        return null;
    }

    @Override
    public List<Users> getAll() {
        return null;
    }
}
