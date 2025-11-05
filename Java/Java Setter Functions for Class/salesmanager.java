class SalesManager {
    int id;
    String name;
    double salary;
    double incentive;
    int target;

    void setid(int i) { 
        this.id = i;
    }

    void setname(String n) { 
        this.name = n;
    }

    void setsalary(double s) { 
        this.salary = s;
    }

    void setincentive(double inc) { 
        this.incentive = inc;
    }

    void settarget(int t) { 
        this.target = t;
    }
} 
// class SalesManager ends here


class testSalesManager {
    public static void main(String[] args) { 
        SalesManager sm1 = new SalesManager();          // reference
                                            // object creation

        sm1.setid(101);
        sm1.setname("Akshay");
        sm1.setsalary(45000.50);
        sm1.setincentive(5000.75);
        sm1.settarget(10);

        System.out.println("Sales Manager ID : " + sm1.id); 
        System.out.println("Sales Manager Name : " + sm1.name); 
        System.out.println("Sales Manager Salary : " + sm1.salary); 
        System.out.println("Sales Manager Incentive : " + sm1.incentive); 
        System.out.println("Sales Manager Target : " + sm1.target); 
    }
}
// class testSalesManager ends here
