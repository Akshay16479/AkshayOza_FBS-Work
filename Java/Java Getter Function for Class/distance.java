class Distance {
    int km;
    int m;

    void setKm(int k) {
        this.km = k;
    }

    void setM(int m) {
        this.m = m;
    }

    int getKm() {
        return this.km;
    }

    int getM() {
        return this.m;
    }

       int getTotalMeters() {
        return this.km * 1000 + this.m;
    }
}
// Distance class ends here

class TestDistance {
    public static void main(String[] args) {

        Distance d1, d2;
        d1 = new Distance();
        d2 = new Distance();

        d1.setKm(5);
        d1.setM(350);

        d2.setKm(6);
        d2.setM(200);

        System.out.println("d1 Distance: " + d1.getKm() + " km " + d1.getM() + " m");
        System.out.println("d2 Distance: " + d2.getKm() + " km " + d2.getM() + " m");

        if (d1.getTotalMeters() > d2.getTotalMeters()) {
            System.out.println("d1 is longer");
        } else if (d1.getTotalMeters() < d2.getTotalMeters()) {
            System.out.println("d2 is longer");
        } 
}
//main ends here
}
//class test distance ends here
