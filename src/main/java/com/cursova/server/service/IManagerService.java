package com.cursova.server.service;

import com.cursova.entity.Dish;
import com.cursova.entity.Order;
import com.cursova.entity.Product;
import com.cursova.entity.Recipes;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 * Created by Dima on 27.02.2015.
 */
public interface IManagerService extends Remote {

    public List<Dish> getDishes() throws RemoteException;

    public List<Recipes> getRecipe() throws RemoteException;

   // public void getProd(List<Product> products);  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

    public List<Order> getOrder() throws RemoteException;

}
