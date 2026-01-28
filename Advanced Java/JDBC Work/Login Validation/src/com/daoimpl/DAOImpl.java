package com.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.aspect.ConnectionProvider;
import com.beans.User;
import com.dao.DAOInterface;

//Implementation of all CRUD operations
public class DAOImpl implements DAOInterface
{
	//get the connection from Provider class
  Connection con=ConnectionProvider.provideConnection();
	PreparedStatement pst;
	ResultSet rs;
	public void insertUser(User u) 
	{
		try
		{
		  pst=con.prepareStatement("insert into usertable values(?,?)");
		  pst.setString(1, u.getUserName());
		  pst.setString(2, u.getPassword());
		  pst.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean retriveData(String username) 
	{
		boolean flag=false;
		try
		{
			pst=con.prepareStatement("select * from User where username=?");
			pst.setString(1, username);
			rs=pst.executeQuery();
			
			if(rs.next())
			{
				flag=true;
			}
			else
			{
				flag=false;
			}
			return flag;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return flag;
	}

}