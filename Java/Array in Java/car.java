class Car {
    String model;
    String brand;
    double price;
    String color;
    int fuelCapacity;

//default constructor

Car(){
System.out.println("contructor called");

this.model="city";
this.brand="honda";
this.price=901000;
this.color="white";
this.fuelCapacity=37;

}


//parameterized constructor

Car(String d,String m,double y,String s,int c){
System.out.println("parameterized constructor called");

this.model=d;
this.brand=m;
this.price=y;
this.color=s;
this.fuelCapacity=c;
}




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


class test {
    public static void main(String[] args) {

     Car arr[]=new Car[3];
      arr[0] = new Car();
      arr[1] = new Car("M series","BMW",5200000,"royal blue",34);

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);}
        
}

  }
// TestCar class ends here
