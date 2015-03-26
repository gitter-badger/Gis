package com.cursova.server;

import com.cursova.server.service.OperatorService;

import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by roma on 16.12.14.
 */
public class MainApp {

    private static final int PORT = 8888;
    private static List<String> stubNameList = new LinkedList<>();
    private static Registry registry = null;

    public static void main(String[] args) throws RemoteException, AlreadyBoundException, InterruptedException, NotBoundException {

        //init Registry
        registry = LocateRegistry.createRegistry(PORT);

        registerNewStab(new OperatorService(),"Operator");

        //new thread for stop it " if user input "stop" "
        new Thread(()->{

            Scanner in = new Scanner(System.in);
            String command = in.nextLine();

            if (command.equals("stop"))
                stopServer();

        }).start();

    }

    private static <T extends Remote> void registerNewStab(T service, String stubName) throws RemoteException, AlreadyBoundException, InterruptedException, NotBoundException {
        Remote stub = UnicastRemoteObject.exportObject(service, 0);
        stubNameList.add(stubName);
        registry.bind(stubName, stub);
        System.out.println("bind: " + stubName);
    }

    private static void stopServer() {

        stubNameList.forEach((a)->{
            try {
                System.out.println("unbind :" + a);
                registry.unbind(a);
            } catch (RemoteException e) {
                e.printStackTrace();
            } catch (NotBoundException e) {
                e.printStackTrace();
            }
        });

        System.exit(1);

    }

}
