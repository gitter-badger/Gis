package com.cursova.gui;

/**
 * Created by Dima on 24.02.2015.
 */

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class Activity extends Stage {

    public Activity (String fxmlFile,String title){
        FXMLLoader loader = new FXMLLoader();
        Parent root=null;

        try {
            root = (Parent) loader.load(getClass().getResourceAsStream(fxmlFile));

            Scene scene= new Scene(root);
            //scene.getStylesheets().add("/gui_fxml/style.css");
            Stage secondStage = new Stage();
            secondStage.setFullScreen(true);
            super.setScene(scene);

            super.setTitle(title);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}