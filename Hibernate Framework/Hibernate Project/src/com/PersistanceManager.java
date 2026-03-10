package com;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

public class PersistanceManager {

    public static void main(String[] args) {

        Session session = null;
        SessionFactory factory = null;

        try {

            factory = new Configuration()
                        .configure()
                        .buildSessionFactory();

            session = factory.openSession();

            Transaction tr = session.beginTransaction();
            
            //Getting COMPLETE data using criteria interface 
			/*
			 * Criteria criteria=session.createCriteria(Employee.class); 
			 * List<Employee> list= criteria.list(); 
			 * for(Employee e : list)
			 * { 
			 * System.out.println(e.geteId());
			 * System.out.println(e.geteName()); 
			 * System.out.println(e.geteSal());
			 * System.out.println(); 
			 * }
			 */
            
            
            
            //filter out SINGLE data based on conditions using Restriction(between,gt,lt,notnull,like)
			/*
			 * Criteria criteria=session.createCriteria(Employee.class);
			 * criteria.add(Restrictions.between("eSal",30000.0f, 70000.0f));
			 * List<Employee>list=criteria.list(); 
			 * for (Employee employee : list) 
			 * {
			 * System.out.println(employee.geteId());
			 * System.out.println(employee.geteName());
			 * System.out.println(employee.geteSal()); 
			 * System.out.println(); 
			 * }
			 */

            
			/*
			 * Criteria criteria=session.createCriteria(Employee.class);
			 * criteria.add(Restrictions.gt("eSal", 50000.0f));
			 * List<Employee>list=criteria.list(); 
			 * for (Employee employee : list) 
			 * {
			 * System.out.println(employee.geteId());
			 * System.out.println(employee.geteName());
			 * System.out.println(employee.geteSal()); 
			 * System.out.println(); 
			 * }
			 */
            
			/*
			 * Criteria criteria=session.createCriteria(Employee.class);
			 * criteria.add(Restrictions.lt("eSal", 50000.0f));
			 * List<Employee>list=criteria.list(); 
			 * for (Employee employee : list) 
			 * {
			 * System.out.println(employee.geteId());
			 * System.out.println(employee.geteName());
			 * System.out.println(employee.geteSal()); 
			 * System.out.println(); 
			 * }
			 */
            
			/*
			 * Criteria criteria=session.createCriteria(Employee.class);               
			 * criteria.add(Restrictions.isNotNull("eSal"));
			 * List<Employee>list=criteria.list(); 
			 * for (Employee employee : list) 
			 * {
			 * System.out.println(employee.geteId());
			 * System.out.println(employee.geteName());
			 * System.out.println(employee.geteSal()); 
			 * System.out.println(); 
			 * }
			 */
            
			/*
			 * Criteria criteria=session.createCriteria(Employee.class);
			 * criteria.add(Restrictions.like("eName", "a%"));
			 * List<Employee>list=criteria.list(); 
			 * for (Employee employee : list) 
			 * {
			 * System.out.println(employee.geteId());
			 * System.out.println(employee.geteName());
			 * System.out.println(employee.geteSal()); 
			 * System.out.println(); 
			 * }
			 */
            
            
            //combining multiple conditions using AND/OR
            Criteria criteria=session.createCriteria(Employee.class);
            Criterion salary=Restrictions.lt("eSal", 50000.0f);
            Criterion name = Restrictions.like("eName", "a%");
            //logicalexp is a class
            LogicalExpression exp=Restrictions.and(salary, name);//and
            LogicalExpression exp1=Restrictions.or(salary, name);//or

            criteria.add(exp1);
            
            List<Employee>list=criteria.list(); 
            for (Employee employee : list) 
   			  {
   			   System.out.println(employee.geteId());
   			   System.out.println(employee.geteName());
   			   System.out.println(employee.geteSal()); 
   			   System.out.println(); 
   			  }
            
            
            
            
            
            
            
            
            
            
            
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////            
            //normal way of inserting data using hibernate(old code) 
			/*
			 * Employee emp = new Employee(108, "aaabbb", 16000.0f); session.save(emp);
			 * 
			 * tr.commit();
			 * 
			 * System.out.println("Record Added");
			 * 
			 * Employee emp1 = session.load(Employee.class, 101); System.out.println(emp1);
			 */
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            if (session != null)
                session.close();

            if (factory != null)
                factory.close();
        }
    }
}