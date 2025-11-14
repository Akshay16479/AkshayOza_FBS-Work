package poly;

 class Devicee {


	    String brand;
	    String model;
	    double price;

	    // Default Constructor
	    Devicee() {
	        brand = "Unknown Brand";
	        model = "Unknown Model";
	        price = 0.0;
	    }

	    // Parameterized Constructor
	    Devicee(String brand, String model, double price) {
	        this.brand = brand;
	        this.model = model;
	        this.price = price;
	    }

	    // Setters
	    void setBrand(String brand) {
	        this.brand = brand;
	    }

	    void setModel(String model) {
	        this.model = model;
	    }

	    void setPrice(double price) {
	        this.price = price;
	    }

	    // Getters
	    String getBrand() {
	        return brand;
	    }

	    String getModel() {
	        return model;
	    }

	    double getPrice() {
	        return price;
	    }

	    void deviceFunction() 
	    {
	         System.out.println(" device performs basic operation");
	    }

	    // Display Method
	    void display() {
	        System.out.println("\nDevice Brand : " + brand);
	        System.out.println("Device Model : " + model);
	        System.out.println("Device Price : ₹" + price);
	    }

	} // class Device ends here



	class Mobile extends Devicee {

	    int batteryCapacity; 

	    // Default Constructor
	    Mobile() {
	        super(); 
	        batteryCapacity = 4000;
	    }

	    // Parameterized Constructor
	    Mobile(String brand, String model, double price, int batteryCapacity) {
	        super(brand, model, price);
	        this.batteryCapacity = batteryCapacity;
	    }

	    void deviceFunction() {
	        System.out.println( "Mobile is used for communication and entertainment");
	    }

	    // Display
	    void display() {
	        super.display();
	        System.out.println("Battery Capacity: " + this.batteryCapacity );
	    }

	} // class Mobile ends here



	class Laptop extends Devicee {

	    int ramSize; 

	    // Default Constructor
	    Laptop() {
	        super();
	        ramSize = 8;
	    }

	    // Parameterized Constructor
	    Laptop(String brand, String model, double price, int ramSize) {
	        super(brand, model, price);
	        this.ramSize = ramSize;
	    }

	    void deviceFunction() {
System.out.println("Laptop is used for programming, study, and office work ");	
  }

	    // Display
	    void display() {
	        super.display();
	        System.out.println("RAM Size: " + this.ramSize );
	    }

	} // class Laptop ends here



	
	class TestDevice {

	    public static void main(String[] args) {

	        Devicee d;

	        d = new Devicee();
	        d.display();
	        d.deviceFunction();
	        System.out.println();

	        d = new Mobile();
	        d.display();
	        d.deviceFunction();

	        System.out.println();

	        d = new Laptop();
	        d.display();
	        d.deviceFunction();


	        
	    }

	} // class TestDevice ends here


