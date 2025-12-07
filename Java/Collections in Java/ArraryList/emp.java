package practiceworkjava;

import java.util.*;

public class employee {
	int id;
	String name;
	double salary;
	
	public employee(int i, String string, int j) 
	{
		this.id=i;
		this.name=string;
		this.salary=j;
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
		return " id= " + id + " name= " + name + " salary= " + salary + "\n";
	}

}


class emptest{
	public static void main(String[] args) {
		ArrayList <employee> a=new ArrayList <employee>();
		
		a.add(new employee(10,"sachin",20000));
		a.add(new employee(18,"virat",25000));
		a.add(new employee(12,"yuvi",19000));
		a.add(new employee(5,"rahul",35000));
		a.add(new employee(88,"akshay",70000));
		a.add(new employee(25,"ao",60000));
		a.add(new employee(30,"abc",10000));

		Collections.sort(a, new Comparator<employee>() 
		{

			@Override
			public int compare(employee o1, employee o2) {
				return o1.getId()-o2.getId();
			}
			
		});
			System.out.println("sorting on basis of id \n" + a);
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////			
			
			Collections.sort(a, new Comparator<employee>() 
			{

				@Override
				public int compare(employee o1, employee o2) {
					return  o1.getName().compareTo(o2.getName());
				}
				
			});
				System.out.println("sorting on basis of name \n" + a);
			
			
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				Collections.sort(a, new Comparator<employee>() 
				{

					@Override
					public int compare(employee o1, employee o2) {
						return (int) (o1.getSalary()-o2.getSalary());
					}
					
				});
					System.out.println("sorting on basis of id \n" + a);
				
		
	}
}
