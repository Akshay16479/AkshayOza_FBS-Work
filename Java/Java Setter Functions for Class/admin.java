class admin
{
  int id;
  String name;
  int allowance;
  double salary;

void setid(int i)
{ 
  this.id=i;
}
void setname(String s)
{ 
  this.name=s;
}
void setallowance(int a)
{ 
  this.allowance=a;
}
void setsalary(double sl)
{ 
  this.salary=sl;
}

}
   //class admin ends here
                 

class testadmin
{
   public static void main(String []args)
{ 
   admin a1;          //reference
   a1= new admin();   //object

   a1.setid(101);
   a1.setname("Akshay");
   a1.setallowance(5892);
   a1.setsalary(27000.05);

   
   System.out.println("Admin id :" + a1.id); 
   System.out.println("Admin name :" + a1.name); 
   System.out.println("Admin allowance :" + a1.allowance); 
   System.out.println("Admin salary :" + a1.salary); 

}
//main ends here
}

//class ends here