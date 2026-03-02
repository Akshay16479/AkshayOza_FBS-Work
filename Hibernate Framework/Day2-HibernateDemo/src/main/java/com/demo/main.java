package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class main {

	public static void main(String[] args) {
			
		Configuration cfg= new Configuration();
		SessionFactory factory=cfg.configure("config.xml").buildSessionFactory();
		Session ses=factory.openSession();
		Transaction tr=ses.beginTransaction();
		
		
		Employee e1= new Employee(1201, "akshay", 60000, "akshay@gmail.com");
		
		ses.save(e1);
		tr.commit();
		ses.close();
		

	}

}
