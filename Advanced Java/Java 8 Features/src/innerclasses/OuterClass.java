package innerclasses;            //simple inner class

public class OuterClass {
	
	private int val=100;
	
	public void print()
	{
		System.out.println(val);
		
	}
	
	
	//1.simple inner class
	class InnerClass                    //simple inner class
	{
		private int ival=50;
		
		public void iprint()
		{
			System.out.println(ival);
			System.out.println(val);             //inner class can access outer class methd/variable
		}                                         //outer class cannot directly  access data of inner class
	}
	

	
	//2.static inner class
	static class StaticInnerClass
	{
		private static int sval=500;      //simple innr class wont allow static declaration  but static class allows
		
		public static void sPrint()     //class specific method
		{
			System.out.println(sval);
		}
		public void test()               //object specific method
		{
			System.out.println(sval);

		}
		
		
	}
	
	
	//3.method local inner class
	public  void amethod()
	{
		int data=333;
		
		class A                         //scope of class is withi  method only
		{
			private int adata=666;
			
		public void mprint()
		{
			System.out.println(adata);
		}
			
		}
		
		A a1 =new A();
		a1.mprint();
		
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		//simple inner class
		OuterClass o1=new OuterClass();
		o1.print();
		InnerClass i1= o1.new InnerClass();
		i1.iprint();
		
		//static inner class
		StaticInnerClass s=new StaticInnerClass();
		s.test();
		s.sPrint();
		StaticInnerClass.sPrint();
		
		
	}

}
