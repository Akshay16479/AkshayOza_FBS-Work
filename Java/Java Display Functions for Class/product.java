class Product {
    int id;
    String name;
    double price;
    int quantity;

    void setid(int i) { 
        this.id = i;
    }

    void setname(String n) { 
        this.name = n;
    }

    void setprice(double p) { 
        this.price = p;
    }

    void setquantity(int q) { 
        this.quantity = q;
    }



    // Display method

    void display() {
        System.out.println("Product ID : " + this.id);
        System.out.println("Product Name : " + this.name);
        System.out.println("Product Price : " + this.price);
        System.out.println("Product Quantity : " + this.quantity);


    }
}
// class Product ends here


class test {
    public static void main(String[] args) { 
        Product p1;          // reference
        p1 = new Product();  // object creation

        p1.setid(101);
        p1.setname("Laptop");
        p1.setprice(55000.75);
        p1.setquantity(3);

        p1.display();
    }
}
// class testProduct ends here
