package com.bean;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
public class Employee {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)

	    @JsonProperty("eId")
	    private int eId;

	    @JsonProperty("eName")
	    private String eName;

	    @JsonProperty("eSal")
	    private double eSal;

   
    public Employee() {
    }

    public Employee(int eId, String eName, double eSal) {
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
}