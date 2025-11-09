class Printer {

void print(){
System.out.println("Hello this is void");}

void print(int d){
System.out.println(d);}

void print(char ch){
System.out.println(ch);}

void print(String str){
System.out.println(str);}

}
//class ends here

class test {

public static void main(String [] args) {

Printer p1;         //reference
p1=new Printer();   //object

p1.print();
p1.print(10);
p1.print('a');
p1.print("Akshay");

}
//main ends here
}
//class ends here


