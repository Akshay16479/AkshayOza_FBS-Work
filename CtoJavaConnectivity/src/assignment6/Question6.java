package assignment6;

public class Question6 {

	public static void main(String[] args) {
		 int num=52;
		   
		    check(num);
		}

		static void check(int num)
		{
		    if (num % 3 == 0 && num % 5 == 0)
		    {
		        System.out.printf("Number is Divisible by 3 and 5");
		    }
		    else if (num % 3 == 0)
		    {
		    	System.out.printf("Number is Divisible by 3");
		    }
		    else if (num % 5 == 0)
		    {
		    	System.out.printf("Number is Divisible by 5");
		    }
		    else
		    {
		    	System.out.printf("Number is Not Divisible");
		    }
	}

}
