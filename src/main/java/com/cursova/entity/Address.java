package com.cursova.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Dima on 24.02.2015.
 */
@Entity
@Table(name = "address")
public class Address implements Serializable{

    private int id;
    private String address;
    private String status;

    public Address(int id, String address, String status) {
        this.id = id;
        this.address = address;
        this.status = status;
    }

    public Address() {
    }

    public Address(String address, String status) {
        this.address = address;
        this.status = status;
    }

    @Id
    @Column(name = "id", columnDefinition = "serial")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id_address) {
        this.id = id_address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
