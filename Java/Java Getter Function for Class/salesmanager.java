class SalesManager {
    int id;
    String name;
    double salary;
    double incentive;
    int target;

    void setId(int i) {
        this.id = i;
    }

    void setName(String n) {
        this.name = n;
    }

    void setSalary(double s) {
        this.salary = s;
    }

    void setIncentive(double inc) {
        this.incentive = inc;
    }

    void setTarget(int t) {
        this.target = t;
    }

    double getTotalEarnings() {
        return this.salary + this.incentive;
    }
}
// SalesManager class ends here

class TestSalesManager {
    public static void main(String[] args) {

        SalesManager sm1, sm2;
        sm1 = new SalesManager();
        sm2 = new SalesManager();

        sm1.setId(101);
        sm1.setName("Akshay");
        sm1.setSalary(45000.50);
        sm1.setIncentive(5000.75);
        sm1.setTarget(10);

        sm2.setId(102);
        sm2.setName("Rohit");
        sm2.setSalary(48000.00);
        sm2.setIncentive(6000.00);
        sm2.setTarget(12);

       
        if (sm1.getTotalEarnings() > sm2.getTotalEarnings()) {
            System.out.println("sm1 has higher total earnings");
        } else if (sm1.getTotalEarnings() < sm2.getTotalEarnings()) {
            System.out.println("sm2 has higher total earnings");
        } 
    }
}
// TestSalesManager class ends here
