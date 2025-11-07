class Student {
    int rollNo;
    String name;
    int mark;


//default constructor

Student(){
System.out.println("contructor called");

this.rollNo=3;
this.name="shakshee";
this.mark=94;

}

//parameterized constructor

Student(int d,String m,int y){
System.out.println("parameterized constructor called");

this.rollNo=d;
this.name=m;
this.mark=y;

}


    // Setters
    void setRollNo(int r) {
        this.rollNo = r;
    }

    void setName(String n) {
        this.name = n;
    }

    void setMark(int m) {
        this.mark = m;
    }

    // Getters
    
    int getMark() {
        return this.mark;
    }

    // Display Method
    void display() {
        System.out.println("Student Roll No : " + this.rollNo);
        System.out.println("Student Name : " + this.name);
        System.out.println("Student Mark : " + this.mark);
    }
}
// Student class ends here


// Test class
class test {
    public static void main(String[] args) {

        Student arr[] = new Student[3];

        arr[0] = new Student();
        arr[1] = new Student(10, "Akshay",86);
        
        for (int i = 0; i < arr.length; i++) {
             System.out.println(arr[i]);
        }
    }
}
