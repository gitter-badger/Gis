package com.cursova.hibernate;

import com.cursova.entity.Address;
import org.hibernate.HibernateException;
import org.hibernate.Query;

/**
 * Created by Dima on 24.02.2015.
 */
public class AddressDAO extends DAO {

    public Address createAddress( int id_address, String address, String status) throws Exception{

        try {
            begin();
            Address addr = new Address(id_address, address, status);
            getSession().save(addr);
            commit();
            return addr;
        }catch (HibernateException e){
            rollback();
            throw new Exception("Could not create new Address",e);
        }
    }

    public Address getAddress(int id_address, String address, String status) throws Exception{
        try {
            begin();
            Query q = getSession().createQuery("from Address where id= :id_address");
            q.setString(id_address,"id_address");
            Address addr = (Address) q.uniqueResult();
            commit();
            return addr;

        }catch(HibernateException e){
            throw new Exception("Could not get address",e);
        }

    }

}
