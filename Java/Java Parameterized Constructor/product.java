class Product {
    int id;
    String name;
    double price;
    int quantity;


//default constructor

Product(){
System.out.println("contructor called");

this.id=363;
this.name="akshu";
this.price=2099;
this.quantity=6;

}

//parameterized constructor

Product(int d,String m,double y,int s){
System.out.println("parameterized constructor called");

this.id=d;
this.name=m;
this.price=y;
this.quantity=s;

}


    // Setters
    void setId(int i) {
        this.id = i;
    }

    void setName(String n) {
        this.name = n;
    }

    void setPrice(double p) {
        this.price = p;
    }

    void setQuantity(int q) {
        this.quantity = q;
    }

    // Getters
       double getPrice() {
        return this.price;
    }

    
    // Display Method
    void display() {
        System.out.println("Product ID : " + this.id);
        System.out.println("Product Name : " + this.name);
        System.out.println("Product Price : " + this.price);
        System.out.println("Product Quantity : " + this.quantity);
    }
}
// Product class ends here


class test {
    public static void main(String[] args) {

        Product p1 = new Product();
        Product p2 = new Product(215,"mobile",30000,6);

        /*p1.setId(101);
        p1.setName("Laptop");
        p1.setPrice(55000.75);
        p1.setQuantity(3);

        p2.setId(102);
        p2.setName("Desktop");
        p2.setPrice(65000.50);
        p2.setQuantity(2);*/

        // Display both products
        p1.display();
        p2.display();


        /*if (p1.getPrice() > p2.getPrice()) {
            System.out.println("p1 product is costlier");
        } else if (p1.getPrice() < p2.getPrice()) {
            System.out.println("p2 product is costlier");
        } else {
            System.out.println("Both products have equal price");
        }*/
    }
}
// TestProduct class ends here
