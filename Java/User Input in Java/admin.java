import java.util.*;

class Admin {
    int id, allowance;
    String name;
    double salary;

    // Default constructor
    Admin() {
        System.out.println("constructor called");
        this.id = 3;
        this.name = "Akshu";
        this.allowance = 2056;
        this.salary = 39000;
    }

    // Parameterized constructor
    Admin(int d, int m, String y, double s) {
        System.out.println("parameterized constructor called");
        this.id = d;
        this.allowance = m;
        this.name = y;
        this.salary = s;
    }

    // Display method
    void display() {
        System.out.println("Admin ID : " + this.id);
        System.out.println("Admin Name : " + this.name);
        System.out.println("Admin Salary : " + this.salary);
        System.out.println("Admin Allowance : " + this.allowance);
    }
}

class test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Id: ");
        int id = sc.nextInt();

        sc.nextLine(); // buffer clear

        System.out.println("Enter Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Allowance: ");
        int allowance = sc.nextInt();

        System.out.println("Enter Salary: ");
        double salary = sc.nextDouble();

        Admin a1 = new Admin(id, allowance, name, salary);

        a1.display();
    }
}
