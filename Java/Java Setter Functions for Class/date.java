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



}

class test {
   public static void main(String [] args){

    date d1;
   d1=new date();

   d1.setday(31);
   d1.setmonth(10);
   d1.setyear(2025);
   d1.setdow("Friday");

System.out.println("date: " + d1.day + "/" + d1.month + "/" + d1.year);

System.out.println("Day of week: " + d1.dow);      

}
}
