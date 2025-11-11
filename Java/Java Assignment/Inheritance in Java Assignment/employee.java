package inheritance;

 class Employee {
	 int id;
	 String name;
	 double salary;
	 
	 Employee()
	 {
		 
		System.out.println("emp default constructor");
		  id=121;
		  name="pqr";
		  salary=35000;
	 }//default
	 
	
	 Employee(int id, String name, double salary) {
		
		System.out.println("emp para constructor");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}//parameterized



//getters and stters
	 int getId() {
		return id;
	}
	 void setId(int id) {
		this.id = id;
	}
	 String getName() {
		return name;
	}
	 void setName(String name) {
		this.name = name;
	}
	 double getSalary() {
		return salary;
	}
	 void setSalary(double salary) {
		this.salary = salary;
	}
	 
	 //display
	void display()
	{
		System.out.println("emp id is: "+this.id);
		System.out.println("emp name is: "+this.name);
		System.out.println("emp salary is: "+this.salary);

	}
	 
	}//class employee ends
 
 
 class Hr extends Employee
 {
	 int commission;

	 Hr(){
		 super();
		  commission=2700;
	 }//default  
	 
	 
  Hr(int id,String name,double salary,int commission) {
	  super(id,name,salary);
		this.commission = commission;
	}//parameterized
	 
//getter-setter	 
	 int getCommission() {
		return commission;
	}

	 void setCommission(int commission) {
		this.commission = commission;
	}

//display	 
	 void display() {
		 super.display();
		 System.out.println("commission is : "+this.commission);
	 }
	 
	
 }
 
 class Admin extends Employee{
	 int allowance;
	 
	 Admin(){
		 super();
		  allowance=5000;
	 }//default  
	 
	 
   Admin(int id,String name,double salary,int allowance) {
	   super(id,name,salary);
		this.allowance = allowance;
	}//parameterized


//setter-getter
	 int getAllowance() {
		return allowance;
	}

	 void setAllowance(int allowance) {
		this.allowance = allowance;
	}
	 
	
//display	 
	 void display() {
		 super.display();
		 System.out.println("allowance is : "+this.allowance);
	 }
	 
 }//class admin ends

 
 class test{
	public static void main(String[] args) {
		
		Employee e1=new Employee();
		e1.display();
		Admin a1=new Admin();
		a1.display();
		Hr h1=new Hr();
		h1.display();
	
	}
 }

