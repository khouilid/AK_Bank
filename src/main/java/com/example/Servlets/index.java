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
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "index", value = "/")
public class index extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        HttpSession isLog = request.getSession();
        String url = "inde.jsp";
        Users<Personne> users = null;
        if (isLog.getAttribute("isLog") == null) {
            url = "pages/login.jsp";
        } else {
            String log = (String) isLog.getAttribute("isLog");


            if (log.equals("NON")) {
                url = "pages/login.jsp";
            } else {
                PersonneDAO personnes = new PersonneDAOImlp();


                try {
                    users = personnes.getAll();
                    request.setAttribute("Users", users.getUsers());


                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }


}
