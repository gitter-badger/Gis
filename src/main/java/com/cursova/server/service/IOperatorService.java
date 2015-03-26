package com.cursova.server.service;

import com.cursova.entity.Address;
import com.cursova.entity.Dish;
import com.cursova.entity.DishMenu;
import com.cursova.entity.Order;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 * Created by Dima on 27.02.2015.
 */
public interface IOperatorService extends Remote {

    public List<DishMenu> getDishMenuList() throws RemoteException;

    public boolean setAddress(Address address) throws RemoteException;

    public boolean addNewOrder(Order order) throws RemoteException;

    public String test() throws RemoteException;
}
