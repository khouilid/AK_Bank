package com.example.Servlets;

import com.example.DAO.CompanyDAO;
import com.example.DAO.CompanyDAOImpl;
import com.example.DAO.PersonneDAO;
import com.example.DAO.PersonneDAOImlp;
import com.example.repository.Block_Unblock;

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
        String accounType = request.getParameter("accountOf");

        if (action.equals("Delete")) {

            block(accounType, person_id);
            try {
                redictAfterDelete(request, response, "Account has been deleted successfully!");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        int user_id = Integer.parseInt(request.getParameter("user_id"));
        if (action.equals("Block")) {
            try {
                Block_Unblock blockAccount = new Block_Unblock();
                blockAccount.blockAccount(user_id);
                redictAfterDelete(request, response, "Account has been blocked successfully!");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        } else {
            try {
                Block_Unblock blockAccount = new Block_Unblock();
                blockAccount.unblockAccount(user_id);
                redictAfterDelete(request, response, "Account has been unblocked successfully!");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected static void redictAfterDelete(HttpServletRequest request, HttpServletResponse response, String msg)
            throws ServletException, IOException, SQLException {

        PersonneDAO personnes = new PersonneDAOImlp();
        CompanyDAO companys = new CompanyDAOImpl();
        request.setAttribute("msg", msg);
        request.setAttribute("personnes", personnes.getAll());
        request.setAttribute("companyes", companys.getAll());
        RequestDispatcher dispatcher = request.getRequestDispatcher("Views/basic-table.jsp");
        dispatcher.forward(request, response);

    }

    private void block(String accounType, int id) {
        if (accounType.equals("person")) {

            PersonneDAO personnes = new PersonneDAOImlp();
            try {
                personnes.delete(id);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } else {
            CompanyDAO company = new CompanyDAOImpl();
            try {
                company.delete(id);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
