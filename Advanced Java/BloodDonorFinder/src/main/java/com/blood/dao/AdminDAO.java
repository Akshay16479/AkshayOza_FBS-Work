package com.blood.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.blood.util.DBConnection;

public class AdminDAO {

    public boolean login(String username, String password) {

        boolean status = false;

        try (Connection con = DBConnection.getConnection()) {

            String sql = "SELECT * FROM admin WHERE username=? AND password=?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                status = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }
    
    public int getTotalDonors() {
        int count = 0;
        try (Connection con = DBConnection.getConnection()) {

            String sql = "SELECT COUNT(*) FROM donor";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                count = rs.getInt(1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }
    
}