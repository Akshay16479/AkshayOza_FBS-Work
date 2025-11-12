package inheritance;

public class Hospital {

		String hospitalName;
		String location;
		int totalBeds;
		int totalStaff;
		double revenue;

		Hospital() {
			this.hospitalName = "CityCare Hospital";
			this.location = "Mumbai";
			this.totalBeds = 200;
			this.totalStaff = 150;
			this.revenue = 5000000.0;
		}

		Hospital(String hospitalName, String location, int totalBeds, int totalStaff, double revenue) {
			this.hospitalName = hospitalName;
			this.location = location;
			this.totalBeds = totalBeds;
			this.totalStaff = totalStaff;
			this.revenue = revenue;
		}

		String getHospitalName() {
			return hospitalName;
		}

		void setHospitalName(String hospitalName) {
			this.hospitalName = hospitalName;
		}

		String getLocation() {
			return location;
		}

		void setLocation(String location) {
			this.location = location;
		}

		int getTotalBeds() {
			return totalBeds;
		}

		void setTotalBeds(int totalBeds) {
			this.totalBeds = totalBeds;
		}

		int getTotalStaff() {
			return totalStaff;
		}

		void setTotalStaff(int totalStaff) {
			this.totalStaff = totalStaff;
		}

		double getRevenue() {
			return revenue;
		}

		void setRevenue(double revenue) {
			this.revenue = revenue;
		}

		void display() {
			System.out.println("Hospital Name: " + hospitalName);
			System.out.println("Location: " + location);
			System.out.println("Total Beds: " + totalBeds);
			System.out.println("Total Staff: " + totalStaff);
			System.out.println("Revenue: " + revenue);
		}
	}

	// Subclass 1: Doctor
	class Doctor extends Hospital {
		String doctorName;
		String specialization;
		int experience;
		String qualification;
		double salary;

		Doctor() {
			super();
			this.doctorName = "Dr. Sharma";
			this.specialization = "Cardiology";
			this.experience = 10;
			this.qualification = "MBBS, MD";
			this.salary = 120000.0;
		}

		Doctor(String hospitalName, String location, int totalBeds, int totalStaff, double revenue, String doctorName,
				String specialization, int experience, String qualification, double salary) {
			super(hospitalName, location, totalBeds, totalStaff, revenue);
			this.doctorName = doctorName;
			this.specialization = specialization;
			this.experience = experience;
			this.qualification = qualification;
			this.salary = salary;
		}

		void display() {
			super.display();
			System.out.println("Doctor Name: " + doctorName);
			System.out.println("Specialization: " + specialization);
			System.out.println("Experience: " + experience + " years");
			System.out.println("Qualification: " + qualification);
			System.out.println("Salary: " + salary);
		}
	}

	// Subclass 2: Nurse
	class Nurse extends Hospital {
		String nurseName;
		String shift;
		int experience;
		String department;
		double salary;

		Nurse() {
			super();
			this.nurseName = "Anita";
			this.shift = "Night";
			this.experience = 5;
			this.department = "ICU";
			this.salary = 45000.0;
		}

		Nurse(String hospitalName, String location, int totalBeds, int totalStaff, double revenue, String nurseName,
				String shift, int experience, String department, double salary) {
			super(hospitalName, location, totalBeds, totalStaff, revenue);
			this.nurseName = nurseName;
			this.shift = shift;
			this.experience = experience;
			this.department = department;
			this.salary = salary;
		}

		String getNurseName() {
			return nurseName;
		}

		void setNurseName(String nurseName) {
			this.nurseName = nurseName;
		}

		String getShift() {
			return shift;
		}

		void setShift(String shift) {
			this.shift = shift;
		}

		int getExperience() {
			return experience;
		}

		void setExperience(int experience) {
			this.experience = experience;
		}

		String getDepartment() {
			return department;
		}

		void setDepartment(String department) {
			this.department = department;
		}

		double getSalary() {
			return salary;
		}

		void setSalary(double salary) {
			this.salary = salary;
		}

		void display() {
			super.display();
			System.out.println("Nurse Name: " + nurseName);
			System.out.println("Shift: " + shift);
			System.out.println("Experience: " + experience + " years");
			System.out.println("Department: " + department);
			System.out.println("Salary: " + salary);
		}
	}

	// Subclass 3: Patient
	class Patient extends Hospital {
		String patientName;
		int age;
		String disease;
		String doctorAssigned;
		double billAmount;

		Patient() {
			super();
			this.patientName = "Rohit Verma";
			this.age = 35;
			this.disease = "Flu";
			this.doctorAssigned = "Dr. Sharma";
			this.billAmount = 2500.0;
		}

		Patient(String hospitalName, String location, int totalBeds, int totalStaff, double revenue, String patientName,
				int age, String disease, String doctorAssigned, double billAmount) {
			super(hospitalName, location, totalBeds, totalStaff, revenue);
			this.patientName = patientName;
			this.age = age;
			this.disease = disease;
			this.doctorAssigned = doctorAssigned;
			this.billAmount = billAmount;
		}

		String getPatientName() {
			return patientName;
		}

		void setPatientName(String patientName) {
			this.patientName = patientName;
		}

		int getAge() {
			return age;
		}

		void setAge(int age) {
			this.age = age;
		}

		String getDisease() {
			return disease;
		}

		void setDisease(String disease) {
			this.disease = disease;
		}

		String getDoctorAssigned() {
			return doctorAssigned;
		}

		void setDoctorAssigned(String doctorAssigned) {
			this.doctorAssigned = doctorAssigned;
		}

		double getBillAmount() {
			return billAmount;
		}

		void setBillAmount(double billAmount) {
			this.billAmount = billAmount;
		}

		void display() {
			super.display();
			System.out.println("Patient Name: " + patientName);
			System.out.println("Age: " + age);
			System.out.println("Disease: " + disease);
			System.out.println("Doctor Assigned: " + doctorAssigned);
			System.out.println("Bill Amount: " + billAmount);
		}
	}

	// Test class
	class TestHospital {
		public static void main(String[] args) {
			Doctor d1 = new Doctor();
			d1.display();
			System.out.println();

			Nurse n1 = new Nurse();
			n1.display();
			System.out.println();

			Patient p1 = new Patient();
			p1.display();
		}
	}


