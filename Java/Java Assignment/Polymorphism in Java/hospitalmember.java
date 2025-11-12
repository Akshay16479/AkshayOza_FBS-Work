package inheritance;

public class HospitalMember {
	int id;
	String name;
	int contactno;

	//default constructor
	HospitalMember()
	{
		 id=111445;
		 name="shaktimam";
		 contactno=4578524;
	}
	
	//parameterized constructor
	HospitalMember(int id,String name,int contactno)
	{
		 this.id=id;
		 this.name=name;
		 this.contactno=contactno;
	}

	
//setter and getter	
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
	double getContactno() {
		return contactno;
	}
	void setContactno(double contactno) {
		this.contactno = contactno;
	}
	
//display
	void display()
	{
		System.out.println("id is : "+this.id);
		System.out.println("name is : "+this.name);
		System.out.println("contactno is : "+this.contactno);

	}
	
}//class HospitalMember ends 

class Doctor extends HospitalMember
{
	int yearOfexperience;
	String specialzation;
	
//default
	Doctor()
	{
		super();
		 yearOfexperience=5;
		 specialzation="heart";
	}
	
//parameterized
	Doctor(int id,String name,int contactno,int yearOfexperience,String specialzation)
	{
		super(id,name,contactno,yearOfexperience,specialzation);
		 yearOfexperience=5;
		 specialzation="heart";
	}

//setters-getters	
	int getYearOfexperience() {
		return yearOfexperience;
	}

	void setYearOfexperience(int yearOfexperience) {
		this.yearOfexperience = yearOfexperience;
	}

	String getSpecialzation() {
		return specialzation;
	}

	void setSpecialzation(String specialzation) {
		this.specialzation = specialzation;
	}
	
//display
	void display()
	{
		super.display();
		System.out.println("yearOfexperience is : "+this.yearOfexperience);
		System.out.println("specialzation is : "+this.specialzation);

	}
	
}//class doctor ends here


class Patient extends HospitalMember
{
	int insuranceid;
	String condition;
	
//default
	Patient()
	{
		super();
		insuranceid=5366;
		condition="critical";
	}
	
//parameterized
	Patient(int id,String name,int contactno,int insuranceid,String condition)
	{
		super(id,name,contactno,insuranceid,condition);
		this.insuranceid=insuranceid;
		this.condition=condition;
	}

//setter and getter
	int getInsuranceid() {
		return insuranceid;
	}

	void setInsuranceid(int insuranceid) {
		this.insuranceid = insuranceid;
	}

	String getCondition() {
		return condition;
	}

	void setCondition(String condition) {
		this.condition = condition;
	}
	
//display
		void display()
		{
			super.display();
			System.out.println("insuranceid is : "+this.insuranceid);
			System.out.println("condition is : "+this.condition);

		}	
	
}//class patient ends

class testh{
	public static void main(String[] args) {
		
		HospitalMember h1=new HospitalMember(121,"hehe",454512);
		h1.display();
		
		 h1=new Doctor(301,"mno",5458445,12,"dental");
		h1.display();
		
	    h1=new Patient(212,"abc",254521,784,"stable");
		h1.display();
		
	}
}

