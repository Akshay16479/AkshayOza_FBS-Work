class Hr {
    int id;
    String name;
    int commission;
    double salary;


//default constructor

Hr(){
System.out.println("contructor called");

this.id=369;
this.name="akshu";
this.commission=5010;
this.salary=56000;

}



    // Setters
    void setId(int i) {
        this.id = i;
    }

    void setName(String s) {
        this.name = s;
    }

    void setCommission(int a) {
        this.commission = a;
    }

    void setSalary(double sl) {
        this.salary = sl;
    }

    // Getter
    double getSalary() {
        return this.salary;
    }

    int getCommission() {
        return this.commission;
    }

    String getName() {
        return this.name;
    }

    int getId() {
        return this.id;
    }

    // Display Method
    void display() {
        System.out.println("HR ID : " + this.id);
        System.out.println("HR Name : " + this.name);
        System.out.println("HR Commission : " + this.commission);
        System.out.println("HR Salary : " + this.salary);
    }
}
// Hr class ends here


class test {
    public static void main(String[] args) {

        Hr h1 = new Hr();
        Hr h2 = new Hr();

        /*h1.setId(7);
        h1.setName("Akshay");
        h1.setCommission(2782);
        h1.setSalary(37000.05);

        h2.setId(8);
        h2.setName("Shakshee");
        h2.setCommission(3500);
        h2.setSalary(42000.00);*/

        // Display both HR records
        h1.display();
        h2.display();

        if (h1.getSalary() > h2.getSalary()) {
            System.out.println("h1 has higher salary");
        } else if (h1.getSalary() < h2.getSalary()) {
            System.out.println("h2 has higher salary");
        }
    }
}
// TestHr class ends here
