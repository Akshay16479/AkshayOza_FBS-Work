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

//parameterized constructor

Book(int d,String m,String y,double s){
System.out.println("parameterized constructor called");

this.isbn=d;
this.name=m;
this.category=y;
this.price=s;

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

        Book arr[] = new Book[3];

        arr[0] = new Book();
        arr[1] = new Book(1017,"wings of fire","fiction",250);

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

