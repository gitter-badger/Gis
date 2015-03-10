package com.cursova.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
* Created by Dima on 27.02.2015.
*/
@Entity
@Table(name = "menu")
public class DishMenu {

    public int id_dish;

    public String name_menu;

    public DishMenu() {
    }

    public DishMenu(String name_menu, int id_dish) {
        this.name_menu = name_menu;
        this.id_dish = id_dish;
    }

    @Id
    @GeneratedValue
    public String getName_menu() {
        return name_menu;
    }

    public void setName_menu(String name_menu) {
        this.name_menu = name_menu;
    }

    public int getId_dish() {
        return id_dish;
    }

    public void setId_dish(int id_dish) {
        this.id_dish = id_dish;
    }


}
