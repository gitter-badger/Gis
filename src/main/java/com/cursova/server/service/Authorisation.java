package com.cursova.server.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Dima on 27.02.2015.
 */
public interface Authorisation extends Remote {

    public void authorisation(String login, String pass) throws RemoteException;



}
