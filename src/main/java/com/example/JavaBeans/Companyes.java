package com.example.JavaBeans;

public class Companyes extends User {


    private long id, sold;
    private String name;

    public Companyes(long sold, String name) {
        this.sold = sold;
        this.name = name;
    }

    public Companyes(long id, long sold, String name) {
        this.id = id;
        this.sold = sold;
        this.name = name;
    }

    public Companyes() {
    }


    public Companyes(String email, String password, long id, long sold, String name) {
        super(email, password);
        this.id = id;
        this.sold = sold;
        this.name = name;
    }

    public Companyes(long id, String email, String password, long id1, long sold, String name) {
        super(id, email, password);
        this.id = id1;
        this.sold = sold;
        this.name = name;
    }
}
