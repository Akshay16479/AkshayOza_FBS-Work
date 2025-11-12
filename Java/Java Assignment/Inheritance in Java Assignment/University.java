package inheritance;

public class University {
	
       String universityName;
		String location;
		int noOfColleges;
		int noOfStudents;
		double budget;

		University() {
			this.universityName = "National University";
			this.location = "Delhi";
			this.noOfColleges = 15;
			this.noOfStudents = 30000;
			this.budget = 50000000.0;
		}

		University(String universityName, String location, int noOfColleges, int noOfStudents, double budget) {
			this.universityName = universityName;
			this.location = location;
			this.noOfColleges = noOfColleges;
			this.noOfStudents = noOfStudents;
			this.budget = budget;
		}

		String getUniversityName() {
			return universityName;
		}

		void setUniversityName(String universityName) {
			this.universityName = universityName;
		}

		String getLocation() {
			return location;
		}

		void setLocation(String location) {
			this.location = location;
		}

		int getNoOfColleges() {
			return noOfColleges;
		}

		void setNoOfColleges(int noOfColleges) {
			this.noOfColleges = noOfColleges;
		}

		int getNoOfStudents() {
			return noOfStudents;
		}

		void setNoOfStudents(int noOfStudents) {
			this.noOfStudents = noOfStudents;
		}

		double getBudget() {
			return budget;
		}

		void setBudget(double budget) {
			this.budget = budget;
		}

		void display() {
			System.out.println("University Name: " + universityName);
			System.out.println("Location: " + location);
			System.out.println("No. of Colleges: " + noOfColleges);
			System.out.println("No. of Students: " + noOfStudents);
			System.out.println("Budget: " + budget);
		}
	}

	// Subclass 1: College
	class College extends University {
		String collegeName;
		int noOfDepartments;
		int noOfTeachers;
		int noOfStudents;
		String principalName;

		College() {
			super();
			this.collegeName = "ABC College";
			this.noOfDepartments = 8;
			this.noOfTeachers = 120;
			this.noOfStudents = 2000;
			this.principalName = "Dr. Mehta";
		}

		College(String universityName, String location, int noOfColleges, int noOfStudents, double budget,
				String collegeName, int noOfDepartments, int noOfTeachers, int noOfStudentsCollege, String principalName) {
			super(universityName, location, noOfColleges, noOfStudents, budget);
			this.collegeName = collegeName;
			this.noOfDepartments = noOfDepartments;
			this.noOfTeachers = noOfTeachers;
			this.noOfStudents = noOfStudentsCollege;
			this.principalName = principalName;
		}
		

		String getCollegeName() {
			return collegeName;
		}

		void setCollegeName(String collegeName) {
			this.collegeName = collegeName;
		}

		int getNoOfDepartments() {
			return noOfDepartments;
		}

		void setNoOfDepartments(int noOfDepartments) {
			this.noOfDepartments = noOfDepartments;
		}

		int getNoOfTeachers() {
			return noOfTeachers;
		}

		void setNoOfTeachers(int noOfTeachers) {
			this.noOfTeachers = noOfTeachers;
		}

		int getNoOfStudents() {
			return noOfStudents;
		}

		void setNoOfStudents(int noOfStudents) {
			this.noOfStudents = noOfStudents;
		}

		String getPrincipalName() {
			return principalName;
		}

		void setPrincipalName(String principalName) {
			this.principalName = principalName;
		}

		void display() {
			super.display();
			System.out.println("College Name: " + collegeName);
			System.out.println("No. of Departments: " + noOfDepartments);
			System.out.println("No. of Teachers: " + noOfTeachers);
			System.out.println("No. of Students: " + noOfStudents);
			System.out.println("Principal: " + principalName);
		}
	}

	// Subclass 2: Department
	class Department extends University {
		String departmentName;
		int noOfProfessors;
		int noOfLabs;
		int noOfCourses;
		String hodName;

		Department() {
			super();
			this.departmentName = "Computer Science";
			this.noOfProfessors = 10;
			this.noOfLabs = 5;
			this.noOfCourses = 12;
			this.hodName = "Dr. Gupta";
		}

		Department(String universityName, String location, int noOfColleges, int noOfStudents, double budget,
				String departmentName, int noOfProfessors, int noOfLabs, int noOfCourses, String hodName) {
			super(universityName, location, noOfColleges, noOfStudents, budget);
			this.departmentName = departmentName;
			this.noOfProfessors = noOfProfessors;
			this.noOfLabs = noOfLabs;
			this.noOfCourses = noOfCourses;
			this.hodName = hodName;
		}

		void display() {
			super.display();
			System.out.println("Department Name: " + departmentName);
			System.out.println("No. of Professors: " + noOfProfessors);
			System.out.println("No. of Labs: " + noOfLabs);
			System.out.println("No. of Courses: " + noOfCourses);
			System.out.println("HOD Name: " + hodName);
		}
	}

	// Subclass 3: Faculty
	class Faculty extends University {
		String facultyName;
		String qualification;
		int experience;
		String designation;
		double salary;

		Faculty() {
			super();
			this.facultyName = "Rajesh Kumar";
			this.qualification = "Ph.D.";
			this.experience = 12;
			this.designation = "Professor";
			this.salary = 90000.0;
		}

		Faculty(String universityName, String location, int noOfColleges, int noOfStudents, double budget,
				String facultyName, String qualification, int experience, String designation, double salary) {
			super(universityName, location, noOfColleges, noOfStudents, budget);
			this.facultyName = facultyName;
			this.qualification = qualification;
			this.experience = experience;
			this.designation = designation;
			this.salary = salary;
		}
		

		String getFacultyName() {
			return facultyName;
		}

		void setFacultyName(String facultyName) {
			this.facultyName = facultyName;
		}

		String getQualification() {
			return qualification;
		}

		void setQualification(String qualification) {
			this.qualification = qualification;
		}

		int getExperience() {
			return experience;
		}

		void setExperience(int experience) {
			this.experience = experience;
		}

		String getDesignation() {
			return designation;
		}

		void setDesignation(String designation) {
			this.designation = designation;
		}

		double getSalary() {
			return salary;
		}

		void setSalary(double salary) {
			this.salary = salary;
		}

		void display() {
			super.display();
			System.out.println("Faculty Name: " + facultyName);
			System.out.println("Qualification: " + qualification);
			System.out.println("Experience: " + experience + " years");
			System.out.println("Designation: " + designation);
			System.out.println("Salary: " + salary);
		}
	}

	// Test class
	class TestUniversity {
		public static void main(String[] args) {
			College c1 = new College();
			c1.display();
			System.out.println();

			Department d1 = new Department();
			d1.display();
			System.out.println();

			Faculty f1 = new Faculty();
			f1.display();
		}
	}


