package controller;

import java.io.IOException;

import dao.UserDAO;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.User;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {

        User u = new User();
        u.setName(req.getParameter("name"));
        u.setEmail(req.getParameter("email"));
        u.setPassword(req.getParameter("password"));

        new UserDAO().register(u);

        res.sendRedirect("user/login.jsp");
    }
}
