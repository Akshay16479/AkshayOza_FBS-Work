class Employee {
    int id;
    String name;
    double salary;



//default constructor

Employee(){
System.out.println("contructor called");

this.id=3727;
this.name="Akshay";
this.salary=20033;

}



    // setter

    void setId(int i) {
        this.id = i;
    }

    void setName(String n) {
        this.name = n;
    }

    void setSalary(double s) {
        this.salary = s;
    }


    // getter

    double getSalary() {
        return this.salary;
    }


    // display

    void display() {
        System.out.println("Employee ID: " + this.id);
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee Salary: " + this.salary);
    }
}

// Employee class ends here


class test {
    public static void main(String[] args) {

        Employee e1, e2;
        e1 = new Employee();
        e2 = new Employee();

        /*e1.setId(101);
        e1.setName("Akshay");
        e1.setSalary(55000.50);

        e2.setId(102);
        e2.setName("Rohit");
        e2.setSalary(65000.00);*/

        e1.display();
        e2.display();

        if (e1.getSalary() > e2.getSalary()) {
            System.out.println("e1 has higher salary");
        } else if (e1.getSalary() < e2.getSalary()) {
            System.out.println("e2 has higher salary");
        }
    }
}
// test class ends here
