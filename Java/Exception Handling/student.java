package practiceworkjava;//

public class student {
    int roll;
    String name;
    int mark;

    student(int roll, String name, int mark) {
        super();
        this.roll = roll;
        this.name = name;
        this.mark = mark;
    }

    void calculateGrade() throws InvalidMarkException {
        
        if (this.mark < 0) {
            throw new InvalidMarkException();
        }

        else if (mark < 35) {
            System.out.println("Fail");
        } 
        else if (mark >= 35 && mark <= 49) {
            System.out.println("Pass");
        } 
        else if (mark >= 50 && mark <= 59) {
            System.out.println("Second Class");
        } 
        else if (mark >= 60 && mark <= 74) {
            System.out.println("First Class");
        } 
        else if (mark >= 75) {
            System.out.println("Distinction");
        }
    }
}




public class testValidMarks {
    public static void main(String[] args) {

        student s1 = new student(111, "Akshay", -85);  

        try {
            s1.calculateGrade();
        } catch (InvalidMarkException e) {
            e.printStackTrace();
        }
    }
}

