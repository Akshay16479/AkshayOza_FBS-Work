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

        Date arr[] = new Date[3];

        arr[0] = new Date();
        arr[1] = new Date(7, 11, 2025, "Friday");
      
        for(int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
