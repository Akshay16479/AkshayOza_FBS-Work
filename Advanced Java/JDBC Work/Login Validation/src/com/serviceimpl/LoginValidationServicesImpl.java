package com.serviceimpl;

import com.beans.User;
import com.daoimpl.DAOImpl;
import com.services.LoginValidationServices;

public class LoginValidationServicesImpl implements LoginValidationServices {

	User u;
	
	//Integrated with DAO class for CRUD operations
    DAOImpl dao=new DAOImpl();
    
	@Override
	public void createUser(String username, String password) {
		
		u=new User(username,password);
		
		
	}

	@Override
	public boolean validateUser(String username, String password) 
	{
		boolean flag=false;
		//verify the users data with persisted data using DAO class
		flag=dao.retriveData(username);
		
		
		
		/*
		 * if(u.getUserName().equals(username)&&(u.getPassword().equalsIgnoreCase(
		 * password))) { flag=true; } else { flag=false; }
		 */	return flag;
	}

}
