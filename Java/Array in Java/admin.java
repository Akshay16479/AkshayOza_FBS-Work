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

        Admin arr[] = new Admin[3];

        arr[0] = new Admin();
        arr[1] = new Admin(101,2545,"Akshay",25000);

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

