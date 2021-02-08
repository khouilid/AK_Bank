package com.example.Servlets;

import com.example.DAO.PersonneDAO;
import com.example.DAO.PersonneDAOImlp;
import com.example.JavaBeans.Personne;
import com.example.JavaBeans.Users;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@WebServlet(name = "Customers", value = "/Customers")
public class Customers extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PersonneDAO personnes = new PersonneDAOImlp();
        try {
            Users<Personne> users = personnes.getAll();
            request.setAttribute("Users", users);
            RequestDispatcher dispatcher = request.getRequestDispatcher("pages/basic-table.jsp");
            dispatcher.forward(request, response);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
