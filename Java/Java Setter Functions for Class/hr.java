class Hr
{
  int id;
  String name;
  int commission;
  double salary;

void setid(int i)
{ 
  this.id=i;
}
void setname(String s)
{ 
  this.name=s;
}
void setcommission(int a)
{ 
  this.commission=a;
}
void setsalary(double sl)
{ 
  this.salary=sl;
}

}
   //class hr ends here
                 

class testHr
{
   public static void main(String []args)
{ 
   Hr h1;          //reference
   h1= new Hr();   //object

   h1.setid(07);
   h1.setname("Akshay");
   h1.setcommission(2782);
   h1.setsalary(37000.05);

   
   System.out.println("Hr id :" + h1.id); 
   System.out.println("Hr name :" + h1.name); 
   System.out.println("Hr commission :" + h1.commission); 
   System.out.println("Hr salary :" + h1.salary); 

}
//main ends here
}

//class testhr ends here