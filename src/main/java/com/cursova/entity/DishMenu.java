package com.cursova.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
* Created by Dima on 27.02.2015.
*/

@Entity
@Table(name = "menu")
public class DishMenu implements Serializable {

    public int id;
    public Set<Dish> dishes = new LinkedHashSet<>();
    public String name;

    public DishMenu() {
    }

    public DishMenu(Set<Dish> dishes, String name) {
        this.dishes = dishes;
        this.name = name;
    }

    public DishMenu(int id, Set<Dish> dishes, String name) {
        this.id = id;
        this.dishes = dishes;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name_menu) {
        this.name = name_menu;
    }

    @Id
    @Column(name="id", columnDefinition = "serial")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id_dish) {
        this.id = id_dish;
    }

    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name="menu_dishes",
            joinColumns = @JoinColumn( name = "id_menu" ),
            inverseJoinColumns = @JoinColumn( name = "id_dishes" )

    )
    public Set<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(Set<Dish> dishes) {
        this.dishes = dishes;
    }

    @Override
    public String toString() {
        return name;
    }
}
