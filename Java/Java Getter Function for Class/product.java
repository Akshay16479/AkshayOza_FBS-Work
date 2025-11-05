class Product {
    int id;
    String name;
    double price;
    int quantity;

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

    double getPrice() {
        return this.price;
    }
}
// Product class ends here

class TestProduct {
    public static void main(String[] args) {

        Product p1, p2;
        p1 = new Product();
        p2 = new Product();

        p1.setId(101);
        p1.setName("Laptop");
        p1.setPrice(55000.75);
        p1.setQuantity(3);

        p2.setId(102);
        p2.setName("Desktop");
        p2.setPrice(65000.50);
        p2.setQuantity(2);

       
        if (p1.getPrice() > p2.getPrice()) {
            System.out.println("p1 product is costlier");
        } else if (p1.getPrice() < p2.getPrice()) {
            System.out.println("p2 product is costlier");
        } else {
            System.out.println("Both products have equal price");
        }
    }
}
// TestProduct class ends here
