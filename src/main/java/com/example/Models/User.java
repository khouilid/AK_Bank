package com.example.Models;
import java.io.Serializable;

public class User implements Serializable {

    private Integer user_id;
    private String email;
    private String password;
    private Long account_number;
    private boolean status;
    private int cvc;

    public int getCvc() {
        return cvc;
    }

    public void setCvc(int cvc) {
        this.cvc = cvc;
    }



    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }



    public Long getAccount_number() {
        return account_number;
    }

    public void setAccount_number(Long account_number) {
        this.account_number = account_number;
    }


    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }


    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public User(Integer id, String email, String password) {
        this.user_id = id;
        this.email = email;
        this.password = password;
    }

    public User() {
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
