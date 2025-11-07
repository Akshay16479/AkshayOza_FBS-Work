class Distance {
    int km;
    int m;

//default constructor

Distance(){
System.out.println("contructor called");

this.km=3;
this.m=200;
}


//parameterized constructor

Distance(int d,int m){
System.out.println("parameterized constructor called");

this.km=d;
this.m=m;

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

        Distance arr[] = new Distance[3];

        arr[0] = new Distance();
        arr[1] = new Distance(17,854);

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
