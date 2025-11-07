class emp {
    int id;
    String name;
    int salary;

    // Default constructor
    emp() {
        System.out.println("Default constructor called");
        this.id = 0;
        this.name = "Not Set";
        this.salary = 0;
    }

    // Parameterized constructor
    emp(int id, String name, int salary) {
        System.out.println("Parameterized constructor called");
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Setters
    void setId(int id) {
        this.id = id;
    }

    void setName(String name) {
        this.name = name;
    }

    void setSalary(int salary) {
        this.salary = salary;
    }

    // Getters
    int getId() {
        return this.id;
    }

    String getName() {
        return this.name;
    }

    int getSalary() {
        return this.salary;
    }

    // Display Method
    void display() {
        System.out.println("ID : " + this.id);
        System.out.println("Name : " + this.name);
        System.out.println("Salary : " + this.salary);
    }
}
class test {
    public static void main(String[] args) {

        emp arr[] = new emp[3];

        arr[0] = new emp();
        arr[1] = new emp(101,"Akshay",25000);

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
