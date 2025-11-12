package inheritance;

 class vehicle {
	
	    int speed;
	    int fuelCapacity;
	    String color;
	    String model;

	    // Default Constructor
	    vehicle() {
	        System.out.println("Vehicle Default Constructor");
	        this.speed = 80;
	        this.fuelCapacity = 40;
	        this.color = "Black";
	        this.model = " new generation model";
	    }

	    // Parameterized Constructor
	    vehicle(int speed, int fuelCapacity, String color, String model) {
	        System.out.println("Vehicle Parameterized Constructor");
	        this.speed = speed;
	        this.fuelCapacity = fuelCapacity;
	        this.color = color;
	        this.model = model;
	    }

	    // Setters-getter
	    void setSpeed(int speed) 
	    { 
	    	this.speed = speed; 
	    	}
	    int getSpeed() 
	    { 
	    	return speed; 
	    	}
	    
	    void setFuelCapacity(int fuelCapacity) 
	    { 
	    	this.fuelCapacity = fuelCapacity; 
	    	}
	    int getFuelCapacity() 
	    { 
	    	return fuelCapacity; 
	    	}
	    
	    
	    void setColor(String color) 
	    { 
	    	this.color = color; 
	    	}
	    String getColor() 
	    { 
	    	return color; 
	    	}
	    void setModel(String model) 
	    { 
	    	this.model = model; 
	    	}

	    String getModel() 
	    { 
	    	return model; 
	    	}


	    // Display
	    void display() {
	        System.out.println("Speed: " + this.speed);
	        System.out.println("Fuel Capacity: " + this.fuelCapacity);
	        System.out.println("Color: " + this.color);
	        System.out.println("Model: " + this.model);
	    }
	}



	class Bike extends vehicle {

	    int mileage;
	    String type;

	    // Default Constructor
	    Bike() {
	        super();
	        System.out.println("Bike Default Constructor");
	        this.mileage = 50;
	        this.type = "Sports";
	    }

	    // Parameterized Constructor
	    Bike(int speed, int fuelCapacity, String color, String model,int mileage, String type) {

	        super(speed, fuelCapacity, color, model);
	        System.out.println("Bike Parameterized Constructor");

	        this.mileage = mileage;
	        this.type = type;
	    }

	    // Setters and getter 
	    void setMileage(int mileage) 
	    { 
	    	this.mileage = mileage; 
	    	}
	    int getMileage() 
	    { 
	    	return mileage; 
	    	}
	    
	    void setType(String type) 
	    { 
	    	this.type = type; 
	    	}
	    
	    String getType() 
	    { 
	    	return type; 
	    	}
	   
	    
	    // Display
	    void display() 
	    {
	        super.display();
	        System.out.println("Mileage: " + this.mileage);
	        System.out.println("Type: " + this.type);
	    }
	}


	class Car extends vehicle {

	    int seatingCapacity;
	    String transmission;

	    // Default Constructor
	    Car() {
	        super();
	        System.out.println("Car Default Constructor");
	        this.seatingCapacity = 5;
	        this.transmission = "Automatic";
	    }

	    // Parameterized Constructor
	    Car(int speed, int fuelCapacity, String color, String model,int seatingCapacity, String transmission) {

	        super(speed, fuelCapacity, color, model);
	        System.out.println("Car Parameterized Constructor");

	        this.seatingCapacity = seatingCapacity;
	        this.transmission = transmission;
	    }

	    // Setters-getter
	    void setSeatingCapacity(int seatingCapacity)
          { 
	    	this.seatingCapacity = seatingCapacity; 
	    	}
	    int getSeatingCapacity() 
	    { 
	    	return seatingCapacity; 
	    	}
	    void setTransmission(String transmission) 
	    { 
	    	this.transmission = transmission; 
	    	}
	    String getTransmission() 
	    { 
	    	return transmission; 
	    	}


	    // Display
	    void display() {
	        super.display();
	        System.out.println("Seating Capacity: " + this.seatingCapacity);
	        System.out.println("Transmission: " + this.transmission);
	    }
	}


	class testvehicle {
	    public static void main(String[] args) {

	        
	    	 vehicle v1 = new vehicle(170,37,"white","sportz");
		        v1.display();
		        System.out.println();
		        
		         v1 = new Bike(120,14,"black","economy",35,"abc");
		        v1.display();
		        System.out.println();

		         v1 = new Car(150,37,"red","pqr",4,"manual");
		        v1.display();
	       
	    }
	}
