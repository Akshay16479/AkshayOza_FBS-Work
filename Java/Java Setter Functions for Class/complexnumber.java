class ComplexNumber {
    double real;
    double imaginary;

    void setreal(double r) {
        this.real = r;
    }

    void setimaginary(double i) {
        this.imaginary = i;
    }
}
// class ComplexNumber ends here


class testComplex {
    public static void main(String[] args) {
        ComplexNumber c1;          // reference
        c1 = new ComplexNumber();  // object creation

        c1.setreal(5);
        c1.setimaginary(8);

             System.out.println("Complex Number : " + c1.real + " + " + c1.imaginary + "i");
    }
}
// class testComplex ends here
