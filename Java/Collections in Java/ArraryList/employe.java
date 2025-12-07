package Arraylist;
import java.util.*;

public class employe {
	
	int id;
	String name;
	double salary;
	
	 employe() 
	{
		this.id = 000;
		this.name ="xyz";
		this.salary = 30000;
	}

	public employe(int id, String name, double salary) 
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
		return "employe [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}	

 class MyIdComparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		employe e1=(employe)o1;
		employe e2=(employe)o2;
		return e1.id-e2.id;
	}
	
}


class testcomparator {
	public static void main(String[] args) {


		ArrayList<employe> a = new ArrayList<employe>();  
		
		a.add(new employe(10,"Akshay",40000));
		a.add(new employe(34,"abc",35455));
		a.add(new employe(24,"xyz",24455));
		a.add(new employe(16,"pqr",50000));
		
		System.out.println("Before sorting : " + a);
		
		MyIdComparator mid =new MyIdComparator();
		
		Collections.sort(a,mid);
		System.out.println("After sorting : " + a);



		
	}
}



