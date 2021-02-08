import com.example.DAO.CompanyDAO;
import com.example.DAO.CompanyDAOImpl;
import com.example.DAO.PersonneDAO;
import com.example.DAO.PersonneDAOImlp;
import com.example.JavaBeans.Companyes;
import com.example.JavaBeans.Personne;
import com.example.JavaBeans.Users;
import com.example.Tools.RandomInformations;

import java.security.SecureRandom;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;

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


//        Users<Personne> users = null;
//        PersonneDAO personnes = new PersonneDAOImlp();
//        try {
//            users = personnes.getAll();
//            ArrayList<Personne> usr = users.getUsers();
//
//           usr.forEach(u -> System.out.println(u.getFirt_name() +" "+ u.getLast_name()));
////            request.setAttribute("Users", users.getUsers());
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//
//
//        ArrayList<Personne> personnes = getRichesPersonne();
//        personnes.forEach(p -> System.out.println(p.getCreated().toString()));
//
//
//         Personne personne = new  Personne("String email" , "String firt_name", "String last_name");
//
//         PersonneDAO users = new PersonneDAOImlp();
//
//         users.delete(19);
//         users.delete(18);


//        System.out.println(users.getById(2).getFirt_name());


//        System.out.println(RandomInformations.RandomPassword(10));


        CompanyDAO companyDAO = new CompanyDAOImpl();
        Companyes companyes = new Companyes("Az Bank", "ab@abd.com");
        companyDAO.create(companyes);
//        System.out.println(companyDAO.getById(13).getName());


//        companyDAO.getAll()

    }


//    private static ArrayList<Personne> getRichesPersonne() {
//        ArrayList<Personne> personnes = null;
//        PersonneDAO personne = new PersonneDAOImlp();
//        try {
//            Users<Personne> users = personne.getAll();
//            personnes = users.getUsers();
//
//            Collections.sort(personnes, Collections.reverseOrder());
////
////            personnes.forEach(p -> System.out.println(p.getSold()));
//
//
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        return personnes;
//
//    }



}
