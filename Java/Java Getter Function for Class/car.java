class Car {
    String model;
    String brand;
    double price;
    String color;
    int fuelCapacity;

    void setModel(String m) {
        this.model = m;
    }

    void setBrand(String b) {
        this.brand = b;
    }

    void setPrice(double p) {
        this.price = p;
    }

    void setColor(String c) {
        this.color = c;
    }

    void setFuelCapacity(int f) {
        this.fuelCapacity = f;
    }

    double getPrice() {
        return this.price;
    }
}
// Car class ends here

class testCar {
    public static void main(String[] args) {

        Car c1, c2;
        c1 = new Car();
        c2 = new Car();

        c1.setModel("i20 Sportz");
        c1.setBrand("Hyundai");
        c1.setPrice(850000.50);
        c1.setColor("White");
        c1.setFuelCapacity(37);

        c2.setModel("Baleno Alpha");
        c2.setBrand("Suzuki");
        c2.setPrice(900000.00);
        c2.setColor("Blue");
        c2.setFuelCapacity(40);

        if (c1.getPrice() > c2.getPrice()) {
            System.out.println("c1 car is costlier");
        } else {
            System.out.println("c2 car is costlier");
        }
    }
}
// TestCar class ends here
