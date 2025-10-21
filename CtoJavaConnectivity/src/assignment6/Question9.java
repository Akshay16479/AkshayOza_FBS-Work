package assignment6;

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int result=isPrime();
		   if(result==0)
		   System.out.printf("Number is Not Prime");
		   else
		   System.out.printf("Number is Prime");
		}
		 static int isPrime()
		{
			int num = 7;   
		    int i;

		    for (i = 2; i < num;i++)
		    {
		        if (num % i == 0)
		        return 0;
		    }	
				return 1;   
		    
	}

}
