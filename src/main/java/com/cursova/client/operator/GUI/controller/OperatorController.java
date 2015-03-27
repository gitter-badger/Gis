package com.cursova.client.operator.GUI.controller;

import com.cursova.client.operator.Operator;
import com.cursova.entity.Dish;
import com.cursova.entity.DishMenu;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.util.StringConverter;

import java.rmi.RemoteException;
import java.util.List;
import java.util.Set;

/**
 * Created by roma on 27.03.15.
 */
public class OperatorController {

    private List<DishMenu> menuList = Operator.getMenuList();

    @FXML
    private ComboBox<DishMenu> menuComboBox;

    @FXML
    private ListView<Dish> dishListView;

    @FXML
    private ListView<Dish> orderListView;


    @FXML
    private void initialize() {

        menuComboBox.getItems().addAll( menuList );
        menuComboBox.getSelectionModel().select(0);

        Set<Dish> dishList = menuList.get(0).getDishes();
        dishListView.getItems().addAll( dishList );

    }

    public void onClickAdd(ActionEvent actionEvent) {
        Dish dish = dishListView.getSelectionModel().getSelectedItem();
        orderListView.getItems().add(dish);
    }

    public void onClickToOrder(ActionEvent actionEvent) {
        System.out.println("onClickToOrder");
    }
}
