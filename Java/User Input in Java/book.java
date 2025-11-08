import java.util.Scanner;

class Book {
    int isbn;
    String name;
    String category;
    double price;

    // default constructor
    Book() {
        System.out.println("constructor called");

        this.isbn = 3694;
        this.name = "java programming";
        this.category = "coding";
        this.price = 799;
    }

    // parameterized constructor
    Book(int d, String m, String y, double s) {
        System.out.println("parameterized constructor called");

        this.isbn = d;
        this.name = m;
        this.category = y;
        this.price = s;
    }

    // Display method
    void display() {
        System.out.println("Book ISBN : " + this.isbn);
        System.out.println("Book Name : " + this.name);
        System.out.println("Book Category : " + this.category);
        System.out.println("Book Price : " + this.price);
    }
}
// Book class ends here


class test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ISBN : ");
        int isbn = sc.nextInt();

        sc.nextLine(); // buffer clear

        System.out.println("Enter Name : ");
        String name = sc.nextLine();

        System.out.println("Enter Category : ");
        String category = sc.nextLine();

        System.out.println("Enter Price : ");
        double price = sc.nextDouble();

        Book b1 = new Book(isbn, name, category, price);
        Book b2 = new Book();

        b1.display();
        b2.display();
    }
}
// testBook class ends here
