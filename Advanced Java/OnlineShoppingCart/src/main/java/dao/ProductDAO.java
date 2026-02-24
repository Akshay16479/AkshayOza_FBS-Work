package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.Product;
import util.DBConnection;

public class ProductDAO {

    public Product getProductById(int id){

        Product p = null;

        try(Connection con = DBConnection.getConnection()){

            PreparedStatement ps = con.prepareStatement(
                "select * from product where id=?");

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if(rs.next()){
                p = new Product();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setPrice(rs.getDouble("price"));
                p.setImage(rs.getString("image"));
                p.setDescription(rs.getString("description"));
            }

        }catch(Exception e){
            e.printStackTrace();
        }

        return p;
    }

	public Object getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addProduct(Product p) {
		// TODO Auto-generated method stub
		
	}
}
