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
        Emp e = new Emp();
        e.seteName("Rahul");
        e.seteSal(50000);

        // Manager object
        Manager m = new Manager();
        m.seteName("Amit");
        m.seteSal(80000);
        m.setIncentive(5000);

        session.save(e);
        session.save(m);

        tx.commit();

        session.close();
        factory.close();

        System.out.println("Data inserted successfully");
    }
}