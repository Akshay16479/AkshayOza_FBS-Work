package assignment5;

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int j=0;
		
		for(i=1;i<=4;i++)     
		{	
			for(j=1;j<=4;j++)
			{
				if(i==1||j==1||i==4||j==4)
				System.out.printf("* ");	
				else
					System.out.printf("  ");
			}
			System.out.printf("\n");
		}
		
	}

}
