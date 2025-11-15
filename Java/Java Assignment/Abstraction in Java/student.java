package abstraction;

abstract public class student {

		
		
		int fbsid;
		String name;
		int distance;
		
		
		
		// Default Constructor
		student() {
			System.out.println("Student default constructor");
			fbsid = 100;
			name = "not given";
			distance = 120;
		}
		
		
		// Parameterized Constructor
		student(int fbsid, String name, int distance) {
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
		
		
		
		abstract  double calculateTicketAllowance();
		
		
		
		public String toString()
	    {
	    	return "fbs id : " + this.fbsid + " name : " + this.name + " distance : " + this.distance + "\n" ;
	    }
		
	} // class Studentt ends





	class PlacedStudent extends student {
		
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
	
		public String toString()
	    {
	    	return super.toString() + " Company Name : " + this.cname  +  " Designation  : " + this.designation + " \n " ;
	    }
		
	} // class PlacedStudent ends





	class TestStudent {
		
		public static void main(String[] args) {
			
			student s;
			
			//s = new student(101, "abc", 15);
			//System.out.println(s.toString());
			//s.calculateTicketAllowance();
			//System.out.println();
			
			
			s = new PlacedStudent(102, "akshay", 15, "Infosys", "Developer");
			System.out.println(s.toString());
			System.out.println("Allowance: " + s.calculateTicketAllowance());

			
			s = new PlacedStudent(104, "aksh", 32, "abc", "SAP");
			System.out.println(s.toString());
			System.out.println("Allowance: " + s.calculateTicketAllowance());

		}
		
	} // class TestStudent ends


