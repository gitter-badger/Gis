package com.cursova.client.operator;

import com.cursova.client.Activity;
import com.cursova.entity.DishMenu;
import com.cursova.server.service.IOperatorService;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;

/**
 * Created by roma on 27.03.15.
 */
public class Operator extends Application{

    private static IOperatorService operatorService = null;
    private static List<DishMenu> menuList;

    public static void main(String[] args) throws Exception {

        final String HOST_NAME = "127.0.0.1";
        final int PORT = 8888;

        Registry registry = LocateRegistry.getRegistry(HOST_NAME, PORT);
        operatorService = (IOperatorService) registry.lookup("Operator");

        //init menuList
        menuList = operatorService.getDishMenuList();

        launch(args);
    }

//    public static IOperatorService getOperatorService() {
//        return operatorService;
//    }


    public static List<DishMenu> getMenuList() {
        return menuList;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        new Activity("/fxml/operator.fxml","Operator").show();
    }
}
