package com.beans;

public class User {
	
	private String userName;
	private String password;
	public String getUserName() {
		return userName;
	}
	void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	void setPassword(String password) {
		this.password = password;
	}
	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + "]";
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	
	
	
	
	

}
