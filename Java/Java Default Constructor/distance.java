class Distance {
    int km;
    int m;

//default constructor

//default constructor

//default constructor

Distance(){
System.out.println("contructor called");

this.km=3;
this.m=200;


}


    // Setters
    void setKm(int k) {
        this.km = k;
    }

    void setM(int m) {
        this.m = m;
    }

    // Getters
    int getKm() {
        return this.km;
    }

    int getM() {
        return this.m;
    }

    // Total distance in meters
    int getTotalMeters() {
        return this.km * 1000 + this.m;
    }

    // Display method
    void display() {
        System.out.println("Distance : " + this.km + " km " + this.m + " m");
    }
}
// Distance class ends here


class test {
    public static void main(String[] args) {

        Distance d1 = new Distance();
        Distance d2 = new Distance();

        /*d1.setKm(5);
        d1.setM(350);

        d2.setKm(6);
        d2.setM(200);*/

        // Display both distances
        d1.display();
        d2.display();

        if (d1.getTotalMeters() > d2.getTotalMeters()) {
            System.out.println("d1 is longer");
        } else if (d1.getTotalMeters() < d2.getTotalMeters()) {
            System.out.println("d2 is longer");
        }
    }
}
// TestDistance class ends here
