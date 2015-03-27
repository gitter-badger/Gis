package com.cursova.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Dima on 24.02.2015.
 */
@Entity
@Table(name = "users")
public class Users implements Serializable {

    private int id;
    private String login;
    private String password;
    private String fullName;
    private String status;

    public Users() {

    }

    public Users(int id, String login, String password, String fullName, String status) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.fullName = fullName;
        this.status = status;
    }

    public Users(String login, String password, String fullName, String status) {
        this.login = login;
        this.password = password;
        this.fullName = fullName;
        this.status = status;
    }

    @Id
    @Column(columnDefinition = "serial")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id_user) {
        this.id = id_user;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }

    @Column(name = "full_name")
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
