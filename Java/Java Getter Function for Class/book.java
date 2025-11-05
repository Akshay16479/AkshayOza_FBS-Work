class Book {
int isbn;
String name;
String category;
double price;

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


    double getPrice(){
     return this.price; }

}
//Book class ends here

class testBook {
   public static void main(String [] args){

    Book b,c;        //reference
   b=new Book();     //objects
   c=new Book();

   b.setIsbn(2113);
   b.setName("abcde");
   b.setCategory("science");
   b.setPrice(799);
    
   c.setIsbn(3213);
   c.setName("efghi");
   c.setCategory("fiction");
   c.setPrice(259);

    
   if(b.getPrice()>c.getPrice()) {
   System.out.println("b books is costier");}

}
//main ends here
}
//testbook class ends here
