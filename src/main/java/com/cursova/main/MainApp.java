package com.cursova.main;
import com.cursova.DAO.FactoryDAO;
import com.cursova.entity.Address;
import com.cursova.entity.Users;
import com.cursova.gui.MainStage;
import com.cursova.DAO.AddressDAO;
import com.cursova.persistence.HibernateUtil;
import com.cursova.persistence.SessionUtil;
import javafx.application.Application;
import javafx.stage.Stage;
import org.hibernate.Session;

/**
 * Created by Dima on 17.02.2015.
 */
public class MainApp extends Application{

    MainStage mainStage;

    public static void main(String []args) throws Exception {

        FactoryDAO factoryDAO = FactoryDAO.getInstance();

//        factoryDAO.getAddressDAO().addAddress(new Address("Odesa","Склад"));
//        System.out.println(factoryDAO.getAddressDAO().getById(4).getAddress());
//        HibernateUtil.shutdown();

//        factoryDAO.getAddressDAO().deleteAddress(new Address(1,"Kiev","Cafe"));

//        factoryDAO.getAddressDAO().getAllAddress().forEach((a)->{
//            System.out.println(a.getAddress());
//        });

//        System.out.println(factoryDAO.getAddressDAO().getById(2).getAddress());

//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Address address = (Address) session.load(Address.class,3);
//        session.close();
//        SessionUtil sessionUtil = new SessionUtil();
        factoryDAO.getUsersDAO().add(new Users("Sailor","gfhjkm","Ivan","Ololo"));
//        sessionUtil.close();
//        System.out.println(address.getAddress());
//        HibernateUtil.shutdown();
//        launch(args);
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
