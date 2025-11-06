class Admin {
int id;
String name;
int allowance;
double salary;

//setter

 void setId(int d) {
        this.id = d;
    }

    void setName(String s) {
        this.name = s;
    }

    void setAllowance(int y) {
        this.allowance = y;
    }

    void setSalary(double s) {
        this.salary = s;
    }

//display

void display(){
System.out.println("Id :" + this.id);
System.out.println("Name :" + this.name);
System.out.println("Allowance :" + this.allowance);
System.out.println("Salary :" + this.salary);
 
}
  
}
 //class ends here 

class test {
   public static void main(String [] args){

    Admin a,b;
   a=new Admin();
   b=new Admin();

   a.setId(131);
   a.setName("akshay");
   a.setAllowance(2025);
   a.setSalary(35400);

   b.setId(231);
   b.setName("akshu");
   b.setAllowance(2033);
   b.setSalary(32000);



   a.display();
   b.display(); 

}
//main ends here
}
//test class ends  here
