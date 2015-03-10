package com.cursova.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Dima on 18.02.2015.
 */
@Entity
@Table(name = "recepe")
public class Recipes {

        int id_recipe;
        Dish dish;
        Set<Product> product = new HashSet<>();
        String description;

    public Recipes(int id_recipe, Dish dish, Set<Product> product, String description) {
        this.id_recipe = id_recipe;
        this.dish = dish;
        this.product = product;
        this.description = description;
    }

    public Recipes() {

    }


    @Id
    @GeneratedValue
    public int getId_recipe() {
        return id_recipe;
    }

    public void setId_recipe(int id_recipe) {
        this.id_recipe = id_recipe;
    }
    @ManyToOne
    @JoinTable(name = "dishes")
    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }
    @ManyToMany
    @JoinTable(name = "product")
    public Set<Product> getProduct() {
        return product;
    }

    public void setProduct(Set<Product> product) {
        this.product = product;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
