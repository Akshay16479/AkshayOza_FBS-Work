class Book {
    int isbn;
    String name;
    String category;
    double price;

    //getter
   
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

     //display

      void display(){
      System.out.println("Book ISBN : " + this.isbn);
        System.out.println("Book Name : " + this.name);
        System.out.println("Book Category : " + this.category);
        System.out.println("Book Price : " + this.price);
      
}


}
// class Book ends here


class test {
    public static void main(String[] args) { 
        Book b1;          // reference
        b1 = new Book();  // object creation

        b1.setisbn(12345);
        b1.setname("Java Programming");
        b1.setcategory("Education");
        b1.setprice(499.99);
        
        b1.display();
        
    }
}
// class testBook ends here
