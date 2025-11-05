class Book {
    int isbn;
    String name;
    String category;
    double price;

    void setisbn(int i) { 
        this.isbn = i;
    }

    void setname(String n) { 
        this.name = n;
    }

    void setcategory(String c) { 
        this.category = c;
    }

    void setprice(double p) { 
        this.price = p;
    }
}
// class Book ends here


class testBook {
    public static void main(String[] args) { 
        Book b1;          // reference
        b1 = new Book();  // object creation

        b1.setisbn(12345);
        b1.setname("Java Programming");
        b1.setcategory("Education");
        b1.setprice(499.99);

        System.out.println("Book ISBN : " + b1.isbn);
        System.out.println("Book Name : " + b1.name);
        System.out.println("Book Category : " + b1.category);
        System.out.println("Book Price : " + b1.price);
    }
}
// class testBook ends here
