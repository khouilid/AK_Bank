package com.example.repository;

import com.example.Utiles.Connexion;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Block_Unblock {
     //this method update the status of an account
    //with this two methods we can block an unblock spesific account
    public  void blockAccount(int user_id) throws SQLException {

        try {
            String sql = "UPDATE users SET status = true WHERE  id =?";
            PreparedStatement stmt = Connexion.connect().prepareStatement(sql);
            stmt.setInt(1, user_id);
            stmt.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public  void unblockAccount(int user_id) throws SQLException {

        try {
            String sql = "UPDATE users SET status = false WHERE  id =?";
            PreparedStatement stmt = Connexion.connect().prepareStatement(sql);
            stmt.setInt(1, user_id);
            stmt.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


}