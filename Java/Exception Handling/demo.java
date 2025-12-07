package practiceworkjava;

public class demo {
       

	 public static void main (String [] args) {
		 
		 try {
			 int a=10;
			 int b=0;
			 if(args.length<2) {
				 throw new ArrayIndexOutOfBoundsException();
			 }
			 
			 if(b==0) {
				 throw new ArithmeticException();
			 }else {
				 int c=a/b;;
				 System.out.println(c); 
			 }
			 
			
			 
		 } catch( ArithmeticException a) {
		 System.out.println("bhai galt kiya tu !!!");
		 }
		 
		 catch(ArrayIndexOutOfBoundsException b) {
		 System.out.println("bhai abhi bhi galt dal raha tu !!!");
		 }
		 
	 }
	
	
	
	
}
