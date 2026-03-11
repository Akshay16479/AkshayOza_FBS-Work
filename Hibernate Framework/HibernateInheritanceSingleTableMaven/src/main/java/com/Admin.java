package com;


import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Admin extends Employee {

	@Column(name="allowance")		
	double allowance;
	
	Admin()
	{
		
	}

	public Admin(int id, String name, double salary, double allowance) {
		super(id, name, salary);
		this.allowance = allowance;
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	
	
}
