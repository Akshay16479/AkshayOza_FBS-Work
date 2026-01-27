package com.database;//daa

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcApplication {

	
	Connection con;   
	Statement stmt;
	ResultSet rs;
	
	public void connect()                     //connection banane k liye method
	{
		try
		{
			//read the middleware
			FileInputStream fis=new FileInputStream(".//references//dbinfo.properties");
			Properties p=new Properties();
			p.load(fis);
			
			//get the data in key value pair
			String driverclass=p.getProperty("classname");
			String url=p.getProperty("url");
			String user=p.getProperty("username");
			String pass=p.getProperty("password");
			
			
			
			Class.forName(driverclass);                               //1.load driver class into memory
			
			con=DriverManager.getConnection(url,user,pass);     //2.creating connection
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
			stmt=con.createStatement();                                                      //3.statement created
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
			String s ="insert into employee values(?,?,?)";
			PreparedStatement ps=con.prepareStatement(s);
			ps.setInt(1, 124);
			ps.setString(2,"xyz");
			ps.setDouble(3,20000);
			ps.executeUpdate();
			
			String t ="insert into employee values(?,?,?)";
			PreparedStatement pss=con.prepareStatement(t);
			pss.setInt(1, 1324);
			pss.setString(2,"akshayyy");
			pss.setDouble(3,20000);
			pss.executeUpdate();
			
			String r ="insert into employee values(?,?,?)";
			PreparedStatement psss=con.prepareStatement(r);
			psss.setInt(1, 144);
			psss.setString(2,"aksh");
			psss.setDouble(3,60000);
			psss.executeUpdate();
			
			
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

