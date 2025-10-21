package assignment5;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,j=0,k=0;
		
		for(i=1;i<=5;i++)     
		{	
			for(j=1;j<=5;j++)
			{
				if(i==1||j==1||i==5||j==5||i==j)
				System.out.printf("* ");	
				else
					System.out.printf("  ");
			}
			System.out.printf("\n");
		}
		
	}

}
