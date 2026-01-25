package com.demo;

public class Employee {
	int eid;
	String ename;
	double esalary;
	
	
	
	public Employee() {
		
	}
	
	public Employee(int eid, String ename, double esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}

	int getEid() {
		return eid;
	}

	void setEid(int eid) {
		this.eid = eid;
	}

	String getEname() {
		return ename;
	}

	void setEname(String ename) {
		this.ename = ename;
	}

	double getEsalary() {
		return esalary;
	}

	void setEsalary(double esalary) {
		this.esalary = esalary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
	}
	
	
	
}
