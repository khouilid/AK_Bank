package com.example.Servlets;

import com.example.DAO.CompanyDAO;
import com.example.DAO.CompanyDAOImpl;
import com.example.DAO.PersonneDAO;
import com.example.DAO.PersonneDAOImlp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "deleteAccount", value = "/deleteAccount")
public class deleteAccount extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int person_id = Integer.parseInt(request.getParameter("person_id"));
        String action = request.getParameter("Action");
        String accountOf = request.getParameter("accountOf");
        if (action.equals("delete")) {
            if (accountOf.equals("perssone")) {

                PersonneDAO personnes = new PersonneDAOImlp();
                try {
                    personnes.delete(person_id);
                    redictAfterDelete(request, response);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            } else {

                CompanyDAO company = new CompanyDAOImpl();
                try {
                    company.delete(person_id);
                    redictAfterDelete(request, response);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        else{

        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    private void redictAfterDelete(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {

        PersonneDAO personnes = new PersonneDAOImlp();
        CompanyDAO companys = new CompanyDAOImpl();
        request.setAttribute("msg", "Done");
        request.setAttribute("personnes", personnes.getAll());
        request.setAttribute("companyes", companys.getAll());
        RequestDispatcher dispatcher = request.getRequestDispatcher("Views/basic-table.jsp");
        dispatcher.forward(request, response);

    }
}
