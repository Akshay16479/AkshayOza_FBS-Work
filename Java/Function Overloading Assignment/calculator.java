class Calculate {

//add
void add(int a,int b){
System.out.println("Fun1");
System.out.println(a+b);}

void add(int a,double b){
System.out.println("Fun2");
System.out.println(a+b);}

void add(double a,int b){
System.out.println("Fun3");
System.out.println(a+b);}

void add(double a,double b){
System.out.println("Fun4");
System.out.println(a+b);}


//sub
void sub(int a,int b){
System.out.println("Fun1");
System.out.println(a-b);}

void sub(int a,double b){
System.out.println("Fun2");
System.out.println(a-b);}

void sub(double a,int b){
System.out.println("Fun3");
System.out.println(a-b);}

void sub(double a,double b){
System.out.println("Fun4");
System.out.println(a-b);}


//mul
void mul(int a,int b){
System.out.println("Fun1");
System.out.println(a*b);}

void mul(int a,double b){
System.out.println("Fun2");
System.out.println(a*b);}

void mul(double a,int b){
System.out.println("Fun3");
System.out.println(a*b);}

void mul(double a,double b){
System.out.println("Fun4");
System.out.println(a*b);}


//div
void div(int a,int b){
System.out.println("Fun1");
System.out.println(a/b);}

void div(int a,double b){
System.out.println("Fun2");
System.out.println(a/b);}

void div(double a,int b){
System.out.println("Fun3");
System.out.println(a/b);}

void div(double a,double b){
System.out.println("Fun4");
System.out.println(a/b);}


}
//class ends here

class test {

public static void main(String [] args) {

Calculate c;         //reference
c=new Calculate();   //object

c.add(5,5);
c.add(10,2.1);
c.add(3.5,7);
c.add(10.5,9.5);

c.sub(5,5);
c.sub(10,2.1);
c.sub(3.5,7);
c.sub(10.5,9.5);

c.mul(5,5);
c.mul(10,2.1);
c.mul(3.5,7);
c.mul(10.5,9.5);

c.div(5,5);
c.div(10,2.1);
c.div(3.5,7);
c.div(10.5,9.5);

}
//main ends here
}
//class ends here


