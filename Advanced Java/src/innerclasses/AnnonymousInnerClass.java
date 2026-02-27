package innerclasses;


interface servicing
{
	public void repair();
}




public class AnnonymousInnerClass {                 //4 . annonymous inner class

	public static void main(String[] args) {
		
		
		
  //Annonymous Inner Class originating from interface
		
		servicing s = new servicing() {
			
			@Override
			public void repair() {
				System.out.println("seat cover changed");
				
			}
		};s.repair();
				
				
		
		
		
		
		//Annonymous Inner Class originating from abstract class
		
		carcosmatics c = new carcosmatics() {
			
			@Override
			void changeColor(String color) {
				System.out.println("mechanic changed car color to : " + color);
				
			}
		};c.changeColor("Black");
		
		
	}

}






abstract class carcosmatics
{
	String color;
	abstract void changeColor(String color);
}
