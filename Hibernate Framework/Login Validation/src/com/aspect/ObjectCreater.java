package com.aspect;

import java.io.FileInputStream;
import java.util.Properties;

import com.services.LoginValidationServices;

public class ObjectCreater {
	
	@SuppressWarnings("deprecation")
	public static LoginValidationServices createObjext()
	{
		String classname=null;
		LoginValidationServices login=null;
		
		try
		{
			FileInputStream fis =new FileInputStream(".//resourses//info.properties");
			Properties p = new Properties();
			p.load(fis);
			classname=p.getProperty("businessClass");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		try
		{
			login=(LoginValidationServices)Class.forName(classname).newInstance();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return login;
		
		
	}

}
