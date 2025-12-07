package practiceworkjava;


interface mall
{
	void discount();
}

 
public class fashionmall implements mall {

	@Override
	public void discount() 
	{
		System.out.println("20% discount!");
	}
}

class testmall{
	public static void main(String[] args) {
		mall m1=new fashionmall();
		m1.discount();
		mall m2=new fashionmall();
		m2.discount();
		
		new mall()                        
		{
			@Override               
			public void discount() {
				System.out.println("50% discount!");
			}
			
		}.discount();;
		
		/*mall m3=new mall() {

			@Override
			public void discount() {
				System.out.println("50% discount!");
				
			}
		};
		m3.discount(); */
		
		
	}
}