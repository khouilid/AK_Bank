package com.example.repository;

import com.example.Tools.RandomGenerateur;
import com.example.Utiles.Connexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Users {

    public static int createNewUser(String email) throws SQLException {
        //sql query
        String sql = "INSERT INTO users(email, created, password , account_number, cvc) VALUES (?,?,?,?,?);";
        //prepare the DB and put the vars
        PreparedStatement stmt = Connexion.connect().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        stmt.setString(1, email);
        stmt.setDate(2, new java.sql.Date(System.currentTimeMillis()));
        String pwd = RandomGenerateur.RandomPassword(16);
        stmt.setString(3, pwd);

        //genrate unique Account number and cvc
        Long[] genarator = RandomGenerateur.RandomAccountNumber();
        stmt.setLong(4, genarator[0]);
        stmt.setLong(5, genarator[1]);
        //TODO fix
        // emailSender.sendMyMail( email ,  genarator[0],  genarator[1], pwd) ;
        stmt.executeUpdate();
         ResultSet rs =  stmt.getGeneratedKeys();
         if (rs.next()){
             return rs.getInt(1);
         }
        return 0;
    }

}
