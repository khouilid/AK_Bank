package com.example.DAO;

import com.example.Models.Personne;
import com.example.Models.Users;

import java.sql.SQLException;

public interface PersonneDAO {



    boolean create(Personne user) throws SQLException;

    Users<Personne> getAll() throws SQLException;

    Personne getById(int user_id) throws SQLException;

    void update(Personne user);

    void delete(long user_id) throws SQLException;

}
