package com.aug.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure("config.xml").buildSessionFactory();
		Session ses = factory.openSession();
		Transaction tr = ses.beginTransaction();
		
		//Mobile m1=new Mobile(1234, "Apple", 70000, "IPhone15", "White");

		Mobile ref=null;
		ref=ses.get(Mobile.class, 1234);
		System.out.println(ref);
		
		//ses.save(m1);
		//tr.commit();
		ses.close();
		

	}

}
