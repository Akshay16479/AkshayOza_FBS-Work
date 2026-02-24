package dao;

import java.sql.*;
import model.Admin;
import util.DBConnection;

public class AdminDAO {

    public Admin login(String username, String password){

        Admin a = null;

        try(Connection con = DBConnection.getConnection()){

            PreparedStatement ps = con.prepareStatement(
                "select * from admin where username=? and password=?");

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if(rs.next()){
                a = new Admin();
                a.setId(rs.getInt("id"));
                a.setUsername(rs.getString("username"));
            }

        }catch(Exception e){
            e.printStackTrace();
        }

        return a;
    }
}
