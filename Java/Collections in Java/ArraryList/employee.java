package Arraylist;
import java.util.*;
public class employee {
	
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
	
}	
class testemp {
	public static void main(String[] args) {

		employee e1 = new employee(101, "Akshay", 50000);
		employee e2 = new employee(102, "ao", 45000);
		employee e3 = new employee(103, "ak", 47000);

		ArrayList l1 = new ArrayList();                             //arraylist

		l1.add(e1);
		l1.add(e2);
		l1.add(e3);
		System.out.println(l1);
	}
}


