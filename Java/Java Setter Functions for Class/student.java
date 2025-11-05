class Student {
    int rollno;
    String name;
    int mark;

    void setrollno(int r) { 
        this.rollno = r;
    }

    void setname(String n) { 
        this.name = n;
    }

    void setmark(int m) { 
        this.mark = m;
    }
} 
// class Student ends here


class testStudent {
    public static void main(String[] args) { 
        Student s1;         // reference
        s1 = new Student(); // object creation

        s1.setrollno(21);
        s1.setname("Akshay");
        s1.setmark(89);

        System.out.println("Student Roll No : " + s1.rollno);
        System.out.println("Student Name : " + s1.name);
        System.out.println("Student Mark : " + s1.mark);
    }
}
// class testStudent ends here
