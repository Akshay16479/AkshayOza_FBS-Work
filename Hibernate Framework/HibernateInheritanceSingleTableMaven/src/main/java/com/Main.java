package com;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Session ses= new Configuration().configure().buildSessionFactory().openSession();
		Transaction tr=ses.beginTransaction();
		
		Employee e1=new Employee(101,"akshay", 25000);
		Admin a1=new Admin(102, "abc", 30000, 2000);
		HR h1=new HR(103, "pyq", 22000, 2319);
		SalesManager sm1=new SalesManager(104, "xyz", 40000, 12, 4212);
		
		ses.save(sm1);
		ses.save(h1);
		ses.save(a1);
		ses.save(e1);
		
		tr.commit();
		ses.close();
		
	}

}
