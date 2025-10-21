package assignment4;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int no=25;                   //prime no 
		
		
		for(int j=1; j<=no; j++) 
		{
			int count=0;
			
			for(int i=1; i<=j; i++) 
			{
				if(j%i==0)
					count++;
			}
			
			if(count==2)
				System.out.printf("\n%d",j);

		}

	}

}
