class date {
int day,month,year;
String dow;

//setter

 void setday(int d) {
        this.day = d;
    }

    void setmonth(int m) {
        this.month = m;
    }

    void setyear(int y) {
        this.year = y;
    }

    void setdow(String s) {
        this.dow = s;
    }

//display

void display(){
System.out.println("Day :" + this.day);
System.out.println("Month :" + this.month);
System.out.println("Year :" + this.year);
System.out.println("Dow :" + this.dow);
 
}
  
}
 //class date ends here 

class test {
   public static void main(String [] args){

    date d1,d2;
   d1=new date();
   d2=new date();

   d1.setday(31);
   d1.setmonth(10);
   d1.setyear(2025);
   d1.setdow("Friday");

   d2.setday(3);
   d2.setmonth(2);
   d2.setyear(2003);
   d2.setdow("Monday");

   d1.display();
   d2.display(); 

}
//main ends here
}
//test class ends  here
