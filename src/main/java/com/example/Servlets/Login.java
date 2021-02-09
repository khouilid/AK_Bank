package com.example.Servlets;
import com.example.Models.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "Login", value = "/Login")
public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("pwd");
        com.example.repository.Login log = new com.example.repository.Login();


        //TODO secure the login form
        try {
            int rs = log.log_in(new User(email, password));
            if (rs != 0) {
                HttpSession isLog = request.getSession();
                isLog.setAttribute("isLog", "YES");
                request.setAttribute("RichesPersonnes", index.getRichesPersonne());
                request.setAttribute("getRichesCompany", index.getRichesCompany());


                RequestDispatcher dispatcher = request.getRequestDispatcher("inde.jsp");
                dispatcher.forward(request, response);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
