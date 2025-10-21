package assignment6;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;

	    // Function call
	    int sum = sumRange(num, 5);
	    System.out.printf("%d", sum);
	}

	// Function definition
	static int sumRange(int num, int constant )
	{
	    int sum = 0;

	    while (num <= constant)
	    {
	        sum = sum + num;
	        num++;
	    }

	    return sum;
	}

}
