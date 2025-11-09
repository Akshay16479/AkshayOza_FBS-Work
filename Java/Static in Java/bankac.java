import java.util.*;

class BankAc{
	int acNum;
	String acHolderName;
	double currentBalance;
	static double interestRate;

	static
	{
		interestRate=6.7;
	}

	BankAc(){
		this.acNum=1234;
		this.acHolderName="swami";
		this.currentBalance=10000.1000;
		//this.interestRate=3.3;
	}

	BankAc(int no,String n,double current){
		this.acNum=no;
		this.acHolderName=n;
		this.currentBalance=current;
		//this.interestRate=intrest;
	}
	void setAcNum(int n){
		this.acNum=n;
	}
	void setAcHolderName(String n){
		this.acHolderName=n;
	}
	void setCurrentBalance(double n){
		this.currentBalance=n;
	}
	static void setInterestRate(double n){
		interestRate=n;
	}

	int getAcNum(){
		return this.acNum;
	}
	String getAcHolderName(){
		return this.acHolderName;
	}
	double getCurrentBalance(){
		return this.currentBalance;
	}
	double  getInterestRate(){
		return this.interestRate;
	}

	void display(){
		
		System.out.println("\n Account number:"+this.acNum);
		System.out.println("Name:"+this.acHolderName);
		System.out.println("Current Balance:"+this.currentBalance);
		System.out.println("Interest Rate:"+this.interestRate);
	}
}
//class BankAc ends hear

class test{

	public static void main(String []args){

		BankAc b1=new BankAc(1234,"Akshay",2000);
		b1.display();
		BankAc b2=new BankAc(1222,"xyz",5000);
		b2.display();
		BankAc b3=new BankAc(755,"Gabbar",1);
		b3.display();


		BankAc.setInterestRate(7.3);

		b1.display();
		b2.display();
		b3.display();

		b1.setInterestRate(7.6);

		b1.display();
		b2.display();
		b3.display();


	}

	}