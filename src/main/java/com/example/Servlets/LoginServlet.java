package com.example.Servlets;

import com.example.Utiles.Connexion;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String email = request.getParameter("email");
        String password = request.getParameter("pwd");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int id;
        String sql = "SELECT id FROM users WHERE email= ? AND password= ?;";
        //prepare the DB and put the vars
        //TODO fix connection null
        Connexion connexion = new Connexion();
        try {
            PreparedStatement stmt = connexion.connect().prepareStatement(sql);
            stmt.setString(1, email);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            // get result and return the id if there is a user the this infos
            if (rs.next()) {
                id = rs.getInt("id");
                if (id != 0) {

                    out.println("<html><body>");
                    out.println("<h1>connection success ! </h1>");
                    out.println("</body></html>");

                } else {

                    out.println("<html><body>");
                    out.println("<h1> test faild ! </h1>");
                    out.println("</body></html>");
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


//        Login log = new Login();



//        try {
////            int rs = log.log_in(new User(email, password));
//            if (id != 0) {
//
//                out.println("<html><body>");
//                out.println("<h1>connection success ! </h1>");
//                out.println("</body></html>");
//
//            } else {
//
//                out.println("<html><body>");
//                out.println("<h1> test faild ! </h1>");
//                out.println("</body></html>");
//            }
//
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }


    }
}
