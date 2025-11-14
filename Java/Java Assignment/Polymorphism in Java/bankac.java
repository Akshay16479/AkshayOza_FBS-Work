package poly;

 class Bankacc {

	    int acNum;
	    String acHolderName;
	    double currentBalance;
	    static double interestRate;

	    static {
	        interestRate = 6.7;
	    }
	    

	    // Default Constructor
	    Bankacc() {
	        System.out.println("BankAc Default Constructor");
	        this.acNum = 1234;
	        this.acHolderName = "Swami";
	        this.currentBalance = 10000.10;
	    }

	    // Parameterized Constructor
	    Bankacc(int acNum, String acHolderName, double currentBalance) {
	        System.out.println("BankAc Parameterized Constructor");
	        this.acNum = acNum;
	        this.acHolderName = acHolderName;
	        this.currentBalance = currentBalance;
	    }

	    // Setters
	    void setAcNum(int acNum) {
	        this.acNum = acNum;
	    }

	    void setAcHolderName(String acHolderName) {
	        this.acHolderName = acHolderName;
	    }

	    void setCurrentBalance(double currentBalance) {
	        this.currentBalance = currentBalance;
	    }
	        
	        static void setInterestRate(double rate) {
	            interestRate = rate;
	        }
	    

	    
	    // Getters
	    int getAcNum() {
	        return acNum;
	    }

	    String getAcHolderName() {
	        return acHolderName;
	    }

	    double getCurrentBalance() {
	        return currentBalance;
	    }
	    double getInterestRate() {
	        return interestRate;
	    }
	    
	    double calculateInterest() {
	        return currentBalance * interestRate / 100;
	    }

	    // Display Method
	    void display() {
	        System.out.println("\nAccount Number     : " + acNum);
	        System.out.println("Account Holder Name: " + acHolderName);
	        System.out.println("Current Balance    : " + currentBalance);
	        System.out.println("Interest Rate  : " + interestRate);
	        System.out.println("Calculated Interest: " + calculateInterest());
	    }

	} // class BankAc ends here



	class SavingsAccount extends Bankacc {

	    // para constructor
	    SavingsAccount(int acNum, String acHolderName, double currentBalance) 
	    {
	        super(acNum, acHolderName, currentBalance);
	        System.out.println("SavingsAccount Constructor");
	    }

	    double calculateInterest() 
	    {
	        return currentBalance * (interestRate + 2.0) / 100;
	    }

	    // Display
	    void display() {
	        super.display();
	        System.out.println("Account Type : Savings Account");
	    }

	} // class SavingsAccount ends here



	class CurrentAccount extends Bankacc {

	    // constructor
	    CurrentAccount(int acNum, String acHolderName, double currentBalance) 
	    {
	        super(acNum, acHolderName, currentBalance);
	        System.out.println("CurrentAccount Constructor");
	    }

	    double calculateInterest() 
	    {
	        return currentBalance * (interestRate + 1.5) / 100;
	    }

	    // Display
	    void display() {
	        super.display();
	        System.out.println("Account Type : Current Account");
	    }

	} // class CurrentAccount ends here



	
	class TestBank {

	    public static void main(String[] args) {

	        Bankacc b;

	        b = new Bankacc(101, "Akshay", 10000);
	        b.display();
	        b.calculateInterest();
	        System.out.println();

	        b = new SavingsAccount(102, "Rahul", 15000);
	        b.display();
	        b.calculateInterest();
	        System.out.println();

	        b = new CurrentAccount(103, "Sneha", 20000);
	        b.display();
	        b.calculateInterest();

	      
	    }

	} // class TestBank ends here
