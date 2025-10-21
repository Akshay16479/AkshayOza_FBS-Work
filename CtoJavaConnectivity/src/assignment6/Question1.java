package assignment6;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 28;

	    // Function call
	    int res = check(num);

	    if(res == 1)
	        System.out.printf("No is Perfect Number");
	    else
	       System.out.printf("No is Not Perfect Number");
	}

	// Function definition
	static int check(int num )
	{
	    int i = 1, sum = 0;

	    while (i < num)
	    {
	        if (num % i == 0)
	            sum = sum + i;
	        i++;
	    }

	    if (num == sum)
	        return 1;   // Perfect Number
	    else
	        return 0;   // Not Perfect Number
	}
	}


