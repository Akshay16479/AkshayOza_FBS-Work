package servlet;

import java.io.IOException;
import java.util.List;

import dao.OrderDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.CartItem;
import model.User;

@WebServlet("/CheckoutServlet")
public class CheckoutServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                          throws ServletException, IOException {

        HttpSession session = request.getSession();

        User user = (User) session.getAttribute("user");
        List<CartItem> cart =
            (List<CartItem>) session.getAttribute("cart");

        if(user == null || cart == null){
            response.sendRedirect("login.jsp");
            return;
        }

        double total = 0;

        for(CartItem c : cart){
            total += c.getProduct().getPrice() * c.getQuantity();
        }

        OrderDAO dao = new OrderDAO();

        boolean status =
            dao.placeOrder(user.getId(), total, "COD", cart);

        if(status){
            session.removeAttribute("cart");
            response.sendRedirect("order-success.jsp");
        }else{
            response.sendRedirect("cart.jsp");
        }
    }
}
