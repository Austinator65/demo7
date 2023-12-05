package com.example.demo7.model;


import jakarta.ejb.Remote;
import jakarta.ejb.Stateful;

import java.io.Serializable;

@Stateful
@Remote
public class User implements Serializable {
    String name;
    String lastname;

    public User(){

    }
    public User(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
