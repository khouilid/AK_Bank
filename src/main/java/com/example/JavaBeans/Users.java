package com.example.JavaBeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

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
