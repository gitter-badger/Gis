package com.cursova.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Dima on 18.02.2015.
 */
@Entity
@Table(name = "recipe")
public class Recipes {

        private int id;
        private Dish dish;
        private Set<Product> product = new HashSet<>();
        private String description;

    public Recipes(int id, Dish dish, Set<Product> product, String description) {
        this.id = id;
        this.dish = dish;
        this.product = product;
        this.description = description;
    }

    public Recipes() {

    }

    @Id
    @Column(name="id", columnDefinition = "serial")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id_recipe) {
        this.id = id_recipe;
    }

    @OneToOne
    @JoinColumn(name = "id_dish")
    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    @ManyToMany
    @JoinTable(
            name="product_recipe",
            joinColumns = @JoinColumn( name="id_recipe" ),
            inverseJoinColumns = @JoinColumn( name="id_product" )
    )
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
