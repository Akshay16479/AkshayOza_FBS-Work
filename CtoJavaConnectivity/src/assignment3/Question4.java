package assignment3;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 153,temp, p, arm = 0;

	    temp=num;
		  // keep original number safe

	    while (temp > 0)
	    {
	        p = temp% 10;   //  last digit
	        arm = arm + (p * p * p);  // cube and add
	        temp=temp/10;           // decrease no by digit by digit
	    }

	    if (num == arm)
	        System.out.printf("No is Armstrong");
	    else
	        System.out.printf("No is Not Armstrong");
	}

}
