class Admin {
    int id, allowance;
    String name;
    double salary;

    // Setters
    void setId(int d) {
        this.id = d;
    }

    void setAllowance(int m) {
        this.allowance = m;
    }

    void setName(String y) {
        this.name = y;
    }

    void setSalary(double s) {
        this.salary = s;
    }

    // Getters
    int getAllowance() {
        return this.allowance;
    }

    double getSalary() {
        return this.salary;
    }

    String getName() {
        return this.name;
    }

    int getId() {
        return this.id;
    }

    // Display method
    void display() {
        System.out.println("Admin ID : " + this.id);
        System.out.println("Admin Name : " + this.name);
        System.out.println("Admin Salary : " + this.salary);
        System.out.println("Admin Allowance : " + this.allowance);
    }
}
// admin class ends here


class testAdmin {
    public static void main(String[] args) {

        Admin a1 = new Admin();
        Admin a2 = new Admin();

        a1.setId(211);
        a1.setAllowance(17540);
        a1.setName("Akshay");
        a1.setSalary(50000);

        a2.setId(311);
        a2.setAllowance(14540);
        a2.setName("Aksh");
        a2.setSalary(30000);

        // Display details
        a1.display();
        a2.display();

        // Compare allowance
        if (a1.getAllowance() > a2.getAllowance()) {
            System.out.println("a1 allowance is more");
        } else {
            System.out.println("a2 allowance is more");
        }
    }
}
// testAdmin class ends here
