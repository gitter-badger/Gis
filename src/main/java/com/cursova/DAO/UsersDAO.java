package com.cursova.DAO;

import com.cursova.DAO.impl.DAOImpl;
import com.cursova.entity.Users;

/**
 * Created by Dima on 24.02.2015.
 */

public class UsersDAO extends DAOImpl<Users> {

    @Override
    protected Class returnClass() {
        return Users.class;
    }

}
