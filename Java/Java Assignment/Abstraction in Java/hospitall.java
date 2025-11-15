package abstraction;

abstract class Hospitall {
	
	
		    String name;
		    String location;
		    int staffCount;

		    // Default Constructor
		    Hospitall() {
		        name = "City Hospital";
		        location = "Pune";
		        staffCount = 50;
		    }

		    // Parameterized Constructor
		    Hospitall(String name, String location, int staffCount) {
		        this.name = name;
		        this.location = location;
		        this.staffCount = staffCount;
		    }

		    // Setters
		    void setName(String name) {
		        this.name = name;
		    }

		    void setLocation(String location) {
		        this.location = location;
		    }

		    void setStaffCount(int staffCount) {
		        this.staffCount = staffCount;
		    }

		    // Getters
		    String getName() {
		        return name;
		    }

		    String getLocation() {
		        return location;
		    }

		    int getStaffCount() {
		        return staffCount;
		    }

		    abstract void dailyDuty();
		    
	
		    
		    public String toString()
		    {
		    	return "\nHospital Name: "+ this.name + "Location: " + this.location + "Staff Count: " + this.staffCount  + "\n" ;
		    }
		    
		    
		}


		class Doctor extends Hospitall {

		    String specialization;

		    // Default Constructor
		    Doctor() {
		        super();
		        specialization = "General Physician";
		    }
		    

		    // Parameterized Constructor
		        Doctor(String name, String location, int staffCount, String specialization) {
		            super(name, location, staffCount);
		            this.specialization = specialization;
		        }
		        
		    void dailyDuty() {
		        System.out.println("Doctor checks patients and prescribes medicines.");
		    }

		   
		    public String toString()
		    {
		    	return super.toString() + "Specialization: " + this.specialization + "\n" ;
		    }
		    
		}

		class Nurse extends Hospitall {

		    int wardNumber;

		    // Default Constructor
		    Nurse() {
		        super();
		        wardNumber = 5;
		    }

		    // Parameterized Constructor
		    Nurse(String name, String location, int staffCount, int wardNumber) {
		        super(name, location, staffCount);
		        this.wardNumber = wardNumber;
		    }

		    void dailyDuty() {
		        System.out.println("Nurse takes care of patients and assists doctors.");
		    }

		    
		    public String toString()
		    {
		    	return super.toString() + "Assigned Ward Number: " + this.wardNumber + "\n" ;
		    }
		    
		}


		class TestHospital {
		    public static void main(String[] args) {

		        Hospitall h;
		        
		        h = new Doctor("Apollo Hospital", "Mumbai", 100, "Cardiologist");
		        System.out.println(h.toString());
		      h.dailyDuty();
		       System.out.println();

		        h = new Nurse("Ruby Hall Clinic", "Pune", 75, 12);
		        System.out.println(h.toString());
			      h.dailyDuty();

		    }
		}
