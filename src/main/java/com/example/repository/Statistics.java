package com.example.repository;
import com.example.Utiles.Connexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Statistics {


    public static long[] totalPersonnalAccountsMoney(String tableName) {

        long[] data = new long[]{};
        try {
            String sql = "SELECT SUM(sold) AS sumSold, count(id) AS sumAccounts FROM " + tableName +";";
            PreparedStatement stmt = Connexion.connect().prepareStatement(sql);
            ResultSet rs =  stmt.executeQuery();
            if (rs.next()){
                data = new long[]{rs.getLong("sumSold"), rs.getLong("sumAccounts")};
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return data;
    }


}
