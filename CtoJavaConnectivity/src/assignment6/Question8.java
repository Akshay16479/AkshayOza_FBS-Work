package assignment6;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result;

	    result = checkDivisible();   // function call

	    if (result == 1)
	        System.out.printf("Number is Divisible by 3 and 5");
	    else if (result == 2)
	        System.out.printf("Number is Divisible by 3");
	    else if (result == 3)
	        System.out.printf("Number is Divisible by 5");
	    else
	        System.out.printf("Number is Not Divisible");
	}

	static int checkDivisible()   // function definition
	{
	    int num=15;
	  

	    if (num % 3 == 0 && num % 5 == 0)
	        return 1;
	    else if (num % 3 == 0)
	        return 2;
	    else if (num % 5 == 0)
	        return 3;
	    else
	        return 4;
	}

}
