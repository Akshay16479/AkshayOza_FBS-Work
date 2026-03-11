package com;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class SalesManager extends Employee {
	
	@Column(name="target")
	int target;
	
	@Column(name="incentives")
	double incentives;
	
	SalesManager()
	{
		
	}

	public SalesManager(int id, String name, double salary, int target, double incentives) {
		super(id, name, salary);
		this.target = target;
		this.incentives = incentives;
	}
	
	

}
