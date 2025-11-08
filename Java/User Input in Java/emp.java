import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    // default constructor
    Employee() {
        System.out.println("constructor called");

        this.id = 3727;
        this.name = "Akshay";
        this.salary = 20033;
    }

    // parameterized constructor
    Employee(int d, String n, double s) {
        System.out.println("parameterized constructor called");

        this.id = d;
        this.name = n;
        this.salary = s;
    }

    // display method
    void display() {
        System.out.println("Employee ID : " + this.id);
        System.out.println("Employee Name : " + this.name);
        System.out.println("Employee Salary : " + this.salary);
    }
}
// Employee class ends here


class test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee ID: ");
        int id = sc.nextInt();

        sc.nextLine();  // buffer clear
        System.out.println("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Employee Salary: ");
        double salary = sc.nextDouble();

        Employee e1 = new Employee(id, name, salary);
        e1.display();
    }
}
// test class ends here
