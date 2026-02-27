@FunctionalInterface
interface Calculator {
    void add(int a, int b);
    
}


 class Main {
    public static void main(String[] args) {

//    	Calculator c=new Calculator() {             //annonymous inner class 
//			
//			@Override
//			public void add(int a, int b) {           
//				int c=a+b;
//				System.out.println("calculation is : " + c );
//				
//			}
//		};c.add(10, 10);
    	
    	
    	//lambda expression
    	
    	Calculator c =(a,b) -> System.out.println("calculation is : " + (a + b));
    	c.add(10, 10);
    	
    	
    	
    	
    	
    }
}