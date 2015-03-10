package com.cursova.entity;

import com.cursova.hibernate.DAO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Dima on 24.02.2015.
 */
@Entity
@Table(name = "users")
public class Users {

    int id_user;
    String login;
    String pass;
    String fullname;
    String status;

    public Users() {

    }

    public Users(int id_user, String login, String pass, String fullname, String status) {
        this.id_user = id_user;
        this.login = login;
        this.pass = pass;
        this.fullname = fullname;
        this.status = status;
    }

    @Id
    @GeneratedValue
    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
