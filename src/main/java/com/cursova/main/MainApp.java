package com.cursova.main;
import com.cursova.entity.Address;
import com.cursova.entity.Dish;
import com.cursova.entity.Product;
import com.cursova.gui.MainStage;
import com.cursova.hibernate.ProductDAO;
import com.cursova.persistence.HibernateUtil;
import javafx.application.Application;
import javafx.stage.Stage;
import org.hibernate.Session;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Dima on 17.02.2015.
 */
public class MainApp extends Application{

    MainStage mainStage;

    public static void main(String []args) throws Exception {

        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        Address address = new Address();
        address.setAddress("Kiev");
        address.setStatus("Cafe");
        session.save(address);


//        address.setIdAddress(2);
//        address.setAddress("Kieasdvw");
//        address.setStatus("asdasd1");
//
//        session.save(address);
//
//        List<Product> list = session.createCriteria(Product.class).list();
//        Dish dishes = (Dish) session.load(Dish.class, 4);
//        dishes.getProducts().forEach((a)->{
//            System.out.println(a.getName());
//        });
//        Set<Product> productSet = new HashSet<>();
//        list.forEach(productSet::add);
//
//        Dishes dishes = new Dishes();
//        dishes.setProduct(productSet);
//        dishes.setName("Ololod");
//        dishes.setPrice(123);
//
//        session.save(dishes);

        session.getTransaction().commit();

        session.close();

//
//        try {
//            ProductDAO productDAO = new ProductDAO();
//            Product product = productDAO.createProduct(2,"Vasa",123.2,true);
//            System.out.println("product created :Name product : "
//                    + product.getName() + " price: " + product.getPrice());
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//
//      String name="ab";
//        try {
//            ProductDAO productDAO =new ProductDAO();
//            Product product = productDAO.getProd(name);
//            System.out.println(product.getName());
//           System.out.println( "Пользователь получен из базы данных. Имя: "
//                    + product.getName()+ " price product: " + product.getPrice());
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("Pizda rulu");
//        }
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
