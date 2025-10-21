package assignment5;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,j=0,k=0;
		for( i=1;i<=5;i++)
	  	{  
		    for(k=1;k<=i;k++)
	  	      { 
	  		  System.out.printf(" ");
		      } 
		    
			for(j=5;j>=i;j--)
			  {
				 System.out.printf("* ");
			  }
			 System.out.printf("\n");
		}	
	}

}
