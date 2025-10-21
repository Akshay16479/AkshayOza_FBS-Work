package assignment4;

public class Question3 {
	public static void main(String args[])
	{
		int i,j,n=25;                    //perfect no
		int sum=0;
	

		for (j=1; j<=n; j++) 
		{
			sum=0;

			for(i=1; i<j; i++) 
			{
				if(j%i==0)
					sum=sum+i;
			}


			if(sum==j)
				System.out.printf("%d\n",j);

		}
		
	}

}
