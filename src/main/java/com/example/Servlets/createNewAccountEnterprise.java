package com.example.Servlets;

import com.example.DAO.CompanyDAO;
import com.example.DAO.CompanyDAOImpl;
import com.example.Models.Companyes;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "createNewAccountEnterprise", value = "/CreateNewAccountEnterprise")
public class createNewAccountEnterprise extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //rederct to add new Enterprise account
        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/Views/register1.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String msg = "Done", url = "";

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        //check if all infos is put in the inputs

        if (!email.equals("") && !name.equals("")) {
            CompanyDAO company = new CompanyDAOImpl();
            try {
                //if user creates we redirect adin into dashboard
                if (company.create(new Companyes(name, email))) {
                    url = "/";
                    request.setAttribute("RichesPersonnes", Login.getRichesPersonne());
                    request.setAttribute("getRichesCompany", Login.getRichesCompany());
                }
                //Otherwise, we return them to register from

                else {
                    msg = "sql_error";
                    url = "WEB-INF/Views/register.jsp";
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        //Otherwise, we return them to register from

        else {
            msg = "infos_error";
            url = "WEB-INF/Views/register.jsp";

        }
        request.setAttribute("msg", msg);
        response.sendRedirect(url);

    }
}
