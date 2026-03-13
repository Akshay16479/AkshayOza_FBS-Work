package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee implements services {
	@Value("222")
	int no;
	@Value("akshu")
	String name;
	@Value("70000")
	int sal;
	
	@Autowired
	Date d;
	

	public Employee() {
    }

	public Employee(int no, String name, int sal,Date d) {
		super();
		this.no = no;
		this.name = name;
		this.sal = sal;
		this.d=d;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	
	@Override
	public void info() {
		System.out.println(" emp loaded with data " + no + "\n"+ " joining date is : " + d + "\n"  );
		
	}
	
	
	
	

}
