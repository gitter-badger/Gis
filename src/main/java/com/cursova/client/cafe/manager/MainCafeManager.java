package com.cursova.client.cafe.manager;

import com.cursova.server.service.IOperatorService;

import java.io.IOException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by roma on 21.03.15.
 */
public class MainCafeManager {

    public static void main(String[] args) throws Exception {

        final String HOST_NAME = "127.0.0.1";
        final int PORT = 8888;

        try {

            Registry registry = LocateRegistry.getRegistry(HOST_NAME, PORT);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
