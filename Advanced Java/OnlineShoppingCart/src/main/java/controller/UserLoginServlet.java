package controller;

import java.io.IOException;

import dao.UserDAO;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.User;

@WebServlet("/userLogin")
public class UserLoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {

        UserDAO dao = new UserDAO();
        User user = dao.login(
                req.getParameter("email"),
                req.getParameter("password")
        );

        if(user != null){
            req.getSession().setAttribute("user", user);
            res.sendRedirect("ProductServlet");
        } else {
            res.sendRedirect("user/login.jsp?error=1");
        }
    }
}
