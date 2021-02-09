package com.example.Models;

public class Personne extends User implements Comparable<Personne>{
    private Integer id, sold;
    private String firt_name, last_name;
    private String created;

    public Personne(String email, String firt_name, String last_name) {
        this.setEmail(email);
        this.firt_name = firt_name;
        this.last_name = last_name;
    }

    public Personne() {

    }


    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public Personne(String first_name, String last_name, String email, Integer sold, Long accountNumber) {
        this.firt_name = first_name;
        this.last_name = last_name;
        this.setEmail(email);
        this.sold = sold;
        this.setAccount_number(accountNumber);



    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSold() {
        return sold;
    }

    public void setSold(Integer sold) {
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


    @Override
    public int compareTo(Personne personne) {
        Integer id1 = Math.toIntExact(this.getSold());
        return id1.compareTo(personne.getSold());
    }
}
