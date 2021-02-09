package com.example.Models;

import java.io.Serializable;
import java.util.ArrayList;

public class Users<T>  implements Serializable {

    private ArrayList<T> users = new ArrayList<>();

    public Users() {
    }

    public ArrayList<T> getUsers() {
        return users;
    }

    public void setUsers(T user) {
        users.add(user);
    }


}
