import com.example.DAO.PersonneDAO;
import com.example.DAO.PersonneDAOImlp;
import com.example.JavaBeans.Personne;
import com.example.JavaBeans.User;
import com.example.JavaBeans.Users;
import com.example.Utiles.Connexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class test {

    public static void main(String[] args) throws SQLException {
        //inti ths id by 0
//        String id = "";
//        //sql query
//        String sql = "SELECT password FROM users WHERE email= ?;";        //prepare the DB and put the vars
//        //TODO fix connection null
//        PreparedStatement stmt = Objects.requireNonNull(Connexion.connect().prepareStatement(sql));
//        stmt.setString(1, "abd@abdo");
////        stmt.setString(2, "a");
//        ResultSet rs = stmt.executeQuery();
//        //get result and return the id if there is a user the this infos
//        if (rs.next()) {
//            id = rs.getString("password");
//        }
//        System.out.println(id);
//        return id;


        Users<Personne> users = null;
        PersonneDAO personnes = new PersonneDAOImlp();
        try {
            users = personnes.getAll();
            ArrayList<Personne> usr = users.getUsers();

           usr.forEach(u -> System.out.println(u.getFirt_name()));
//            request.setAttribute("Users", users.getUsers());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
