class ComplexNumber {
    double real;
    double imaginary;

    // Setters
    void setReal(double r) {
        this.real = r;
    }

    void setImaginary(double i) {
        this.imaginary = i;
    }

    // Getters
    double getReal() {
        return this.real;
    }

    double getImaginary() {
        return this.imaginary;
    }

    // Display method
    void display() {
        System.out.println("Complex Number : " + this.real + " + " + this.imaginary + "i");
    }
}
// ComplexNumber class ends here


class test {
    public static void main(String[] args) {

        ComplexNumber c1 = new ComplexNumber();
        ComplexNumber c2 = new ComplexNumber();

        c1.setReal(5);
        c1.setImaginary(8);

        c2.setReal(7);
        c2.setImaginary(3);

        // Display both complex numbers
        c1.display();
        c2.display();

        // Compare real part
        if (c1.getReal() > c2.getReal()) {
            System.out.println("c1 has larger real part");
        } else if (c1.getReal() < c2.getReal()) {
            System.out.println("c2 has larger real part");
        }
    }
}
// TestComplex class ends here
