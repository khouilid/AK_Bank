package com.example.repository;

import com.example.Tools.RandomInformations;
import com.example.Utiles.Connexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Users {

    public static int getUserID(String email) throws SQLException {
        String sql = "SELECT id FROM users WHERE email= ?";
        //prepare the DB and put the vars
        PreparedStatement stmt = Connexion.connect().prepareStatement(sql);
        stmt.setString(1, email);
        ResultSet rs = stmt.executeQuery();
        // get result and return the id if there is a user the this infos
        if (rs.next()) {
            return rs.getInt("id");
        }
        return 0;
    }

    public static void createNewUser(String email) throws SQLException {
        //sql query
        String sql = "INSERT INTO users(email, created, password , account_number) VALUES (?,?,?, ?);";
        //prepare the DB and put the vars
        PreparedStatement stmt = Connexion.connect().prepareStatement(sql);
        stmt.setString(1, email);
        stmt.setDate(2, new java.sql.Date(System.currentTimeMillis()));
        stmt.setString(3, RandomInformations.RandomPassword(16));
        stmt.setLong(4, RandomInformations.RandomAccountNumber()[0]);

        stmt.executeUpdate();
    }

}
