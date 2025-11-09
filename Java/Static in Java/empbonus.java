import java.util.*;

class Employee {

    String name;
    double basicSalary;
    static double companyBonusRate;

    static {
        companyBonusRate = 12;     
    }

    Employee()                             // default constructor
    {
        this.name = "Unknown";
        this.basicSalary = 20000;
    }

    Employee(String n, double b)    // parameterized constructor
    {
        this.name = n;
        this.basicSalary = b;
    }



    // Setters
    void setName(String n) {
        this.name = n;
    }

    void setBasicSalary(double b) {
        this.basicSalary = b;
    }

    static void setCompanyBonusRate(double r) {
        companyBonusRate = r;
    }



    // Getters
    String getName() {
        return this.name;
    }

    double getBasicSalary() {
        return this.basicSalary;
    }

    double getCompanyBonusRate() {
        return companyBonusRate;
    }



    // calculate total salary
    double calculateTotalSalary() {
        return basicSalary + (basicSalary * companyBonusRate / 100);
    }



    // Display
    void display() {
        System.out.println("\nName: " + this.name);
        System.out.println("Basic Salary: " + this.basicSalary);
        System.out.println("Bonus Rate: " + companyBonusRate + "%");
        System.out.println("Total Salary: " + this.calculateTotalSalary());
    }

}  // class Employee ends here



class test {

    public static void main(String[] args) {

        Employee e1 = new Employee("Akshay", 53000);
        Employee e2 = new Employee("sakshi", 52000);

        e1.display();
        e2.display();

        // class se change 
        Employee.setCompanyBonusRate(15);

        e1.display();
        e2.display();
    }
}
