package com.cursova.main;
import com.cursova.entity.Product;
import com.cursova.gui.MainStage;
import com.cursova.hibernate.ProductDAO;
import javafx.application.Application;
import javafx.stage.Stage;
import org.hibernate.Session;

/**
 * Created by Dima on 17.02.2015.
 */
public class MainApp extends Application{

    MainStage mainStage;

    public static void main(String []args) throws Exception {
//
//        try {
//            ProductDAO productDAO = new ProductDAO();
//            Product product = productDAO.createProduct(2,"Vasa",123.2,true);
//            System.out.println("product created :Name product : "
//                    + product.getName_product() + " price: " + product.getPrice_product());
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//
//      String name="ab";
//        try {
//            ProductDAO productDAO =new ProductDAO();
//            Product product = productDAO.getProd(name);
//            System.out.println(product.getName_product());
//           System.out.println( "Пользователь получен из базы данных. Имя: "
//                    + product.getName_product()+ " price product: " + product.getPrice_product());
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("Pizda rulu");
//        }
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        try {
            mainStage=new MainStage();
            mainStage.show();
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
