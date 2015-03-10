package com.cursova.entity;

import javax.persistence.*;

/**
 * Created by Dima on 24.02.2015.
 */
@Entity
@Table(name = "address")
public class Address {

    int id_address;
    String address;
    String status;

    public Address(int id_address, String address, String status) {
        this.id_address = id_address;
        this.address = address;
        this.status = status;
    }

    public Address() {
    }

    @Id
    @GeneratedValue
    public int getId_address() {
        return id_address;
    }

    public void setId_address(int id_address) {
        this.id_address = id_address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String isStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
