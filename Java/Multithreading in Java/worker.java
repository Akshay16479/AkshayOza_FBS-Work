package Threading;//

 class Worker1 extends Thread {

	@Override
	public void run() {
		String str="1234567891234567891234567";
		for (int i = 0; i < str.length(); i++) {
			System.out.print(" "+str.charAt(i));
			
	}
}
}//class ends
 
 
 class Worker2 extends Thread {

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
		Worker2 w2=new Worker2();

		w1.start();
		w2.start();		
		String str="abcdefghjklmnopqrstuvwxyzabcdefgh";
		for (int i = 0; i < str.length(); i++) {
			System.out.print(" "+str.charAt(i));
			
	}
}
	
}

