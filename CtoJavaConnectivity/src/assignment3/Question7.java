package assignment3;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12345;
		int first,last,sum;

		last=num%10;
		
	  
		while(num>=10)
		{
			num=num/10;
		}
		
		first=num;
		sum=last+first;
		
		System.out.printf("%d",sum);
	}

}
