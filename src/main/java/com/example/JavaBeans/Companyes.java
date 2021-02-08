package com.example.JavaBeans;

import java.sql.Date;

public class Companyes extends User {


    private long id, sold;
    private Date created;

    public Companyes(String name, String email, int sold , Date created) {
        this.name = name;
        this.sold = sold;
        this.setEmail(email);
        this.created  = created;
    }

    public Companyes(String name, String email ){
        this.name = name;
        this.setEmail(email);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getSold() {
        return sold;
    }

    public void setSold(long sold) {
        this.sold = sold;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Companyes(Integer sold, String name) {
        this.sold = sold;
        this.name = name;
    }

    public Companyes(Integer id, Integer sold, String name) {
        this.id = id;
        this.sold = sold;
        this.name = name;
    }

    public Companyes() {
    }


    public Companyes(String email, String password, Integer id, Integer sold, String name) {
        super(email, password);
        this.id = id;
        this.sold = sold;
        this.name = name;
    }

    public Companyes(Integer id, String email, String password, Integer id1, Integer sold, String name) {
        super(id, email, password);
        this.id = id1;
        this.sold = sold;
        this.name = name;
    }

    public Companyes(String firt_name, String last_name, String email, int sold) {
    }
}
