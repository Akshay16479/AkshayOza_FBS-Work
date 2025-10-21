package assignment5;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,j=0,k=0;
		
		for(i=1;i<=5;i++)
		{
			for(k=5;k>=i;k--)
			{
				System.out.printf(" ");
			}
			
			for(j=1;j<=i;j++)
			{
				System.out.printf("* ");
			}
			System.out.printf("\n");
		}
	}

}
