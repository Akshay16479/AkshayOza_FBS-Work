class Shape {

    // Area of Triangle

    void area(double base, double height) {
        System.out.println("Area of Triangle: " + (0.5 * base * height));
    }

    // Area of Rectangle

    void area(int length, int breadth) {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    // Area of Circle

    void area(double radius) {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }

}
// class ends here


class test {
    public static void main(String[] args) {

        Shape s = new Shape();   // object

        s.area(10.0,5.0);     
        s.area(8,4);          
        s.area(7.0);   
    }
}
