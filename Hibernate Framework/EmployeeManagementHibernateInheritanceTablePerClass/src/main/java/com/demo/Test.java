package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure();

        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();

        // Emp object
       Emp e1=new Emp(222, "akshay", 40000);
       Manager m1=new Manager(212, "xyz", 22000, 3330);

        session.save(e1);
        session.save(m1);

        tx.commit();

        session.close();
        factory.close();

        System.out.println("Data inserted successfully");
    }
}