class Distance {
    int km;
    int m;

    void setkm(int k) { 
        this.km = k;
    }

    void setm(int m) { 
        this.m = m;
    }
} 
// class Distance ends here


class testDistance {
    public static void main(String[] args) { 
        Distance d1  = new Distance();        // reference
                                           // object creation

        d1.setkm(5);
        d1.setm(350);

        System.out.println("Distance in kilometers : " + d1.km);
        System.out.println("Distance in meters : " + d1.m);
    }
}
// class testDistance ends here
