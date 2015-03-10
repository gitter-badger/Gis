package com.cursova.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Dima on 18.02.2015.
 */
@Entity
@Table(name = "dishes")
public class Dish  {

   Set<Product> products = new HashSet<>();
    Integer id_dishes;
    String name_dishes;
    double price_dishes;

    public Dish() {

    }

    public Dish(Set<Product> products, Integer id_dishes, String name_dishes, double price_dishes) {
        this.products = products;
        this.id_dishes = id_dishes;
        this.name_dishes = name_dishes;
        this.price_dishes = price_dishes;
    }

    @ManyToMany
    @JoinTable(name = "product")
    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    @Id
    @GeneratedValue
    public Integer getId_dishes() {
        return id_dishes;
    }

    public void setId_dishes(Integer id_dishes) {
        this.id_dishes = id_dishes;
    }

    public String getName_dishes() {
        return name_dishes;
    }

    public void setName_dishes(String name_dishes) {
        this.name_dishes = name_dishes;
    }

    public double getPrice_dishes() {
        return price_dishes;
    }

    public void setPrice_dishes(double price_dishes) {
        this.price_dishes = price_dishes;
    }
}
