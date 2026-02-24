package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import dao.ProductDAO;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.CartItem;
import model.Product;

@WebServlet("/CartServlet")
public class CartServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException {

        int productId = Integer.parseInt(req.getParameter("productId"));
        int qty = Integer.parseInt(req.getParameter("quantity"));

        HttpSession session = req.getSession();
        List<CartItem> cart = (List<CartItem>) session.getAttribute("cart");
        
        if(cart == null){
            cart = new ArrayList<>();
        }

        Product product = new ProductDAO().getProductById(productId);

        CartItem item = new CartItem();
        item.setProduct(product);
        item.setQuantity(qty);

        cart.add(item);

        session.setAttribute("cart", cart);

        res.sendRedirect("user/cart.jsp");
    }
}
