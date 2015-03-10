package com.cursova.server.service;

import com.cursova.entity.Dish;
import com.cursova.entity.Order;
import com.cursova.entity.Product;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 * Created by Dima on 27.02.2015.
 */
public interface ISheafManagerService extends Remote {

    public List<Product> getProducts() throws RemoteException;
    public List<Dish> getDishes() throws RemoteException;
    public void addDishes() throws RemoteException;
    public void removeDishes() throws RemoteException;
    public void updateDishes() throws RemoteException;
    public List<Order> getOrders()throws RemoteException;
}
