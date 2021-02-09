package com.example.Servlets;

import com.example.DAO.CompanyDAO;
import com.example.DAO.CompanyDAOImpl;
import com.example.DAO.PersonneDAO;
import com.example.DAO.PersonneDAOImlp;
import com.example.Models.Companyes;
import com.example.Models.Personne;
import com.example.Models.Users;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "deleteAccount", value = "/deleteAccount")
public class deleteAccount extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int person_id = Integer.parseInt(request.getParameter("person_id"));
        PersonneDAO personnes = new PersonneDAOImlp();
        CompanyDAO companys = new CompanyDAOImpl();
        PersonneDAO deleteThisOne = new PersonneDAOImlp();
        try {

            Users<Personne> personne = personnes.getAll();
            Users<Companyes> companyes = companys.getAll();

            deleteThisOne.delete(person_id);
            request.setAttribute("msg", "Done");
            request.setAttribute("personnes", personne);
            request.setAttribute("companyes", companyes);
            RequestDispatcher dispatcher = request.getRequestDispatcher("Views/basic-table.jsp");
            dispatcher.forward(request, response);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
