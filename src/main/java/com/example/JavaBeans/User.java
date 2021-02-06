package com.example.JavaBeans;

import java.io.Serializable;

public class User   implements Serializable {

    private long user_id;
    private String email;
    private String password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public User(long id, String email, String password) {
        this.user_id = id;
        this.email = email;
        this.password = password;
    }

    public User() {
    }

    public long getUser_idId() {
        return user_id;
    }

    public void setId(int id) {
        this.user_id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
