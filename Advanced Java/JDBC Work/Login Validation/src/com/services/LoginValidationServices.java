package com.services;

public interface LoginValidationServices {
	
	public void createUser(String username,String password);
	public boolean validateUser(String username,String password);

}
