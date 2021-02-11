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
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "Customers", value = "/Customers")
public class Customers extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PersonneDAO personnes = new PersonneDAOImlp();
        CompanyDAO companys = new CompanyDAOImpl();
        try {
            //get the object that contain att users info in a from of array list
            //this class is a generic class
            //pass the infos into he views
            request.setAttribute("personnes", personnes.getAll());
            request.setAttribute("companyes", companys.getAll());
            RequestDispatcher dispatcher = request.getRequestDispatcher("Views/basic-table.jsp");
            dispatcher.forward(request, response);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
