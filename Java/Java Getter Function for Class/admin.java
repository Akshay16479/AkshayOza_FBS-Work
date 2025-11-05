class Admin {
int id,allowance;
String name;
double salary;

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


    int getAllowance(){
     return this.allowance; }

}
//admin class ends here

class testAdmin {
   public static void main(String [] args){

    Admin a1,a2;
   a1=new Admin();
   a2=new Admin();

   a1.setId(211);
   a1.setAllowance(17540);
   a1.setName("Akshay");
   a1.setSalary(50000);
    
   a2.setId(311);
   a2.setAllowance(14540);
   a2.setName("Aksh");
   a2.setSalary(30000);

    
   if(a1.getAllowance()>a2.getAllowance()) {
   System.out.println("a1 allowance is more");}

}
//main ends here
}
//test admin classends here
