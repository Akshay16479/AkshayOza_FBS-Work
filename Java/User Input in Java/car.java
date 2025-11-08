import java.util.*;

class Car {
    String model;
    String brand;
    double price;
    String color;
    int fuelCapacity;

    // default constructor
    Car() {
        System.out.println("constructor called");

        this.model = "city";
        this.brand = "honda";
        this.price = 901000;
        this.color = "white";
        this.fuelCapacity = 37;
    }

    // parameterized constructor
    Car(String d, String m, double y, String s, int c) {
        System.out.println("parameterized constructor called");

        this.model = d;
        this.brand = m;
        this.price = y;
        this.color = s;
        this.fuelCapacity = c;
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


class test {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter Model : ");
        String model = in.nextLine();

        System.out.println("Enter Brand : ");
        String brand = in.nextLine();

        System.out.println("Enter Price : ");
        double price = in.nextDouble();

        in.nextLine(); // buffer clear

        System.out.println("Enter Color : ");
        String color = in.nextLine();

        System.out.println("Enter Fuel Capacity : ");
        int fuel = in.nextInt();

        Car c1 = new Car(model, brand, price, color, fuel);
        Car c2 = new Car();

        c1.display();
        c2.display();
    }
}
// TestCar class ends here
