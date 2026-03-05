package com.aspect;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ConnectionProvider 
{
     public static Session provideConnection()
     {
    	 //Connection con=null;
    	 
    	 Session session = null;
         SessionFactory factory = null;
         
    	 try
    	 {
//    		 FileInputStream fis =new FileInputStream(".//resourses//dbinfo.properties");
// 			Properties p = new Properties();
// 			 p.load(fis);
//    		 String classname=p.getProperty("classname");
//    		 String url=p.getProperty("url");
//    		 String user=p.getProperty("username");
//    		 String pass=p.getProperty("password");
//    		 
//    		 Class.forName(classname);
//    		 con=DriverManager.getConnection(url,user,pass);
    		 
    		 
    		 
    		 //REPLACING JDBC WITH HIBERNATE
    		 factory = new Configuration()
                     .configure()
                     .buildSessionFactory();

         session = factory.openSession();
         
         
         

    		 
    		 
    	 }
    	 catch(Exception e)
    	 {
    		 e.printStackTrace();
    	 }
    	 return session;
     }
}