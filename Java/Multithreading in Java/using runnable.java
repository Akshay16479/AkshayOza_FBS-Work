package Threading;

 class Worker1 implements Runnable {

	@Override
	public void run() {
		String str="1234567891234567891234567";
		for (int i = 0; i < str.length(); i++) {
			System.out.print(" "+str.charAt(i));
			
	}
}
}//class ends
 
 
 class Worker2 implements Runnable {

		@Override
		public void run() {
			String str="ABCDEFGHIJKLMNOPJKSJEFBNFSREIJGNR";
			for (int i = 0; i < str.length(); i++) {
				System.out.print(" "+str.charAt(i));
				
		}
	}
	}//class ends	
 

class Test{
	public static void main(String[] args) {
		
		Worker1 w1=new Worker1();
		Thread t=new Thread(w1);
		t.start();

		Worker2 w2=new Worker2();
		Thread a=new Thread(w2);
		a.start();		
		
		String str="abcdefghjklmnopqrstuvwxyzabcdefgh";
		for (int i = 0; i < str.length(); i++) {
			System.out.print(" "+str.charAt(i));
			
	}
}
	
}
