package com.cursova.gui.controllers;

import com.cursova.entity.Product;
import com.cursova.hibernate.ProductDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Button;

import java.awt.*;
import java.awt.TextField;

/**
 * Created by Dima on 24.02.2015.
 */
public class MainStageController {

    public javafx.scene.control.TextField resultId;
    public javafx.scene.control.TextField inputNameProductId;
    public javafx.scene.control.TextField loginId;


//    public String name = "ab";

//    public void getProductAction(ActionEvent actionEvent) {
//
//        String name= inputNameProductId.getText();
//        try {
//            ProductDAO productDAO =new ProductDAO();
//            Product product = productDAO.getProd(name);
//           // System.out.println(product.getName());
//            resultId.setText(product.getName()+product.getPrice());
//           System.out.println( "Пользователь получен из базы данных. Имя: "
//                    + product.getName()+ " price product: " + product.getPrice());
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("Pizda rulu");
//        }
//    }

    public void loginAction(ActionEvent actionEvent) {


    }
}
