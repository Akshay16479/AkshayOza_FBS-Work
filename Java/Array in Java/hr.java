class Hr {
    int id;
    String name;
    int commission;
    double salary;


//default constructor

Hr(){
System.out.println("contructor called");

this.id=369;
this.name="akshu";
this.commission=5010;
this.salary=56000;

}

//parameterized constructor

Hr(int d,String m,int y,double s){
System.out.println("parameterized constructor called");

this.id=d;
this.name=m;
this.commission=y;
this.salary=s;

}


    // Setters
    void setId(int i) {
        this.id = i;
    }

    void setName(String s) {
        this.name = s;
    }

    void setCommission(int a) {
        this.commission = a;
    }

    void setSalary(double sl) {
        this.salary = sl;
    }

    // Getter
    double getSalary() {
        return this.salary;
    }

    int getCommission() {
        return this.commission;
    }

    String getName() {
        return this.name;
    }

    int getId() {
        return this.id;
    }

    // Display Method
    void display() {
        System.out.println("HR ID : " + this.id);
        System.out.println("HR Name : " + this.name);
        System.out.println("HR Commission : " + this.commission);
        System.out.println("HR Salary : " + this.salary);
    }
}
// Hr class ends here


class test {
    public static void main(String[] args) {

        Hr arr[] = new Hr[3];

        arr[0] = new Hr();
        arr[1] = new Hr(101,"akshay",4587,34000);
      
        for(int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
