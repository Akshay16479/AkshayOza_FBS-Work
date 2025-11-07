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


    // Setters
    void setDay(int d) {
        this.day = d;
    }

    void setMonth(int m) {
        this.month = m;
    }

    void setYear(int y) {
        this.year = y;
    }

    void setDow(String str) {
        this.dow = str;
    }

    // Getters

    int getDay() {
        return this.day;
    }

    int getMonth() {
        return this.month;
    }

    int getYear() {
        return this.year;
    }

    String getDow() {
        return this.dow;
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

        Date d1 = new Date();
        Date d2 = new Date(7,11,2025,"Friday");

        /*d1.setDay(31);
        d1.setMonth(10);
        d1.setYear(2025);
        d1.setDow("Friday");

        d2.setDay(11);
        d2.setMonth(10);
        d2.setYear(2025);
        d2.setDow("Tuesday");*/

        // Display both dates
        d1.display();
        d2.display();

        /*if (d1.getYear() > d2.getYear()) {
            System.out.println("d1 is younger");
        } else if (d1.getYear() < d2.getYear()) {
            System.out.println("d2 is younger");
        } 
        else if (d1.getMonth() > d2.getMonth()) {
            System.out.println("d1 is younger");
        } else if (d1.getMonth() < d2.getMonth()) {
            System.out.println("d2 is younger");
        }
        else if (d1.getDay() > d2.getDay()) {
            System.out.println("d1 is younger");
        } else if (d1.getDay() < d2.getDay()) {
            System.out.println("d2 is younger");
        }
        else {
            System.out.println("Both dates are same");
        }*/


        
    }
}
// TestDate class ends here
