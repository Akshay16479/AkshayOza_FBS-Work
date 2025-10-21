package assignment6;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    int num = 5;

	    // Function call
	    int fact = factorial(num);
	    System.out.printf("%d", fact);
	}

	// Function definition
	static int factorial(int num)
	{
	    int i = 1;
	    int fact = 1;

	    for (num=5; i <= num; i++)
	    {
	        fact = fact * i;
	    }

	    return fact;
	}

}
