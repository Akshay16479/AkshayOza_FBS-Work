class Employee {
    int Id;
    String name;
    double salary;

    void setId(int i) {
        this.Id = i;
    }

    void setName(String n) {  
        this.name = n;
    }

    void setSalary(double s) {
        this.salary = s;
    }
}

class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee();

        e1.setId(101);
        e1.setName("Akshay");
        e1.setSalary(55000.50);

        System.out.println("Employee ID: " + e1.Id);
        System.out.println("Employee Name: " + e1.name);
        System.out.println("Employee Salary: " + e1.salary);
    }
}
