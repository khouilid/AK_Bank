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
        String msg = "Done", url = "";

        //check if all infos is put in the inputs
        if (!first_name.equals("") && !last.equals("") && !email.equals("")) {
            PersonneDAO newPerson = new PersonneDAOImlp();
            //TODO diplay alerts in all cases
            try {
                //if user creates we redirect adin into dashboard
                if (newPerson.create(new Personne(email, first_name, last))) {
                    url = "/home";
                    request.setAttribute("RichesPersonnes", Login.getRichesPersonne());
                    request.setAttribute("getRichesCompany", Login.getRichesCompany());
                    System.out.println("is here !");

                }
                //Otherwise, we return them to register from
                else {
                    msg = "sql_error";
                    url = "Views/register.jsp";
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        //Otherwise, we return them to register from
        else {
            msg = "infos_error";
            url = "Views/register.jsp";

        }
        response.sendRedirect(url);

    }
}
