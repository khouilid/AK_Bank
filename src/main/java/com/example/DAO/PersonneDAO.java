package com.example.DAO;

import com.example.JavaBeans.Personne;
import com.example.JavaBeans.Users;

import java.sql.SQLException;

public interface PersonneDAO {



    void create(Personne user);

    Users<Personne> getAll() throws SQLException;

    Users<Personne> getById();

    void update(Personne user);

    void delete(long user_id);

}
