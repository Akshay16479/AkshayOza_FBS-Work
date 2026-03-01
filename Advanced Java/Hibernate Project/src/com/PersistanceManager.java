package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PersistanceManager {

    public static void main(String[] args) {

        Session session = null;
        SessionFactory factory = null;

        try {

            factory = new Configuration().configure().buildSessionFactory();
            session = factory.openSession();

            Transaction tr = session.beginTransaction();

            Employee emp = new Employee(101, "Robin Sharma", 30000.0f);

            session.save(emp);

            tr.commit();

            System.out.println("Record Added");

            // load record
            Employee emp1 = session.load(Employee.class, 897);
            System.out.println(emp1);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            if (session != null) {
                session.close();
            }

            if (factory != null) {
                factory.close();
            }
        }
    }
}