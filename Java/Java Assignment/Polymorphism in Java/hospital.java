package poly;

 class Hospitall {
	

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

	    void dailyDuty() {
	        System.out.println("General hospital operations are being conducted.");
	    }

	    // Display 
	    void display() {
	        System.out.println("\nHospital Name: "+ this.name);
	        System.out.println("Location: " + this.location);
	        System.out.println("Staff Count: " + this.staffCount);
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

	    void display() {
	        super.display();
	        System.out.println("Specialization: " + this.specialization);
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

	    void display() {
	        super.display();
	        System.out.println("Assigned Ward Number: " + this.wardNumber);
	    }
	}


	class TestHospital {
	    public static void main(String[] args) {

	        Hospitall h;

	        h = new Hospitall();
	        h.display();
	        h.dailyDuty();
	        System.out.println();

	        h = new Doctor("Apollo Hospital", "Mumbai", 100, "Cardiologist");
	        h.display();
	        h.dailyDuty();

	        System.out.println();

	        h = new Nurse("Ruby Hall Clinic", "Pune", 75, 12);
	        h.display();
	        h.dailyDuty();

	    }
	}

