package HashSet;
import java.util.*;

public class employee implements Comparable{
	
		

			int id;
			String name;
			double salary;
			
			 employee() 
			{
				this.id = 000;
				this.name ="xyz";
				this.salary = 30000;
			}

			public employee(int id, String name, double salary) 
			{
				this.id = id;
				this.name = name;
				this.salary = salary;
			}

			int getId() {
				return id;
			}

			void setId(int id) {
				this.id = id;
			}

			String getName() {
				return name;
			}

			void setName(String name) {
				this.name = name;
			}

			double getSalary() {
				return salary;
			}

			void setSalary(double salary) {
				this.salary = salary;
			}

			@Override
			public String toString() {
				return "employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
			}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			
			@Override
			public boolean equals(Object obj) {            //equals for list(arraylist and linkedlist) ke liye mandatory he
				employee e=(employee) obj;
				if(this.id==e.id)
				{
					return true;
				}
				else
				{
					return false;
				}
				
			}
			

		
			
			@Override
			public int compareTo(Object o) {                      //compareTo for treeset
				employee e=(employee)o;
				return this.id-e.id;
			}

			
			
			
			@Override
			public int hashCode() {                                  //hashcode for hashset
				return this.id;                                   //hashset me hashcode and equals dono check krega         
			}
			                                             
			
			
	
			
}	

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		class testemp1 {
			public static void main(String[] args) {
                      ArrayList <employee> a=new ArrayList <employee>(); 
                      
                      a.add(new employee(112,"Akshu",55500));               // list
                      a.add(new employee(245,"Abc",32500)); 
                      a.add(new employee(422,"xyz",60500));
                      a.add(new employee(101,"AO",40500));

                      if(a.contains(new employee(112,"Akshu",55500)))
                      {
                    	  System.out.println("Found");
                      }
                      else
                      {
                    	  System.out.println("Not Found");

                      }
			
			}
		}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		
		class testemp2 {
			public static void main(String[] args) {
                      TreeSet <employee> a=new TreeSet <employee>(); 
                      
                      a.add(new employee(112,"Akshu",55500));               // list 
                      a.add(new employee(245,"Abc",32500)); 
                      a.add(new employee(422,"xyz",60500));
                      a.add(new employee(101,"AO",40500));

                      if(a.contains(new employee(112,"Akshu",55500)))
                      {
                    	  System.out.println("Found");
                      }
                      else
                      {
                    	  System.out.println("Not Found");

                      }
			
			}
		} 
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		class testemp3 {
			public static void main(String[] args) {
                      HashSet <employee> a=new HashSet <employee>(); 
                      
                      a.add(new employee(112,"Akshu",55500));               // list 
                      a.add(new employee(245,"Abc",32500)); 
                      a.add(new employee(422,"xyz",60500));
                      a.add(new employee(101,"AO",40500));

                      if(a.contains(new employee(112,"Akshu",55500)))
                      {
                    	  System.out.println("Found");
                      }
                      else
                      {
                    	  System.out.println("Not Found");

                      }
			
			}
		} 