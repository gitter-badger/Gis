package com.cursova.main;
import com.cursova.DAO.FactoryDAO;
import com.cursova.entity.*;
import com.cursova.gui.MainStage;
import com.cursova.DAO.AddressDAO;
import com.cursova.persistence.HibernateUtil;
import com.cursova.persistence.SessionUtil;
import javafx.application.Application;
import javafx.stage.Stage;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Dima on 17.02.2015.
 */
public class MainApp extends Application{

    MainStage mainStage;

    public static void main(String []args) throws Exception {

        FactoryDAO factoryDAO = FactoryDAO.getInstance();

        DishMenu dishMenu = factoryDAO.getDishMenuDAO().getAll().get(0);
        dishMenu.getDishes().forEach(System.out::println);




    }

    @Override
    public void start(Stage primaryStage){
        try {
            mainStage = new MainStage();
            mainStage.show();
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
