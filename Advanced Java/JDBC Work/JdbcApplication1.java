package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcApplication {

	
	Connection con;   
	Statement stmt;
	ResultSet rs;
	
	public void connect()                     //connection banane k liye method
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");                               //1.load driver class into memory
			
			con=DriverManager.getConnection("jdbc:mysql:test:3030","akshay","ak");     //2.creating connection
		}
		
		catch(SQLException e)
		{
		  e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	public void retrieveData()                              //sending query to db using statement
	{
		try {
			con.createStatement();                                                      //3.statement created
			rs=stmt.executeQuery("Select * from employee");          //sending query 
			
			while (rs.next())                                     //extracting data
			{
				int eNo=rs.getInt(1);
				String eName=rs.getString(2);
				float sal=rs.getFloat(3);
				System.out.println( "emp data : " + eNo + "/" + eName + "/" + sal );
			}

		} catch (Exception e) 
		{
			e.printStackTrace();
		}                          
		
	}
	
	public void insertData()                         //inserting data
	{
		try
		{
			int updateCount=stmt.executeUpdate("insert into employee values(101,'abc',40000)" );
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		
		JdbcApplication ja=new JdbcApplication();
		
		ja.connect();                                              //connection established
		ja.retrieveData();
		ja.insertData();

	}

}
