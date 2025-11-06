class Student {
    int rollno;
    String name;
    int mark;


//setter

    void setrollno(int r) { 
        this.rollno = r;
    }

    void setname(String n) { 
        this.name = n;
    }

    void setmark(int m) { 
        this.mark = m;
    }


    // Display 

    void display() {
        System.out.println("Student Roll No : " + this.rollno);
        System.out.println("Student Name : " + this.name);
        System.out.println("Student Mark : " + this.mark);

    }
}

// class Student ends here


class test {
    public static void main(String[] args) { 
        Student s1 = new Student(); // object creation

        s1.setrollno(21);
        s1.setname("Akshay");
        s1.setmark(89);

       
        s1.display();

    }
}
// class testStudent ends here
