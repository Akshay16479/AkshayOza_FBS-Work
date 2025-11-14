package poly;

 class Shapee {

	    String color;
	    int borderWidth;

	    // default constructor
	    Shapee() {
	        this.color = "Black";
	        this.borderWidth = 2;
	    }

	    // parameterized constructor
	    Shapee(String color, int borderWidth) {
	        this.color = color;
	        this.borderWidth = borderWidth;
	    }

	    // setters-getters
	    String getColor() {
	        return color;
	    }

	    void setColor(String color) {
	        this.color = color;
	    }

	    int getBorderWidth() {
	        return borderWidth;
	    }

	    void setBorderWidth(int borderWidth) {
	        this.borderWidth = borderWidth;
	    }

	    double calculate() {
	        return 0.0;
	    }

	    // display 
	    void display() {
	        System.out.println("Shape color: " + this.color);
	        System.out.println("Border Width: " + this.borderWidth);
	    }
	}

	
	class Rectangle extends Shapee {
	    int length;
	    int width;

	    // default constructor
	    Rectangle() {
	        super();
	        this.length = 5;
	        this.width = 7;
	    }

	    // parameterized constructor
	    Rectangle(String color, int borderWidth, int length, int width) {
	        super(color, borderWidth);
	        this.length = length;
	        this.width = width;
	    }

	    double calculate() {
	        return length * width;
	    }

	    // display
	    void display() {
	        super.display();
	        System.out.println("Length: " + this.length);
	        System.out.println("Width: " + this.width);
	    }
	}

	
	class Circle extends Shapee {
	    double radius;

	    Circle() {
	        super();
	        this.radius = 5.0;
	    }

	    Circle(String color, int borderWidth, double radius) {
	        super(color, borderWidth);
	        this.radius = radius;
	    }

	    double calculate() {
	        return 3.14 * radius * radius;
	    }

	    void display() {
	        super.display();
	        System.out.println("Radius: " + this.radius);
	    }
	}
	

	class Testshape {
	    public static void main(String[] args) {

	        Shapee s;

	        s = new Shapee();
	        s.display();
	        System.out.println("Calculation result: " + s.calculate());
           System.out.println();
           
           
	        s = new Rectangle("White", 1, 5, 6);
	        s.display();
	        System.out.println("Area of Rectangle: " + s.calculate());
	          System.out.println();


	        s = new Circle("Blue", 3, 4.5);
	        s.display();
	        s.calculate();
	        System.out.println("Area of Circle: " + s.calculate());

	    }
	}


