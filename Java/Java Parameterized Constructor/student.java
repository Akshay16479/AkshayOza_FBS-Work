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


class test {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student(4,"akshu",95);

        /*s1.setRollNo(21);
        s1.setName("Akshay");
        s1.setMark(89);

        s2.setRollNo(22);
        s2.setName("Rohit");
        s2.setMark(95);*/

        s1.display();
        s2.display();

        /*if (s1.getMark() > s2.getMark()) {
            System.out.println("s1 has higher marks");
        } else if (s1.getMark() < s2.getMark()) {
            System.out.println("s2 has higher marks");
        }*/
    }
}
// TestStudent class ends here
