package Mapset;       //TreeMap 

import java.util.*;

public class employee {               //emp me kuch bhi change nahi hoga sab test and key me hogaa(treemap me)
	int id;
	String name;
	double salary;        //TreeMap 
	
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
		return "\n \nid=" + id + ", \nname=" + name + ", \nsalary=" + salary ;
	}
	
}	


 class MyKey implements Comparable{
	int key;
	public MyKey(int i) {
		this.key=i;
	}
	@Override
	public int compareTo(Object o) {
		MyKey m=(MyKey)o;
		return this.key-m.key;
	}

}


//emp me kuch bhi change nahi hoga sab test and key me hogaa(treemap me)



class test{
	public static void main(String[] args) {
		TreeMap<MyKey, employee> tm=new TreeMap<MyKey, employee>();
		
		tm.put(new MyKey(18),new employee(18,"virat",19000));
		tm.put(new MyKey(45),new employee(45,"rohit",25000));
		tm.put(new MyKey(12),new employee(12,"yuvi",41000));
		tm.put(new MyKey(7),new employee(7,"thala",30000));
		System.out.println(tm);
		
		if(tm.containsKey(new MyKey(7)))
		{
			System.out.println("\nFOUND!");
		}
		else
		{
			System.out.println("\nNOT FOUND !!");
		}
		
	}
}
