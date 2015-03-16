package com.cursova.DAO;

import com.cursova.DAO.impl.DAOImpl;
import com.cursova.entity.Address;

/**
 * Created by Dima on 24.02.2015.
 */
public class AddressDAO extends DAOImpl<Address> {

    @Override
    protected Class returnClass() {
        return Address.class;
    }

}
