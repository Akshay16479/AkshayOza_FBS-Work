class Hr {
    int id;
    String name;
    int commission;
    double salary;

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

    double getSalary() {
        return this.salary;
    }
}
// Hr class ends here

class TestHr {
    public static void main(String[] args) {

        Hr h1, h2;
        h1 = new Hr();
        h2 = new Hr();

        h1.setId(7);
        h1.setName("Akshay");
        h1.setCommission(2782);
        h1.setSalary(37000.05);

        h2.setId(8);
        h2.setName("Shakshee");
        h2.setCommission(3500);
        h2.setSalary(42000.00);

        System.out.println("h1 Hr ID: " + h1.id);
        System.out.println("h1 Hr Name: " + h1.name);
        System.out.println("h1 Hr Commission: " + h1.commission);
        System.out.println("h1 Hr Salary: " + h1.salary);

        System.out.println("h2 Hr ID: " + h2.id);
        System.out.println("h2 Hr Name: " + h2.name);
        System.out.println("h2 Hr Commission: " + h2.commission);
        System.out.println("h2 Hr Salary: " + h2.salary);

        if (h1.getSalary() > h2.getSalary()) {
            System.out.println("h1 has higher salary");
        } else if (h1.getSalary() < h2.getSalary()) {
            System.out.println("h2 has higher salary");
        } 
    }
}
// TestHr class ends here
