class Car {
    String model;
    String brand;
    double price;
    String color;
    int fuelcapacity;

    //setter

    void setmodel(String m) {
        this.model = m;
    }

    void setbrand(String b) {
        this.brand = b;
    }

    void setprice(double p) {
        this.price = p;
    }

    void setcolor(String c) {
        this.color = c;
    }

    void setfuelcapacity(int f) {
        this.fuelcapacity = f;
    }
     

     //display
       
       void display(){
       System.out.println("Car Model : " + this.model);
        System.out.println("Car Brand : " + this.brand);
        System.out.println("Car Price : " + this.price);
        System.out.println("Car Color : " + this.color);
        System.out.println("Car Fuel Capacity : " + this.fuelcapacity + " liters");
  }
}
// class Car ends here


class test {
    public static void main(String[] args) {
        Car c1=new Car();         // reference
                             // object creation

        c1.setmodel("i20 Sportz");
        c1.setbrand("Hyundai");
        c1.setprice(850000.50);
        c1.setcolor("White");
        c1.setfuelcapacity(37);

        c1.display(); 
       
    }
}
// class testCar ends here
