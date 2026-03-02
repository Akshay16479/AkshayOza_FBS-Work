package com.demo;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	 int eId;
	
	@Column(name = "empname")
	String eName;
	
	@Column
	int eSal;
	
	@Column
	String eMailId;
	
	
	Employee()
	{
		
	}


	public Employee(int eId, String eName, int eSal, String eMailId) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eSal = eSal;
		this.eMailId = eMailId;
	}


	public int geteId() {
		return eId;
	}


	public void seteId(int eId) {
		this.eId = eId;
	}


	public String geteName() {
		return eName;
	}


	public void seteName(String eName) {
		this.eName = eName;
	}


	public int geteSal() {
		return eSal;
	}


	public void seteSal(int eSal) {
		this.eSal = eSal;
	}


	public String geteMailId() {
		return eMailId;
	}


	public void seteMailId(String eMailId) {
		this.eMailId = eMailId;
	}


	@Override
	public int hashCode() {
		return Objects.hash(eId, eMailId, eName, eSal);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return eId == other.eId && Objects.equals(eMailId, other.eMailId) && Objects.equals(eName, other.eName)
				&& eSal == other.eSal;
	}


	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eSal=" + eSal + ", eMailId=" + eMailId + "]";
	}
	
	
	
}
