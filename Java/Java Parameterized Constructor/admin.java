class Admin {
    int id, allowance;
    String name;
    double salary;


//default constructor

Admin(){
System.out.println("contructor called");

this.id=3;
this.name="Akshu";
this.allowance=2056;
this.salary=39000;

}

//parameterized constructor

Admin(int d,int m,String y,double s){
System.out.println("parameterized constructor called");

this.id=d;
this.allowance=m;
this.name=y;
this.salary=s;

}



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


class test {
    public static void main(String[] args) {

        Admin a1 = new Admin();
        Admin a2 = new Admin(311,1450,"aksh",36000);

        /*a1.setId(211);
        a1.setAllowance(17540);
        a1.setName("Akshay");
        a1.setSalary(50000);

        a2.setId(311);
        a2.setAllowance(14540);
        a2.setName("Aksh");
        a2.setSalary(30000);*/

        // Display details
        a1.display();
        a2.display();


        /*if (a1.getAllowance() > a2.getAllowance()) {
            System.out.println("a1 allowance is more");
        } else {
            System.out.println("a2 allowance is more");
        }*/
    }
}
// testAdmin class ends here
