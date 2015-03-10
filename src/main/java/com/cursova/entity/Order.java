package com.cursova.entity;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Dima on 18.02.2015.
 */

@Entity
@javax.persistence.Table(name="orders")
public class Order {

    int id_order;
    Set<Dish> dishes = new HashSet<>();
    double sum_price;
    java.sql.Date date;

    public Order() {

    }

    public Order(int id_order, Set<Dish> dishes, double sum_price, Date date) {
        this.id_order = id_order;
        this.dishes = dishes;
        this.sum_price = sum_price;
        this.date = date;
    }

    @Id
    @GeneratedValue
    public int getId_order() {
        return id_order;
    }

    public void setId_order(int id_order) {
        this.id_order = id_order;
    }

    @ManyToMany
    @JoinTable(name="dishes")
    public Set<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(Set<Dish> dishes) {
        this.dishes = dishes;
    }

    public double getSum_price() {
        return sum_price;
    }

    public void setSum_price(double sum_price) {
        this.sum_price = sum_price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
