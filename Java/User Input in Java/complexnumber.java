import java.util.Scanner;

class ComplexNumber {
    double real;
    double imaginary;

    // default constructor
    ComplexNumber() {
        System.out.println("constructor called");

        this.real = 3.0;
        this.imaginary = 2.5;
    }

    // parameterized constructor
    ComplexNumber(double d, double m) {
        System.out.println("parameterized constructor called");

        this.real = d;
        this.imaginary = m;
    }

    // Display method
    void display() {
        System.out.println("Complex Number : " + this.real + " + " + this.imaginary + "i");
    }
}
// ComplexNumber class ends here


class test {
    public static void main(String[] args) {

        Scanner ao = new Scanner(System.in);

        System.out.println("Enter Real Part : ");
        double real = ao.nextDouble();

        System.out.println("Enter Imaginary Part : ");
        double imaginary = ao.nextDouble();

        ComplexNumber c1 = new ComplexNumber(real, imaginary);
        ComplexNumber c2 = new ComplexNumber();

        c1.display();
        c2.display();
    }
}
// TestComplex class ends here
