package com.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeManagement {
	int empid;
	String empname;
	double empsalary;
    Scanner sc =new Scanner(System.in);
	
	public void addEmployee() {
		System.out.println("Enter Emp ID : ");
		empid=sc.nextInt();
		System.out.println("Enter Emp Name : ");
		empname=sc.next();
		System.out.println("Enter Emp Salary : ");
		empsalary=sc.nextDouble();
		
		try {
			Connection con=DBUtility.getSQLConnection();
			String insertQuery="insert into employee values(?,?,?)";
			PreparedStatement psmt=con.prepareStatement(insertQuery);
			psmt.setInt(1, empid);
			psmt.setString(2, empname);
			psmt.setDouble(3, empsalary);
			
			int rows=psmt.executeUpdate();
			if(rows>0) {
				System.out.println("--- Data Inserted!--- ");
			}
			DBUtility.resoursesRelease( psmt, con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void searchEmployee() {
		System.out.print("Enter Employee ID to search: ");
	    int id = sc.nextInt();

	    try {
	        Connection con = DBUtility.getSQLConnection();

	        String query = "SELECT * FROM employee WHERE id = ?";
	        PreparedStatement psmt = con.prepareStatement(query);
	        psmt.setInt(1, id);

	        ResultSet rs = psmt.executeQuery();

	        if (rs.next()) {          // ✔ record exists
	            int empid = rs.getInt(1);
	            String empname = rs.getString(2);
	            double empsalary = rs.getDouble(3);

	            System.out.println(
	                "Employee Found: " +
	                empid + " | " + empname + " | " + empsalary
	            );
	        } else {                  // ❌ no record
	            System.out.println("--- Employee Not Found ---");
	        }

	        DBUtility.resoursesRelease(rs, psmt, con);

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}

	public void updateEmployee() {
		 System.out.print("Enter Employee ID to update: ");
		    int id = sc.nextInt();

		    System.out.print("Enter New Name: ");
		    String newName = sc.next();

		    System.out.print("Enter New Salary: ");
		    double newSalary = sc.nextDouble();

		    try {
		        Connection con = DBUtility.getSQLConnection();

		        String query = "UPDATE employee SET name = ?, salary = ? WHERE id = ?";
		        PreparedStatement psmt = con.prepareStatement(query);

		        psmt.setString(1, newName);
		        psmt.setDouble(2, newSalary);
		        psmt.setInt(3, id);

		        int rows = psmt.executeUpdate();

		        if (rows > 0) {
		            System.out.println("--- Employee Updated Successfully ---");
		        } else {
		            System.out.println("--- Employee Not Found ---");
		        }

		        DBUtility.resoursesRelease(psmt, con);

		    } catch (SQLException e) {
		        e.printStackTrace();
		    }

	}

	public void deleteEmployee() {
		System.out.print("Enter Employee ID to delete: ");
	    int id = sc.nextInt();

	    try {
	        Connection con = DBUtility.getSQLConnection();

	        String query = "DELETE FROM employee WHERE id = ?";
	        PreparedStatement psmt = con.prepareStatement(query);
	        psmt.setInt(1, id);

	        int rows = psmt.executeUpdate();

	        if (rows > 0) {
	            System.out.println("--- Employee Deleted Successfully ---");
	        } else {
	            System.out.println("--- Employee Not Found ---");
	        }

	        DBUtility.resoursesRelease(psmt, con);

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	}

	public void displayAll() {
		try {
			Connection con=DBUtility.getSQLConnection();
			String query="Select * from employee";
			
			PreparedStatement psmt=con.prepareStatement(query);
			ResultSet rs = psmt.executeQuery();
			
			while(rs.next()) {
				
				empid=rs.getInt(1);
				empname=rs.getString(2);
				empsalary=rs.getDouble(3);
				
				Employee e1=new Employee(empid,empname,empsalary);
				System.out.println(e1);
			}
			
			DBUtility.resoursesRelease(rs,psmt,con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
