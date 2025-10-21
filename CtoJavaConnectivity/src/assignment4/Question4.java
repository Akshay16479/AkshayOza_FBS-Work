package assignment4;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int choice=2, num=28, i, rev, temp, sum, p, count;


		    // Using if-else 
		    if(choice == 1) 
			{
		        // Even or Odd
		        if(num % 2 == 0)
		        	 System.out.printf("%d is Even\n", num);
		        else
		        	 System.out.printf("%d is Odd\n", num);

		    } 
			else if(choice == 2) 
			{
		        // Prime check
		        count = 0;
		        for(i = 1; i <= num; i++) 
				{
		            if(num % i == 0)
		                count++;
		        }
		        if(count == 2)
		        	 System.out.printf("%d is Prime\n", num);
		        else
		        	 System.out.printf("%d is Not Prime\n", num);

		    } 
			else if(choice == 3) 
			{
		        // Palindrome check
		        rev = 0;
		        temp = num;
		        while(temp > 0) 
				{
		            p = temp % 10;
		            rev = rev * 10 + p;
		            temp = temp / 10;
		        }
		        if(rev == num)
		        	 System.out.printf("%d is Palindrome\n", num);
		        else
		        	 System.out.printf("%d is Not Palindrome\n", num);

		    } 
			else if(choice == 4)
			 {
		        // Positive, Negative or Zero
		        if(num > 0)
		        	 System.out.printf("%d is Positive\n", num);
		        else if(num < 0)
		        	 System.out.printf("%d is Negative\n", num);
		        else
		        	 System.out.printf("The number is Zero\n");

		    }
			 else if(choice == 5) 
			 {
		        // Reverse number
		        rev = 0;
		        temp = num;
		        while(temp > 0) 
				{
		            p = temp % 10;
		            rev = rev * 10 + p;
		            temp = temp / 10;
		        }
		        System.out.printf("Reverse of %d is %d\n", num, rev);

		    } 
			else if(choice == 6) 
			{
		        // Sum of digits
		        sum = 0;
		        temp = num;
		        while(temp > 0)
				 {
		            p = temp % 10;
		            sum=sum+p;
		            temp = temp / 10;
		        }
		        System.out.printf("Sum of digits of %d is %d\n", num, sum);

		    } 
			
			else 
			{
				 System.out.printf("Invalid Choice!\n");
		    }
	}

}
