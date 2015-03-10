package com.cursova.entity;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by Dima on 17.02.2015.
 */
@Entity
@Table(name = "product")
public class Product {

    private int id_product;
    private String  name_product ;
    private double price_product;
    private boolean in_stock;

    public Product() {
    }

    public Product(Integer id_product, String name_product, double price_product, boolean in_stock) {
        this.id_product = id_product;
        this.name_product = name_product;
        this.price_product = price_product;
        this.in_stock = in_stock;
    }

    @Id
    @GeneratedValue
    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }

    public String getName_product() {
        return name_product;
    }

    public void setName_product(String name_product) {
        this.name_product = name_product;
    }

    public double getPrice_product() {
        return price_product;
    }

    public void setPrice_product(double price_product) {
        this.price_product = price_product;
    }

    public boolean isIn_stock() {
        return in_stock;
    }

    public void setIn_stock(boolean in_stock) {
        this.in_stock = in_stock;
    }
}
