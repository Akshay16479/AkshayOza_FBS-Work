class Car {
    String model;
    String brand;
    double price;
    String color;
    int fuelCapacity;

    // Setters
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

    // Getters
    String getModel() {
        return this.model;
    }

    String getBrand() {
        return this.brand;
    }

    String getColor() {
        return this.color;
    }

    int getFuelCapacity() {
        return this.fuelCapacity;
    }

    double getPrice() {
        return this.price;
    }

    // Display method
    void display() {
        System.out.println("Car Model : " + this.model);
        System.out.println("Car Brand : " + this.brand);
        System.out.println("Car Price : " + this.price);
        System.out.println("Car Color : " + this.color);
        System.out.println("Fuel Capacity : " + this.fuelCapacity + " Liters");
    }
}
// Car class ends here


class testCar {
    public static void main(String[] args) {

        Car c1 = new Car();
        Car c2 = new Car();

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

        // Display both cars
        c1.display();
        c2.display();

        // Compare prices
        if (c1.getPrice() > c2.getPrice()) {
            System.out.println("c1 car is costlier");
        } else {
            System.out.println("c2 car is costlier");
        }
    }
}
// TestCar class ends here
