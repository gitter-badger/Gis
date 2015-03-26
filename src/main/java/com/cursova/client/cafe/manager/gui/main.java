package com.cursova.client.cafe.manager.gui;

import com.esri.map.ArcGISTiledMapServiceLayer;
import com.esri.map.BingMapsLayer;
import com.esri.map.FXMap;
import com.esri.map.MapOptions;
import com.esri.runtime.ArcGISRuntime;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by roma on 22.03.15.
 */
public class main extends Application{

    FXMap map;
    ArcGISTiledMapServiceLayer tiledLayer;

    @Override
    public void start(Stage primaryStage) throws Exception {

        try {
            ArcGISRuntime.setInstallDirectory("/home/roma/arcgis/runtime_sdk/java10.2.4/");

            // Create an instance of the JavaFX Map component
            map = new FXMap();


            StackPane stackPane = new StackPane();
            stackPane.getChildren().add(map);

            Scene scene = new Scene(stackPane);

            primaryStage.setTitle("JavaFX Map");
            primaryStage.setWidth(1000);
            primaryStage.setHeight(700);
            primaryStage.setScene(scene);
            primaryStage.show();

            // Create a tiled map service layer with an ArcGIS Online map service URL
            tiledLayer = new ArcGISTiledMapServiceLayer(
                    "http://services.arcgisonline.com/arcgis/rest/services/World_Topo_Map/MapServer");



            // Add the layer to the list of layers in the map
            map.getLayerList().add(tiledLayer);


        } catch(Exception e) {
            // handle exception as desired, minimally report it to console
            e.printStackTrace();
        }

    }
}
