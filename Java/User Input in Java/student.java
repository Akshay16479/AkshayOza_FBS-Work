import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int mark;

    // default constructor
    Student() {
        System.out.println("constructor called");

        this.rollNo = 3;
        this.name = "shakshee";
        this.mark = 94;
    }

    // parameterized constructor
    Student(int r, String n, int m) {
        System.out.println("parameterized constructor called");

        this.rollNo = r;
        this.name = n;
        this.mark = m;
    }

    // display method
    void display() {
        System.out.println("Student Roll No : " + this.rollNo);
        System.out.println("Student Name : " + this.name);
        System.out.println("Student Mark : " + this.mark);
    }
}
// Student class ends here


class test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Roll No: ");
        int roll = sc.nextInt();

        sc.nextLine();   // buffer clear
        System.out.println("Enter Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Marks: ");
        int marks = sc.nextInt();

        Student s1 = new Student(roll, name, marks);
        s1.display();
    }
}
// test class ends here
