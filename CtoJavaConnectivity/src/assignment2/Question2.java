package assignment2;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5,b=10,c=20;
		
		
		
		if(a==b&&b==c)
		{
			System.out.printf("Triangle is Equilateral Triangle");
		}
		else if(a==b&&b!=c||b==c&&c!=a||a==c&&c!=b)
		{ 
			System.out.printf("Triangle is Isosceles Triangle");
		}
		
	    else
	    {
	    	System.out.printf("Triangle is Scalene Triangle");
		}


		
		
	}

}
