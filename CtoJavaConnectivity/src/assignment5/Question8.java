package assignment5;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,j=0;
		
		for(i=1;i<=4;i++)      // increasing part
		{	
			for(j=1;j<=i;j++)
			{
				System.out.printf("*");	
			}
			System.out.printf("\n");
		}
		
		for(i=3; i>=1; i--)   // decreasing part
	    {
	        for(j=1; j<=i; j++)
	        {
	        	System.out.printf("*");
	        }
	        System.out.printf("\n");
	    }

	}

}
