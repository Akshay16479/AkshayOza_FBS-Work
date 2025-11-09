import java.util.*;

class ElectricityBill{
	int billid;
	String name;
	int units;
	static double rateperunit;

	static                                // static
	{
		rateperunit=12;
	}

	ElectricityBill(){                    // default constructor
		this.billid=1234;
		this.name="akshay";
		this.units=52;
		//this.rateperunit=10;
	}


	ElectricityBill(int i,String s,int u){     // parameterized constructor
		this.billid=i;
		this.name=s;
		this.units=u;
		//this.rateperunit=rate;
	}



	void setBillId(int n){                       // Setters

		this.billid=n;
	}
	void setName(String n){
		this.name=n;
	}
	void setUnits(int n){
		this.units=n;
	}
	static void setRatePerUnit(double n){
		rateperunit=n;
	}




	int getBillId(){                             // Getters

		return this.billid;
	}
	String getName(){
		return this.name;
	}
	int getUnits(){
		return this.units;
	}
	double  getRatePerUnit(){
		return this.rateperunit;
	}



 double calculatebill(){                     //non-static calculate bill
 return this.units * rateperunit;
}


	void display(){                    //display

		System.out.println("\n Bill Id:" + this.billid);
		System.out.println("Name:" + this.name);
		System.out.println("Units:" + this.units);
		System.out.println("Rate per unit:" + this.rateperunit);
                System.out.println("Total Bill:" + this.calculatebill());

	}
}
//class ElectricityBill ends here




class test{

	public static void main(String []args){

		ElectricityBill e1=new ElectricityBill(1234,"Akshay",37);
		e1.display();
		ElectricityBill e2=new ElectricityBill(1222,"xyz",42);
		e2.display();
		ElectricityBill e3=new ElectricityBill(7555,"Gabbar",35);
		e3.display();


//using class(all will change)

		ElectricityBill.setRatePerUnit(13);

		e1.display();
		e2.display();
		e3.display();


//using object(all will change-aese bol sakte static variable shared  by all objects in class)

		e1.setRatePerUnit(15);

		e1.display();
		e2.display();
		e3.display();


	}

	}