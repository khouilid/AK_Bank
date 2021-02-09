package com.example.Servlets;

import com.example.DAO.CompanyDAO;
import com.example.DAO.CompanyDAOImpl;
import com.example.DAO.PersonneDAO;
import com.example.DAO.PersonneDAOImlp;
import com.example.Models.Companyes;
import com.example.Models.Personne;
import com.example.Models.Users;

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

@WebServlet(name = "index", value = "/")
public class index extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



        //check if user is already connected
        //if not, we redirect hem to the login page
        //Otherwise, we let hem to enter the admin dashboard
        HttpSession isLog = request.getSession();
        String url = "inde.jsp";
        Users<Personne> users = null;
        if (isLog.getAttribute("isLog") == null) {
            url = "Views/login.jsp";
        } else {
            String log = (String) isLog.getAttribute("isLog");


            if (log.equals("NON")) {
                url = "Views/login.jsp";
            } else {
                PersonneDAO personnes = new PersonneDAOImlp();

                request.setAttribute("RichesPersonnes", getRichesPersonne());
                request.setAttribute("getRichesCompany", getRichesCompany());

            }
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }

    //this two methods , get the 5 reches accounts in the bank
    // fron both personnal and Enterprise accouns
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
