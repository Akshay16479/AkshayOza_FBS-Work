class Book {
    int isbn;
    String name;
    String category;
    double price;

//default constructor

Book(){
System.out.println("contructor called");

this.isbn=3694;
this.name="java programming";
this.category="coding";
this.price=799;

}



    // Setters
    void setIsbn(int d) {
        this.isbn = d;
    }

    void setName(String m) {
        this.name = m;
    }

    void setCategory(String y) {
        this.category = y;
    }

    void setPrice(double s) {
        this.price = s;
    }

    // Getters
    int getIsbn() {
        return this.isbn;
    }

    String getName() {
        return this.name;
    }

    String getCategory() {
        return this.category;
    }

    double getPrice() {
        return this.price;
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

        Book b, c;      // reference
        b = new Book(); // objects
        c = new Book();

        /*b.setIsbn(2113);
        b.setName("abcde");
        b.setCategory("science");
        b.setPrice(799);

        c.setIsbn(3213);
        c.setName("efghi");
        c.setCategory("fiction");
        c.setPrice(259);*/

        // Display both books
        b.display();
        c.display();

        // Compare prices
        if (b.getPrice() > c.getPrice()) {
            System.out.println("b book is costlier");
        } else {
            System.out.println("c book is costlier");
        }
    }
}
// testBook class ends here
