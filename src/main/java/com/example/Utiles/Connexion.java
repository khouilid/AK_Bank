package com.example.Utiles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {

    private static String user = "postgres";
    private static String password = "ABDO@raja@";
    private static String url = "jdbc:postgresql://localhost:5432/mybank";
    private static Connection conx;

    public static Connection connect() throws SQLException, SQLException {
        try {
            conx = DriverManager.getConnection(url, user, password);
        } catch (SQLException throwables) {
            System.out.println(throwables.getMessage());
        }
        return conx;
    }
}
