package com.client;

import java.util.Scanner;

import com.aspect.ObjectCreater;
import com.services.LoginValidationServices;

public class clientcode {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter username : ");
		String name =sc.nextLine();
		System.out.println("Enter password : ");
		String password=sc.nextLine();
		
		LoginValidationServices login=ObjectCreater.createObjext();
		login.createUser(name, password);
		
		boolean value=login.validateUser(name, password);
		if(value)
		{
			System.out.println("Welcome user....");
		}
		else
		{
			System.out.println("Please try again...");
		}
	}

}
