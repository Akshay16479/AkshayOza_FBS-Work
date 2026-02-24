package dao;

import java.sql.*;
import java.util.List;
import model.CartItem;
import util.DBConnection;

public class OrderDAO {

    public boolean placeOrder(int userId, double total, String mode, List<CartItem> cart){

        try(Connection con = DBConnection.getConnection()){

            con.setAutoCommit(false);

            // 1️⃣ Insert into orders
            PreparedStatement ps = con.prepareStatement(
                "insert into orders(user_id,total,payment_mode) values(?,?,?)",
                Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, userId);
            ps.setDouble(2, total);
            ps.setString(3, mode);

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            int orderId = 0;

            if(rs.next()){
                orderId = rs.getInt(1);
            }

            // 2️⃣ Insert order items
            PreparedStatement itemPs = con.prepareStatement(
                "insert into order_items(order_id,product_id,quantity,price) values(?,?,?,?)");

            for(CartItem c : cart){

                itemPs.setInt(1, orderId);
                itemPs.setInt(2, c.getProduct().getId());
                itemPs.setInt(3, c.getQuantity());
                itemPs.setDouble(4, c.getProduct().getPrice());

                itemPs.addBatch();
            }

            itemPs.executeBatch();

            con.commit();
            return true;

        }catch(Exception e){
            e.printStackTrace();
        }

        return false;
    }
}
