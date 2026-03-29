package com.blood.dao;

import java.sql.*;
import java.util.*;

import com.blood.model.Donor;
import com.blood.util.DBConnection;

public class DonorDAO {

    // ✅ REGISTER DONOR (FIXED)
    public boolean registerDonor(Donor d) {
        boolean status = false;

        try (Connection con = DBConnection.getConnection()) {

            String sql = "INSERT INTO donor(name,email,password,phone,blood_group,city,pincode) VALUES(?,?,?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, d.getName());
            ps.setString(2, d.getEmail());
            ps.setString(3, d.getPassword());
            ps.setString(4, d.getPhone());
            ps.setString(5, d.getBloodGroup());
            ps.setString(6, d.getCity());
            ps.setString(7, d.getPincode());

            status = ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }

    // ✅ LOGIN
    public Donor login(String email, String password) {
        Donor d = null;

        try (Connection con = DBConnection.getConnection()) {

            String sql = "SELECT * FROM donor WHERE email=? AND password=?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, email);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                d = new Donor();
                d.setId(rs.getInt("id"));
                d.setName(rs.getString("name"));
                d.setEmail(rs.getString("email"));
                d.setBloodGroup(rs.getString("blood_group"));
                d.setCity(rs.getString("city"));
                d.setAvailable(rs.getBoolean("available"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return d;
    }

    // ✅ SEARCH DONORS
    public List<Donor> searchDonors(String blood, String city) {

        List<Donor> list = new ArrayList<>();

        try (Connection con = DBConnection.getConnection()) {

            String sql = "SELECT * FROM donor WHERE blood_group=? AND city=? AND available=TRUE";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, blood);
            ps.setString(2, city);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Donor d = new Donor();

                d.setId(rs.getInt("id")); 
                d.setName(rs.getString("name"));
                d.setEmail(rs.getString("email")); 
                d.setPhone(rs.getString("phone"));
                d.setBloodGroup(rs.getString("blood_group"));
                d.setCity(rs.getString("city"));

                list.add(d);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    // ✅ ADMIN VIEW
    public List<Donor> getAllDonors() {

        List<Donor> list = new ArrayList<>();

        try (Connection con = DBConnection.getConnection()) {

            String sql = "SELECT * FROM donor";
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Donor d = new Donor();

                d.setId(rs.getInt("id"));
                d.setName(rs.getString("name"));
                d.setEmail(rs.getString("email"));
                d.setPhone(rs.getString("phone"));
                d.setBloodGroup(rs.getString("blood_group"));
                d.setCity(rs.getString("city"));
                d.setAvailable(rs.getBoolean("available"));

                list.add(d);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
    public Donor getDonorById(int id) {

        Donor d = null;

        try (Connection con = DBConnection.getConnection()) {

            String sql = "SELECT * FROM donor WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                d = new Donor();
                d.setId(rs.getInt("id"));
                d.setName(rs.getString("name"));
                d.setEmail(rs.getString("email"));
                d.setPhone(rs.getString("phone"));
                d.setBloodGroup(rs.getString("blood_group"));
                d.setCity(rs.getString("city"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return d;
    }
}