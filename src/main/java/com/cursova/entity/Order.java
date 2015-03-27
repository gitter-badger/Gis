package com.cursova.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Dima on 18.02.2015.
 */

@Entity
@javax.persistence.Table(name="orders")
public class Order implements Serializable {

    private int id;
    private Set<Dish> dishes = new LinkedHashSet<>();
    private double sum_price;
    private Date date;

    public Order() {

    }

    public Order(int id, Set<Dish> dishes, double sum_price, Date date) {
        this.id = id;
        this.dishes = dishes;
        this.sum_price = sum_price;
        this.date = date;
    }

    @Id
    @Column(columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @OneToMany
    @JoinTable(
            name="order_dishes",
            joinColumns = @JoinColumn( name="id_order" ),
            inverseJoinColumns = @JoinColumn( name="id_dish" )
    )
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
