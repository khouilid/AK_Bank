package com.example.repository;

import com.example.Utiles.Connexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class isEXISTE_AccountNumber {



    public static boolean isExist(Long account_number) throws SQLException {
        //sql query
        String sql = "SELECT COUNT(*) AS c FROM users WHERE account_number = ?;";
        //prepare the DB and put the vars
        PreparedStatement stmt = Connexion.connect().prepareStatement(sql);
        stmt.setLong(1, account_number);
        ResultSet rs = stmt.executeQuery();
        // get result and return the id if there is a user the this infos
        if (rs.next()) {
            if (rs.getInt("c") == 0){
                return false;
            }
        }
        return true;
    }
}
