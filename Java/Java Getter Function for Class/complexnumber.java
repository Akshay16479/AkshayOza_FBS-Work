class ComplexNumber {
    double real;
    double imaginary;

    void setReal(double r) {
        this.real = r;
    }

    void setImaginary(double i) {
        this.imaginary = i;
    }

    double getReal() {
        return this.real;
    }

    double getImaginary() {
        return this.imaginary;
    }
}
// ComplexNumber class ends here

class testComplex {
    public static void main(String[] args) {

        ComplexNumber c1, c2;
        c1 = new ComplexNumber();
        c2 = new ComplexNumber();

        c1.setReal(5);
        c1.setImaginary(8);

        c2.setReal(7);
        c2.setImaginary(3);

        System.out.println("c1 Complex Number : " + c1.getReal() + " + " + c1.getImaginary() + "i");
        System.out.println("c2 Complex Number : " + c2.getReal() + " + " + c2.getImaginary() + "i");

        
        if (c1.getReal() > c2.getReal()) {
            System.out.println("c1 has larger real part");
        } else if (c1.getReal() < c2.getReal()) {
            System.out.println("c2 has larger real part");
           }
}
//main ends here
}
// TestComplex class ends here
