package controller;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import dao.AdminDAO;
import model.Admin;

@WebServlet("/adminLogin")
public class AdminLoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException {

        Admin admin = new AdminDAO().login(
                req.getParameter("username"),
                req.getParameter("password")
        );

        if(admin != null){
            req.getSession().setAttribute("admin", admin);
            res.sendRedirect("admin/dashboard.jsp");
        } else {
            res.sendRedirect("admin/adminLogin.jsp?error=1");
        }
    }
}
