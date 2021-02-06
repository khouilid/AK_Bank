package com.example.DAO;

import com.example.JavaBeans.Personne;
import com.example.JavaBeans.Users;
import com.example.Utiles.Connexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonneDAOImlp implements PersonneDAO {
    @Override
    public void create(Personne user) {

    }
    @Override
    public Users<Personne> getAll() throws SQLException {
        Users<Personne> users = new Users<>();
        //sql query
        String sql = "SELECT p.firt_name, p.last_name,u.email,p.sold FROM personnes p LEFT JOIN users u ON p.user_id = u.id;";
        //prepare the DB and put the vars
        PreparedStatement stmt = Connexion.connect().prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        // get result and return the id if there is a user the this infos
        while (rs.next()) {
            users.setUsers(new Personne(rs.getString("firt_name"), rs.getString("last_name"), rs.getString("email"), rs.getLong("sold")));
        }
        return users;
    }

    @Override
    public Users<Personne> getById() {
        return null;
    }

    @Override
    public void update(Personne user) {

    }

    @Override
    public void delete(long user_id) {

    }
}
