package com.cursova.entity;
import javax.persistence.*;

/**
 * Created by Dima on 17.02.2015.
 */
@Entity
@Table(name = "product")
public class Product {

    private int id;
    private String name;
    private double price;

    public Product() {
    }

    public Product(Integer id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Id
    @Column(columnDefinition = "serial")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id_product) {
        this.id = id_product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name_product) {
        this.name = name_product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price_product) {
        this.price = price_product;
    }

}
