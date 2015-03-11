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

    private int id;
    private String name;
    private double price;
    private Set<Product> products = new HashSet<>();

    public Dish() {
    }

    public Dish(Set<Product> products, Integer id, String name, double price) {
        this.products = products;
        this.id = id;
        this.name = name;
        this.price = price;
    }


    @Id
    @Column(columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id_dishes) {
        this.id = id_dishes;
    }

    @OneToMany
    @JoinTable(
            name="dishes_product",
            joinColumns = @JoinColumn( name="id_dishes" ),
            inverseJoinColumns = @JoinColumn( name="id_product" )
    )
    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name_dishes) {
        this.name = name_dishes;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price_dishes) {
        this.price = price_dishes;
    }

}
