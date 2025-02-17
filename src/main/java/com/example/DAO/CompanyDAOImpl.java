package com.example.DAO;

import com.example.Models.Companyes;
import com.example.Models.Users;
import com.example.Utiles.Connexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CompanyDAOImpl implements CompanyDAO {

    @Override
    public boolean create(Companyes companye) throws SQLException {

        try {
            String sql2 = "INSERT INTO compeny(name, user_id , sold) VALUES(?,?,?)";
            PreparedStatement stmt = Connexion.connect().prepareStatement(sql2);
            stmt.setString(1, companye.getName());
            //getUserID is method the reuen this new user id from the DB
            stmt.setInt(2, com.example.repository.Users.createNewUser(companye.getEmail()));
            //initialize user sold with $0
            stmt.setInt(3, 0);
            stmt.executeUpdate();
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;

    }

    @Override
    public Users<Companyes> getAll() throws SQLException {
        Users<Companyes> companyes = new Users<>();
        //sql query
        String sql = "SELECT p.id,u.id AS user_id, p.name,u.created,u.email,p.sold, u.account_number, u.status, u.cvc FROM compeny p LEFT JOIN users u ON p.user_id = u.id;";
        //prepare the DB and put the vars
        PreparedStatement stmt = Connexion.connect().prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        // get result and return the id if there is a user the this infos
        while (rs.next()) {
            Companyes companye = new Companyes(rs.getString("name"),
                    rs.getString("email"),
                    rs.getInt("sold"),
                    rs.getDate("created"));
            companye.setAccount_number(rs.getLong("account_number"));
            companye.setStatus(rs.getBoolean("status"));
            companye.setId(rs.getInt("id"));
            companye.setUser_id(rs.getInt("user_id"));
            companye.setCvc(rs.getInt("cvc"));
            companyes.setUsers(companye);
        }
        return companyes;
    }

    @Override
    public Companyes getById(int user_id) throws SQLException {
        Companyes companye = new Companyes();
        //sql query
        String sql = "SELECT p.name,u.created,u.email,p.sold " +
                "FROM compeny p " +
                "LEFT JOIN users u " +
                "ON p.user_id = u.id " +
                "WHERE u.id = ?;";


        //prepare the DB and put the vars
        PreparedStatement stmt = Connexion.connect().prepareStatement(sql);
        stmt.setInt(1, user_id);
        ResultSet rs = stmt.executeQuery();
        // get result and return the id if there is a user the this infos
        if (rs.next()) {
            companye = new Companyes(rs.getString("name"),
                    rs.getString("email"),
                    rs.getInt("sold"),
                    rs.getDate("created"));
        }
        return companye;
    }

    @Override
    public void update(Companyes company) {

    }

    @Override
    public void delete(long company_id) throws SQLException {
        String sql = "DELETE FROM compeny WHERE id = ?;";
        PreparedStatement stmt = Connexion.connect().prepareStatement(sql);
        stmt.setLong(1, company_id);


        stmt.executeUpdate();
    }

}
