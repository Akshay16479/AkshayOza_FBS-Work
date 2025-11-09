class Student{
int roll;
String name;
double percentage;

Student(int a,String b,double c){
this.roll = a;
this.name = b;
this.percentage = c;
}
}
//student class ends here



class Employee{
int id;
String name;
double annualSalary;

Employee(int i,String j,double k){
this.id=i;
this.name=j;
this.annualSalary=k;
}
}
//emp class end here


class Bank{

// for Student
void approveLoan(Student s) {
double c=s.percentage;
  System.out.println("Student roll number: " + s.roll);
  System.out.println("Student name: " + s.name);
  System.out.println("Student percentage: " + s.percentage);
 

        if (c> 80) {
            System.out.println("2 Lakh");
        } 
        else if (c>= 60) {
            System.out.println("1 Lakh");
        } 
        else if (c>= 40) {
            System.out.println("50,000");
        } 
        else {
            System.out.println("No Loan Approved");
        }
}


// for Employee
void approveLoan(Employee e) {
double k=e.annualSalary;

   System.out.println("Employee id: " + e.id);
   System.out.println("Employee name: " + e.name);
   System.out.println("Employee annualSalary: " + e.annualSalary);

       if (k> 12) {
            System.out.println("7 Lakh");
        } 
        else if (k>= 10) {
            System.out.println("6 Lakh");
        } 
        else if (k>= 6) {
            System.out.println("5 Lakh");
        } 
        else if (k>= 4) {
            System.out.println("4 Lakh");
        } 
        else {
            System.out.println("No Loan Approved");
        }
    }
}
//class bank ends here



class test{
public static void main(String[] args){

Student s;          
s=new Student(101,"Akshay",94);     

Employee e;          
e=new Employee(7852,"akshu",11);   



Bank b;          //reference
b=new Bank();   //object
b.approveLoan(s);
b.approveLoan(e);

}
//main ends here
}
//class ends here
