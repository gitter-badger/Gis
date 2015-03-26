package com.cursova.server.service;

import com.cursova.entity.Address;
import com.cursova.entity.DishMenu;
import com.cursova.entity.Order;

import java.rmi.RemoteException;
import java.util.List;

/**
 * Created by roma on 26.03.15.
 */
public class OperatorService extends BaseService implements IOperatorService {

    @Override
    public List<DishMenu> getDishMenuList() throws RemoteException {
        return factoryDAO.getDishMenuDAO().getAll();
    }

    @Override
    public boolean setAddress(Address address) throws RemoteException {
        factoryDAO.getAddressDAO().add(address);
        return true;
    }

    @Override
    public boolean addNewOrder(Order order) throws RemoteException {
        factoryDAO.getOrdersDAO().add(order);
        return true;
    }

    @Override
    public String test() throws RemoteException {
        System.out.println("Test !!!!");
        return "Hello";
    }

}
