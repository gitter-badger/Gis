package com.cursova.client;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by roma on 27.03.15.
 */
public class Activity extends Stage {

    public Activity (String fxmlFile,String title){

        FXMLLoader loader = new FXMLLoader();
        Parent root = null;

        try {
            root = (Parent) loader.load(getClass().getResourceAsStream(fxmlFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene= new Scene(root);
        Stage secondStage = new Stage();
//        secondStage.setFullScreen(true);
        super.setScene(scene);
        super.setTitle(title);
    }
}