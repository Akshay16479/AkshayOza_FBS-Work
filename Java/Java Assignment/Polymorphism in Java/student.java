package poly;

class Studentt {
	
	
	int fbsid;
	String name;
	int distance;
	
	
	
	// Default Constructor
	Studentt() {
		System.out.println("Student default constructor");
		fbsid = 100;
		name = "not given";
		distance = 120;
	}
	
	
	// Parameterized Constructor
	Studentt(int fbsid, String name, int distance) {
		System.out.println("Student parameterized constructor");
		this.fbsid = fbsid;
		this.name = name;
		this.distance = distance;
	}
	
	
	// Setters and Getters
	int getFbsid() {
		return fbsid;
	}
	void setFbsid(int fbsid) {
		this.fbsid = fbsid;
	}
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	
	int getDistance() {
		return distance;
	}
	void setDistance(int distance) {
		this.distance = distance;
	}
	
	
	
	double calculateTicketAllowance() {
		return distance * 20; 
	}
	
	
	// Display
	void display() {
		System.out.println("Firstbit ID : " + this.fbsid);
		System.out.println("Name  : " + this.name);
		System.out.println("Distance (km) : " + this.distance);
		System.out.println("Allowance  : " + calculateTicketAllowance());
	}
	
} // class Studentt ends





class PlacedStudent extends Studentt {
	
	String cname;
	String designation;
	
	
	// Default Constructor
	PlacedStudent() {
		super();
		System.out.println("PlacedStudent default constructor");
		cname = "xyz";
		designation = "abc";
	}
	
	
	// Parameterized Constructor
	PlacedStudent(int fbsid, String name, int distance, String cname, String designation) {
		super(fbsid, name, distance);
		System.out.println("PlacedStudent parameterized constructor");
		this.cname = cname;
		this.designation = designation;
	}
	
	
	// Setters and Getters
	String getCname() {
		return cname;
	}
	void setCname(String cname) {
		this.cname = cname;
	}
	
	String getDesignation() {
		return designation;
	}
	void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	double calculateTicketAllowance() {
		return distance * 10; 
	}
	
	
	// Display
	void display() {
		super.display();
		System.out.println("Company Name : " + this.cname);
		System.out.println("Designation  : " + this.designation);
		System.out.println("Allowance  : " + calculateTicketAllowance());
	}
	
} // class PlacedStudent ends





class TestStudent {
	
	public static void main(String[] args) {
		
		Studentt s;
		
		s = new Studentt(101, "abc", 15);
		s.display();
		s.calculateTicketAllowance();
		System.out.println();
		
		
		s = new PlacedStudent(102, "akshay", 15, "Infosys", "Developer");
		s.display();
		s.calculateTicketAllowance();
	}
	
} // class TestStudent ends
