class Distance {
    int km;
    int m;
     
    //setter   

    void setkm(int k) { 
        this.km = k;
    }

    void setm(int m) { 
        this.m = m;
    }

    //display

    void display(){
        System.out.println("Distance in kilometers : " + this.km);
        System.out.println("Distance in meters : " + this.m);
      }
 
} 


// class Distance ends here


class test {
    public static void main(String[] args) { 
        Distance d1  = new Distance();        // reference
                                           // object creation

        d1.setkm(5);
        d1.setm(350);
        
        d1.display();
       
    }
}
// class testDistance ends here
