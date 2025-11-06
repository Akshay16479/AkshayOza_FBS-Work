class SalesManager {
    int id;
    String name;
    double salary;
    double incentive;
    int target;


   //setter

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


    // Display

 
    void display() {
        System.out.println("Sales Manager ID : " + this.id);
        System.out.println("Sales Manager Name : " + this.name);
        System.out.println("Sales Manager Salary : " + this.salary);
        System.out.println("Sales Manager Incentive : " + this.incentive);
        System.out.println("Sales Manager Target : " + this.target);

    }
}

// class SalesManager ends here


class test {
    public static void main(String[] args) { 
        
        SalesManager sm1 = new SalesManager(); 

        sm1.setid(101);
        sm1.setname("Akshay");
        sm1.setsalary(45000.50);
        sm1.setincentive(5000.75);
        sm1.settarget(10);

       
        sm1.display();
    }
}
// class testSalesManager ends here
