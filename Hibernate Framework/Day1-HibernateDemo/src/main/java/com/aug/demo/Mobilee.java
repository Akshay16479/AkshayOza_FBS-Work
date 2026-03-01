package com.aug.demo;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table public class Mobilee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int imeiNo;
	
	@Column(name = "BRAND" ,length = 20)
	String brand;
	
	@Column(name = "PRICE" ,length = 20)
	double price;
	
	@Column(name = "MODEL" , length = 30)
	String model;
	
	@Column(name = "COLOUR" , length = 30)
	String colour;
	
	Mobilee()
	{
		
	}

	public Mobilee(int imeiNo, String brand, double price, String model, String colour) {
		super();
		this.imeiNo = imeiNo;
		this.brand = brand;
		this.price = price;
		this.model = model;
		this.colour = colour;
	}

	public int getImeiNo() {
		return imeiNo;
	}

	public void setImeiNo(int imeiNo) {
		this.imeiNo = imeiNo;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, colour, imeiNo, model, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mobilee other = (Mobilee) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(colour, other.colour) && imeiNo == other.imeiNo
				&& Objects.equals(model, other.model)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}

	@Override
	public String toString() {
		return "Mobile [imeiNo=" + imeiNo + ", brand=" + brand + ", price=" + price + ", model=" + model + ", colour="
				+ colour + "]";
	}
	
	
	
	
}
