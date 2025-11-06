class Employee {
    int Id;
    String name;
    double salary;

    //setter
   
    void setId(int i) {
        this.Id = i;
    }

    void setName(String n) {  
        this.name = n;
    }

    void setSalary(double s) {
        this.salary = s;
    }


      //display 

     void display(){
       System.out.println("Employee ID: " + this.Id);
       System.out.println("Employee Name: " + this.name);
       System.out.println("Employee Salary: " + this.salary);

   }
}
//class ends here

class test {
    public static void main(String[] args) {
        Employee e1 = new Employee();

        e1.setId(101);
        e1.setName("Akshay");
        e1.setSalary(55000.50);
           
        e1.display();

    }
}
//class ends here