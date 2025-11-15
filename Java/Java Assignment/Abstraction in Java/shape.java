package abstraction;

abstract class shape {

    String color;
    int borderWidth;

    shape() {
        this.color = "Black";
        this.borderWidth = 2;
    }

    shape(String color, int borderWidth) {
        this.color = color;
        this.borderWidth = borderWidth;
    }

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

    abstract double calculate();   

   
    public String toString()
    {
    	return "Shape color: " + this.color+ " and Border Width: " + this.borderWidth;
    }
    
}


 class Rectangle extends shape {

    int length;
    int width;

    Rectangle() {
        super();
        this.length = 5;
        this.width = 7;
    }

    Rectangle(String color, int borderWidth, int length, int width) {
        super(color, borderWidth);
        this.length = length;
        this.width = width;
    }

     double calculate() {
        return length * width;
    }

    
    public String toString()
    {
    	
    	return super.toString() + " Length: " + this.length + " and Width: " + this.width;
    }
}


 class Circle extends shape {

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


    public String toString()
    {
    	
    	return super.toString()+ " Radius: " + this.radius;
    }
}


 class testshape {
    public static void main(String[] args) {

        shape s;

        s = new Rectangle("White", 1, 5, 6);
        System.out.println(s);
        System.out.println("Area of Rectangle: " + s.calculate());
        System.out.println();

        s = new Circle("Blue", 3, 4.5);
        System.out.println(s);
        System.out.println("Area of Circle: " + s.calculate());
    }
}    
        
        
        