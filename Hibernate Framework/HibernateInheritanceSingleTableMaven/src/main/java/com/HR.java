package com;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class HR extends Employee {
	
	@Column(name="comission")
	double commission;
	
	
	HR()
	{
		
	}


	public HR(int id, String name, double salary, double commission) {
		super(id, name, salary);
		this.commission = commission;
	}


	public double getCommission() {
		return commission;
	}


	public void setCommission(double commission) {
		this.commission = commission;
	}
	
	
	
	
}
