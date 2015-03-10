package com.cursova.server.service;

import com.cursova.entity.Dish;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 * Created by Dima on 27.02.2015.
 */
public interface IOperatorService extends Remote {

    public List<Dish> setDishes() throws RemoteException;

    public void setAddress() throws RemoteException;

    public void setPrice() throws RemoteException;

    public void setTime() throws RemoteException;

}
