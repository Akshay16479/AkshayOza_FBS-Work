import java.util.Scanner;

class Date {
    int day, month, year;
    String dow;


//default constructor

Date(){
System.out.println("contructor called");

this.day=3;
this.month=2;
this.year=2003;
this.dow="Monday";

}

//parameterized constructor

Date(int d,int m,int y,String s){
System.out.println("parameterized constructor called");

this.day=d;
this.month=m;
this.year=y;
this.dow=s;

}


  
    // Display Method

    void display() {
        System.out.println("Day : " + this.day);
        System.out.println("Month : " + this.month);
        System.out.println("Year : " + this.year);
        System.out.println("Day of Week : " + this.dow);
    }
}
// Date class ends here


class test {
    public static void main(String[] args) {


       Scanner sc=new Scanner(System.in);
    System.out.println("Enter Day: ");
    int day = sc.nextInt();

    System.out.println("Enter Month: ");
    int month = sc.nextInt();

    System.out.println("Enter Year: ");
    int year = sc.nextInt();

    sc.nextLine();
    System.out.println("Enter Day of the week: ");
    String dow=sc.nextLine();
        
 Date d1 = new Date(day,month,year,dow);
         d1.display();
        
       
        
    }
}
// TestDate class ends here
