package assignment6;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    int num = 12345;

	    // Function call
	    int sum = sumDigit(num);
	    System.out.printf("%d", sum);
	}

	// Function definition
	static int sumDigit(int num)
	{
	    int last_digit, first_digit, sum = 0;

	    last_digit = num % 10;

	    for (num=12345; num >= 10;)
	    {
	        num = num / 10;
	    }

	    first_digit = num;
	    sum = last_digit + first_digit;

	    return sum;
	}

}
