package com.example.Servlets;

import com.example.DAO.PersonneDAO;
import com.example.DAO.PersonneDAOImlp;
import com.example.Models.Personne;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "NewPersonalAccount", value = "/createNewAccountPersonal")
public class NewPersonalAccount extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("Views/register.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String first_name = request.getParameter("first_name");
        String last = request.getParameter("last_name");
        String email = request.getParameter("email");
        String msg = "", url = "";
        //check if all infos is put in the inputs
        if (!first_name.equals("") && !last.equals("") && !email.equals("")) {
            PersonneDAO newPerson = new PersonneDAOImlp();
            try {
                //if user creates we redirect adin into dashboard
                if (newPerson.create(new Personne(email, first_name, last))) {
                    msg = "Account has been created successfully!";
                    url = "Views/basic-table.jsp";
                }
                //Otherwise, we return them to register from
                else {
                    msg = "Please try again";
                    url = "Views/register.jsp";
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        //Otherwise, we return them to register from
        else {
            msg = "WarningOne";
            url = "Views/register.jsp";
        }

        try {
            deleteAccount.redictAfterDelete(request, response, msg);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
