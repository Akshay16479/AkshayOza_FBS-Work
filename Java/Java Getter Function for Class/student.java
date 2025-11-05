class Student {
    int rollNo;
    String name;
    int mark;

    void setRollNo(int r) {
        this.rollNo = r;
    }

    void setName(String n) {
        this.name = n;
    }

    void setMark(int m) {
        this.mark = m;
    }

    int getMark() {
        return this.mark;
    }
}
// Student class ends here

class TestStudent {
    public static void main(String[] args) {

        Student s1, s2;
        s1 = new Student();
        s2 = new Student();

        s1.setRollNo(21);
        s1.setName("Akshay");
        s1.setMark(89);

        s2.setRollNo(22);
        s2.setName("Rohit");
        s2.setMark(95);

       
        if (s1.getMark() > s2.getMark()) {
            System.out.println("s1 has higher marks");
        } else if (s1.getMark() < s2.getMark()) {
            System.out.println("s2 has higher marks");
        } 
    }
}
// TestStudent class ends here
