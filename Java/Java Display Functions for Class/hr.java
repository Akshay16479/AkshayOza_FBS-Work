class Hr
{
  int id;
  String name;
  int commission;
  double salary;


//setter

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


//display

void display(){

   System.out.println("Hr id :" + this.id); 
   System.out.println("Hr name :" + this.name); 
   System.out.println("Hr commission :" + this.commission); 
   System.out.println("Hr salary :" + this.salary); 

}

}
 //class hr ends here
                 

class test
{
   public static void main(String []args)
{ 
   Hr h1;          //reference
   h1= new Hr();   //object

   h1.setid(07);
   h1.setname("Akshay");
   h1.setcommission(2782);
   h1.setsalary(37000.05);
   
   h1.display();
   
  
}
//main ends here
}

//class testhr ends here