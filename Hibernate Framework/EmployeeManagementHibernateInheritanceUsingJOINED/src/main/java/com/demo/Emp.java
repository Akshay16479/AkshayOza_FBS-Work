package com.demo;

import java.util.Objects;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;


@Entity 
@Inheritance(strategy=InheritanceType.JOINED)
public class Emp {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int eId;
	String eName;
	double eSal;
	
	Emp()
	{
		
	}

	public Emp(int eId, String eName, double eSal) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eSal = eSal;
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

	public double geteSal() {
		return eSal;
	}

	public void seteSal(double eSal) {
		this.eSal = eSal;
	}

	@Override
	public int hashCode() {
		return Objects.hash(eId, eName, eSal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return eId == other.eId && Objects.equals(eName, other.eName)
				&& Double.doubleToLongBits(eSal) == Double.doubleToLongBits(other.eSal);
	}

	@Override
	public String toString() {
		return "Emp [eId=" + eId + ", eName=" + eName + ", eSal=" + eSal + "]";
	}
	
}



@Entity
@PrimaryKeyJoinColumn(name="eId")
class Manager extends Emp
{
	int incentive;

	Manager()
	{
		
	}
	
	
	

	public Manager(int eId, String eName, double eSal, int incentive) {
		super(eId, eName, eSal);
		this.incentive = incentive;
	}




	public int getIncentive() {
		return incentive;
	}

	public void setIncentive(int incentive) {
		this.incentive = incentive;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(incentive);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Manager other = (Manager) obj;
		return incentive == other.incentive;
	}

	@Override
	public String toString() {
		return "Manager [incentive=" + incentive + ", eId=" + eId + ", eName=" + eName + ", eSal=" + eSal
				+ ", getIncentive()=" + getIncentive() + ", hashCode()=" + hashCode() + ", geteId()=" + geteId()
				+ ", geteName()=" + geteName() + ", geteSal()=" + geteSal() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + "]";
	}
	
	
	
	
	
	
	
	
}
