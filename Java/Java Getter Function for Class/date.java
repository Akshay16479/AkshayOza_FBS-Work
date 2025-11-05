class date {
int day,month,year;
String dow;

    void setday(int d) {
        this.day = d;
    }

    void setmonth(int m) {
        this.month = m;
    }

    void setyear(int y) {
        this.year = y;
    }

    void setdow(String str) {
        this.dow = str;
    } 

    
    int getday(){
     return this.day; }

    int getmonth(){
     return this.month; }

    int getyear(){
     return this.year; }


}

class test {
   public static void main(String [] args){

    date d1,d2;
   d1=new date();
   d2=new date();

   d1.setday(31);
   d1.setmonth(10);
   d1.setyear(2025);
   d1.setdow("Friday");
    
   d2.setday(11);
   d2.setmonth(10);
   d2.setyear(2025);
   d2.setdow("Tuesday");
    
   if(d1.getday()>d2.getday()) {
   System.out.println("d1 is younger");}

   else if(d1.getmonth()>d2.getmonth()) {
   System.out.println("d1 is younger");}
   
  else if(d1.getyear()>d2.getyear()) {
   System.out.println("d1 is younger");}
  

}
}
