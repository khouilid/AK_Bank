package com.example.Servlets;

import com.example.DAO.CompanyDAO;
import com.example.DAO.CompanyDAOImpl;
import com.example.DAO.PersonneDAO;
import com.example.DAO.PersonneDAOImlp;
import com.example.Models.Companyes;
import com.example.Models.Personne;
import com.example.Models.User;
import com.example.Models.Users;
import com.example.repository.Statistics;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;

@WebServlet(name = "Login", value = "/")
public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //check if user is already connected
        //if not, we redirect hem to the login page
        //Otherwise, we let hem to enter the admin dashboard
        HttpSession isLog = request.getSession();
        String url = "login.jsp";
        if (isLog.getAttribute("isLog") != null) {
            String log = (String) isLog.getAttribute("isLog");
            if (log.equals("YES")) {
               url = "Views/index.jsp";
                request.setAttribute("RichesPersonnes", getRichesPersonne());
                request.setAttribute("getRichesCompany", getRichesCompany());
            }
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher(url);
        dispatcher.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        com.example.repository.Login log = new com.example.repository.Login();
        //TODO secure the login form
        try {
            int rs = log.log_in(new User(request.getParameter("email"), request.getParameter("pwd")));
            if (rs != 0) {
                HttpSession isLog = request.getSession();
                isLog.setAttribute("isLog", "YES");
                request.setAttribute("personnalAccountsDATA", Statistics.totalPersonnalAccountsMoney("personnes"));
                request.setAttribute("companyAccountsDATA", Statistics.totalPersonnalAccountsMoney("compeny"));
                request.setAttribute("RichesPersonnes", getRichesPersonne());
                request.setAttribute("getRichesCompany", getRichesCompany());
                RequestDispatcher dispatcher = request.getRequestDispatcher("Views/index.jsp");
                dispatcher.forward(request, response);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            RequestDispatcher dispatcher = request.getRequestDispatcher("Views/error-500.jsp");
            dispatcher.forward(request, response);
        }
    }


    public static ArrayList<Personne> getRichesPersonne() {
        ArrayList<Personne> personnes = null;
        PersonneDAO personne = new PersonneDAOImlp();
        try {
            //get all users
            Users<Personne> users = personne.getAll();
            personnes = users.getUsers();
            //sort the arrray in an increasing order
            personnes.sort(Collections.reverseOrder());

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return personnes;

    }

    public static ArrayList<Companyes> getRichesCompany() {
        ArrayList<Companyes> personnes = null;
        CompanyDAO companyes = new CompanyDAOImpl();
        try {
            Users<Companyes> users = companyes.getAll();
            personnes = users.getUsers();
            personnes.sort(Collections.reverseOrder());

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return personnes;
    }
}
