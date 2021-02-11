import com.example.DAO.CompanyDAO;
import com.example.DAO.CompanyDAOImpl;
import com.example.DAO.PersonneDAOImlp;
import com.example.Models.Companyes;
import com.example.Models.Personne;
import com.example.Models.Users;
import com.example.Servlets.Login;
import com.example.Tools.RandomInformations;

import java.security.SecureRandom;
import java.sql.SQLException;
import java.util.ArrayList;

public class test {

    public static void main(String[] args) throws SQLException {

//
//        System.out.println(RandomInformations.RandomAccountNumber()[0]);
//        System.out.println(RandomInformations.RandomAccountNumber()[1]);
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
//        ArrayList<Personne> personnes = Login.getRichesPersonne();
//        personnes.forEach(p -> System.out.println(p.getFirt_name()));


//         Personne personne = new  Personne("String email" , "String firt_name", "String last_name");
//
//         PersonneDAO users = new PersonneDAOImlp();
//
//         users.delete(19);
//         users.delete(18);


//        System.out.println(users.getById(2).getFirt_name());


        Long[] v = RandomInformations.RandomAccountNumber();

        System.out.println(v[0]);
        System.out.println(v[1]);

//
//        CompanyDAO companyDAO = new CompanyDAOImpl();
////        Companyes companyes = new Companyes("Az Bank", "ab@abd.com");
////        companyDAO.create(companyes);
//
//        Users<Companyes> companyes1 = companyDAO.getAll();
//
//
//        ArrayList<Companyes> companyes2 = companyes1.getUsers();
//
//        companyes2.forEach(c -> System.out.println(c.getName()));
////        System.out.println(companyDAO.getById(13).getName());

//        System.out.println(Long.parseLong(RandomInformations.RandomAccountNumber()));
//        System.out.println(RandomInformations.RandomAccountNumber().length());
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
