import java.util.Scanner;

class LibraryUser {

    String name;
    int daysLate;
    static double finePerDay;

    static  {
        finePerDay = 2.0;                  
    }



    LibraryUser()                          // default constructor
    {
        this.name = "Unknown";
        this.daysLate = 0;
    }


    LibraryUser(String n, int d)      // parameterized constructor
    {
        this.name = n;
        this.daysLate = d;
    }



    // Setters
    void setName(String n) {
        this.name = n;
    }

    void setDaysLate(int d) {
        this.daysLate = d;
    }

    static void setFinePerDay(double f) {
        finePerDay = f;
    }


    // Getters
    String getName() {
        return this.name;
    }

    int getDaysLate() {
        return this.daysLate;
    }

    double getFinePerDay() {
        return finePerDay;
    }



    double calculateFine() {
        return this.daysLate * finePerDay;
    }



    // Display
    void display() {
        System.out.println("\nName: " + this.name);
        System.out.println("Days Late: " + this.daysLate);
        System.out.println("Fine Per Day: " + finePerDay);
        System.out.println("Total Fine: " + this.calculateFine());
    }

}  // class LibraryUser ends here



class test {

    public static void main(String[] args) {

        LibraryUser u1 = new LibraryUser("Akshay", 5);
        LibraryUser u2 = new LibraryUser("abc", 3);

        u1.display();
        u2.display();

//class name se
        LibraryUser.setFinePerDay(3.5);

        u1.display();
        u2.display();

//object se bhi sab change hoge
        u1.setFinePerDay(4);

        u1.display();
        u2.display();

         
    }
}
