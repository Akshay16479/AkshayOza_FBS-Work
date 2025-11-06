class ComplexNumber {
    double real;
    double imaginary;

    //setter

    void setreal(double r) {
        this.real = r;
    }

    void setimaginary(double i) {
        this.imaginary = i;
    }


    //display

    void display(){
      System.out.println("Complex Number :" + this.real + "+" + this.imaginary + "i");
    }


}
// class ComplexNumber ends here


class test {
    public static void main(String[] args) {
        ComplexNumber c1;          // reference
        c1 = new ComplexNumber();  // object creation

        c1.setreal(5);
        c1.setimaginary(8);
            
        c1.display();
    }
}
// class testComplex ends here
