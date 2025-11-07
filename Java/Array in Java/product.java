class Product {
    int id;
    String name;
    double price;
    int quantity;

    // Default constructor
    Product() {
        System.out.println("Constructor called");
        this.id = 363;
        this.name = "akshu";
        this.price = 2099;
        this.quantity = 6;
    }

    // Parameterized constructor
    Product(int d, String m, double y, int s) {
        System.out.println("Parameterized constructor called");
        this.id = d;
        this.name = m;
        this.price = y;
        this.quantity = s;
    }

    // Setters
    void setId(int i) { this.id = i; }
    void setName(String n) { this.name = n; }
    void setPrice(double p) { this.price = p; }
    void setQuantity(int q) { this.quantity = q; }

    // Getter
    double getPrice() { return this.price; }

    // Display Method
    void display() {
        System.out.println("Product ID : " + this.id);
        System.out.println("Product Name : " + this.name);
        System.out.println("Product Price : " + this.price);
        System.out.println("Product Quantity : " + this.quantity);
    }
}

// Test class
class test {
    public static void main(String[] args) {

        Product arr[] = new Product[3];

        arr[0] = new Product();
        arr[1] = new Product(101, "Akshay", 2500, 6);
        
        for (int i = 0; i < arr.length; i++) {
           System.out.println(arr[i]);
        }
    }
}
