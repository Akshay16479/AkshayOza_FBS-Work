class ComplexNumber {
    double real;
    double imaginary;

//default constructor

ComplexNumber(){
System.out.println("contructor called");

this.real=3.0;
this.imaginary=2.5;

}


//parameterized constructor

ComplexNumber(double d,double m){
System.out.println("parameterized constructor called");

this.real=d;
this.imaginary=m;

}


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

     ComplexNumber arr[]=new ComplexNumber[3];
      arr[0] = new ComplexNumber();
      arr[1] = new ComplexNumber(2,5.2);

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
  
  }
}
