//package com.example.repository;
//
//import com.example.JavaBeans.User;
//import com.example.Utiles.Connexion;
//
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public class Login {
//
//    public int log_in(User users) throws SQLException {
//        int id = 0;
//        //sql query
//        String sql = "SELECT id FROM users WHERE email= ? AND password= ?;";
//        //prepare the DB and put the vars
//        //TODO fix connection null
//        PreparedStatement stmt = Connexion.connect().prepareStatement(sql);
//        stmt.setString(1, users.getEmail());
//        stmt.setString(2, users.getPassword());
//        ResultSet rs = stmt.executeQuery();
//        // get result and return the id if there is a user the this infos
//        if (rs.next()) {
//            id = rs.getInt("id");
//        }
//        return id;
//    }
//
//
//
//}
