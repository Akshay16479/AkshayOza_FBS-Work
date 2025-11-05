class Car {
    String model;
    String brand;
    double price;
    String color;
    int fuelcapacity;

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
}
// class Car ends here


class testCar {
    public static void main(String[] args) {
        Car c1=new Car();         // reference
                             // object creation

        c1.setmodel("i20 Sportz");
        c1.setbrand("Hyundai");
        c1.setprice(850000.50);
        c1.setcolor("White");
        c1.setfuelcapacity(37);

        System.out.println("Car Model : " + c1.model);
        System.out.println("Car Brand : " + c1.brand);
        System.out.println("Car Price : " + c1.price);
        System.out.println("Car Color : " + c1.color);
        System.out.println("Car Fuel Capacity : " + c1.fuelcapacity + " liters");
    }
}
// class testCar ends here
