package com.example.DAO;

import com.example.Models.Personne;
import com.example.Models.Users;
import com.example.Tools.RandomInformations;
import com.example.Utiles.Connexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonneDAOImlp implements PersonneDAO {
    @Override
    public boolean create(Personne user) throws SQLException {

        try {
            //Create new user in users table
            com.example.repository.Users.createNewUser(user.getEmail());

            String sql2 = "INSERT INTO personnes(firt_name, last_name, user_id , sold) VALUES(?,?,?,?)";
            PreparedStatement stmt = Connexion.connect().prepareStatement(sql2);
            stmt.setString(1, user.getFirt_name());
            stmt.setString(2, user.getLast_name());
            //getUserID is method the reuen this new user id from the DB
            stmt.setInt(3, com.example.repository.Users.getUserID(user.getEmail()));
            //intialize user sold with $0
            stmt.setInt(4, 0);
            stmt.executeUpdate();
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;

    }

    @Override
    public Users<Personne> getAll() throws SQLException {
        Users<Personne> users = new Users<>();
        //sql query
        String sql = "SELECT p.id, p.firt_name,u.created, p.last_name,u.email,p.sold , u.account_number " +
                "FROM personnes p " +
                "LEFT JOIN users u " +
                "ON p.user_id = u.id;";
        //prepare the DB and put the vars
        PreparedStatement stmt = Connexion.connect().prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        // get result and return the id if there is a user the this infos
        while (rs.next()) {
            Personne personne = new Personne(rs.getString("firt_name"),
                    rs.getString("last_name"),
                    rs.getString("email"),
                    rs.getInt("sold") , rs.getLong("account_number"));
            personne.setId(rs.getInt("id"));

            personne.setCreated(rs.getDate("created").toString());
            users.setUsers(personne);
        }
        return users;
    }

    @Override
    public Personne getById(int user_id) throws SQLException {
        Personne personne = new Personne();
        //sql query
        String sql = "SELECT p.firt_name,u.created, p.last_name,u.email,p.sold , u.account_number" +
                "FROM personnes p " +
                "LEFT JOIN users u " +
                "ON p.user_id = u.id " +
                "WHERE u.id = ?;";


        //prepare the DB and put the vars
        PreparedStatement stmt = Connexion.connect().prepareStatement(sql);
        stmt.setInt(1, user_id);
        ResultSet rs = stmt.executeQuery();
        // get result and return the id if there is a user the this infos
        if (rs.next()) {
            personne = new Personne(rs.getString("firt_name"),
                    rs.getString("last_name"),
                    rs.getString("email"),
                    rs.getInt("sold"), rs.getLong("account_number"));
        }
        return personne;
    }

    @Override
    public void update(Personne user) {

    }

    @Override
    public void delete(long person_id) throws SQLException {
        String sql = "DELETE FROM personnes WHERE id = ?;";
        PreparedStatement stmt = Connexion.connect().prepareStatement(sql);
        stmt.setLong(1, person_id);
        stmt.executeUpdate();
    }


}
