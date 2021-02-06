package com.example.JavaBeans;

public class Personne extends User{
    private long id, sold;
    private String firt_name, last_name;


    public Personne(long id, String email, String password, long id1, long sold, String firt_name, String last_name) {
        super(id, email, password);
        this.id = id1;
        this.sold = sold;
        this.firt_name = firt_name;
        this.last_name = last_name;
    }


    public Personne(String email, String password, long id1, long sold, String firt_name, String last_name) {
        super(email, password);
        this.id = id1;
        this.sold = sold;
        this.firt_name = firt_name;
        this.last_name = last_name;
    }

    public Personne() {
    }
    public Personne(String email, String password) {
        super(email, password);
    }

    public Personne(String first_name, String last_name, String email, long sold) {
        this.firt_name = first_name;
        this.last_name = last_name;
        this.setEmail(email);
        this.sold = sold;

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

    public String getFirt_name() {
        return firt_name;
    }

    public void setFirt_name(String firt_name) {
        this.firt_name = firt_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}
