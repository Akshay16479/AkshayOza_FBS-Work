package assignment4;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n=25, j, temp, digit, count, sum;

		 

		    for (j = 1; j <= n; j++)
			{
		        temp = j;
		        count = 0;
		        sum = 0;

		        // count digits
		        while (temp > 0) 
				{
		            temp = temp / 10;
		            count++;
		        }

		        temp = j;

		        // calculate sum of digits^count
		        while (temp > 0) 
				{
		            digit = temp % 10;
		            sum = sum + (int) Math.pow(digit, count);

		            temp = temp / 10;
		        }

		        if (sum == j)
		            System.out.printf("%d ", j);
		    }
	}

}
