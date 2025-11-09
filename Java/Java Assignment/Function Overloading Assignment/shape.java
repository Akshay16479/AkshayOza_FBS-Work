class Triangle {
    double base, height;
    Triangle(double b, double h) {
        this.base = b;
        this.height = h;
    }
}

class Rectangle {
    int length, breadth;
    Rectangle(int l, int b) {
        this.length = l;
        this.breadth = b;
    }
}

class Circle {
    double radius;
    Circle(double r) {
        this.radius = r;
    }
}

class Shape {

    // Triangle
    double area(Triangle t) {
        return 0.5 * t.base * t.height;
    }

    // Rectangle
    int area(Rectangle r) {
        return r.length * r.breadth;
    }

    // Circle
    double area(Circle c) {
        return 3.14 * c.radius * c.radius;
    }
}
//shape class ends here


class test {
    public static void main(String[] args) {

        Triangle t = new Triangle(10.4, 5.6);
        Rectangle r = new Rectangle(8,4);
        Circle c = new Circle(7.5);

        Shape s = new Shape();

        System.out.println("triangle: " + s.area(t));
        System.out.println("rectangle : " + s.area(r));
        System.out.println("circle : " + s.area(c));
    }
}
//class test ends here